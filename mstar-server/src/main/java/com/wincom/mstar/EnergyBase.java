package com.wincom.mstar;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wincom.mstar.domain.HistoryAI;
import com.wincom.mstar.impl.AlarmAnalysisResponse;
import com.wincom.mstar.impl.EnergyResponse;
import com.wincom.mstar.repository.HistoryAIDayRepository;
import com.wincom.mstar.repository.HistoryAIHourRepository;
import com.wincom.mstar.repository.HistoryAIMinuteRepository;
import com.wincom.mstar.repository.HistoryAIMonthRepository;
import com.wincom.mstar.repository.HistoryAIQuarterRepository;
import com.wincom.mstar.repository.HistoryAIYearRepository;
import com.wincom.mstar.sqlserver.SqlServer;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class EnergyBase {
	Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private HistoryAIYearRepository historyAIYearRepository;
	@Autowired
	private HistoryAIMonthRepository historyAIMonthRepository;
	@Autowired
	private HistoryAIDayRepository historyAIDayRepository;
	@Autowired
	private HistoryAIHourRepository historyAIHourRepository;
	@Autowired
	private HistoryAIMinuteRepository historyAIMinuteRepository;
	@Autowired
	private HistoryAIQuarterRepository historyAIQuarterRepository;

	public String getCurveSignal(Map<Integer,HistoryDataObj> map,String devId)
	{
		String sql = String.format("SELECT b.DataObjID as datId,b.DataObjName as datName,a.MaxVal as maxValue,a.MinVal as minValue,a.MeasureMonad as measureMonad  FROM CAIObject a,CDataObject b where a.AIObjID=b.DataObjID and b.DataObjNote like '%%ServerCurveTemp%%'  and b.ParLogObjID="+devId);
		ResultSet rsCfg = null;
		System.out.println(sql);
		SqlServer dbCfg=new SqlServer(0);//读取配置库
		String signalId="";
		if(dbCfg!=null)
		{
			try
			{
				dbCfg.connect();
				int datId;
				String datName,measureMonad;
				double maxValue,minValue;
				rsCfg=dbCfg.executeQuery(sql, rsCfg);
				if(rsCfg==null)
				{
					return "0";
				}
				DecimalFormat df= new DecimalFormat("0");
				int count=0;
				while(rsCfg.next())
				{
					datId=rsCfg.getInt("datId");
					datName=rsCfg.getString("datName");
					measureMonad=rsCfg.getString("measureMonad");
					maxValue=rsCfg.getDouble("maxValue");
					minValue=rsCfg.getDouble("minValue");
					HistoryDataObj tmp=new HistoryDataObj();
					tmp.setSerial(new Integer(datId).toString());
					tmp.setMetric(measureMonad);
					tmp.setName(datName);
					tmp.getRange().add(new Double(df.format(minValue)).longValue());
					tmp.getRange().add(new Double(df.format(maxValue)).longValue());
					map.put(new Integer(datId), tmp);
					if(count==0)
					{
						signalId=signalId+datId;
					}
					else
					{
						signalId=signalId+","+datId;
					}
					count++;
				}
			}
			catch(SQLException e)
			{
				dbCfg.close();
				e.printStackTrace();
			}
			dbCfg.close();
		}
		if(signalId.compareToIgnoreCase("")==0)
		{
			signalId="0";
		}
		return signalId;
	}
	public String getCurve(String devId,EnergyResponse response)
	{
		String tabName="BAIHistoryHour";
		String sql="";
		Map<Integer,HistoryDataObj> map =new HashMap<Integer, HistoryDataObj>();
		String signalId=getCurveSignal(map,devId);
		LocalDateTime localtDateAndTime = LocalDateTime.now(); 
		DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("yyyy-MM-dd 00:00:00");
		String startTime=localtDateAndTime.format(formatter1); 
		String dbName="";
		dbName=getHisDbName(startTime);
		sql="select DataObjID,CurrentValue,RecordTime from "+tabName+" where DataObjID in("+signalId+") and RecordTime>='"+startTime+"'";
		getHisDataFromMstar(dbName,sql,map);
		HistoryDataObj value;
		for (Integer key : map.keySet()) {  
		    value = map.get(key);
		    value.setData_num(value.getData().size());
		    response.getTrend_data().put(value.getSerial(),value);
		}
		String str="";
		return str;
	}
	public String getEnergy(String serial,int type,int timeType,String startTime,String endTime,EnergyResponse response)
	{
		String sql="";
		String tabName="BEnergyMinute";
		/*switch(timeType)
		{
		case 0://年
			tabName="BEnergyYear";
			sql="select AreaId,TotalPower,ItDevlPower,CoolingPower,RefrigerationPower,LightingPower,OtherPower,PUE,RecordTime from "+tabName+" where AreaId="+serial+" and RecordTime>='"+startTime+"' and RecordTime<='"+endTime+"'";
			break;
		case 1://月
			tabName="BEnergyMonth";
			sql="select AreaId,TotalPower,ItDevlPower,CoolingPower,RefrigerationPower,LightingPower,OtherPower,PUE,RecordTime from "+tabName+" where AreaId="+serial+" and RecordTime>='"+startTime+"' and RecordTime<='"+endTime+"'";
			break;
		case 2://日
			tabName="BEnergyDay";
			sql="select AreaId,TotalPower,ItDevlPower,CoolingPower,RefrigerationPower,LightingPower,OtherPower,PUE,RecordTime from "+tabName+" where AreaId="+serial+" and RecordTime>='"+startTime+"' and RecordTime<='"+endTime+"'";
			break;
		case 3://时
			tabName="BEnergyHour";
			sql="select AreaId,TotalPower,ItDevlPower,CoolingPower,RefrigerationPower,LightingPower,OtherPower,PUE,RecordTime from "+tabName+" where AreaId="+serial+" and RecordTime>='"+startTime+"' and RecordTime<='"+endTime+"'";
			break;
		case 4://分
			tabName="BEnergyMinute";
			sql="select AreaId,TotalPower,ItDevlPower,CoolingPower,RefrigerationPower,LightingPower,OtherPower,PUE,RecordTime from "+tabName+" where AreaId="+serial+" and RecordTime>='"+startTime+"' and RecordTime<='"+endTime+"'";
			break;
		case 5://分
			tabName="BEnergy1Minute";
			sql="select AreaId,TotalPower,ItDevlPower,CoolingPower,RefrigerationPower,LightingPower,OtherPower,PUE,HourAvgPUE,RecordTime from "+tabName+" where AreaId="+serial+" and RecordTime>='"+startTime+"' and RecordTime<='"+endTime+"'";
			break;
		}*/
		switch(timeType)
		{
		case 0://年
			tabName="BEnergyYear";
			sql="select AreaId,TotalDiff,ItDevDiff,CoolingDiff,RefrigerationDiff,LightingDiff,OtherDiff,PUE,RecordTime from "+tabName+" where AreaId="+serial+" and RecordTime>='"+startTime+"' and RecordTime<='"+endTime+"'";
			break;
		case 1://月
			tabName="BEnergyMonth";
			sql="select AreaId,TotalDiff,ItDevDiff,CoolingDiff,RefrigerationDiff,LightingDiff,OtherDiff,PUE,RecordTime from "+tabName+" where AreaId="+serial+" and RecordTime>='"+startTime+"' and RecordTime<='"+endTime+"'";
			break;
		case 2://日
			tabName="BEnergyDay";
			sql="select AreaId,TotalDiff,ItDevDiff,CoolingDiff,RefrigerationDiff,LightingDiff,OtherDiff,PUE,RecordTime from "+tabName+" where AreaId="+serial+" and RecordTime>='"+startTime+"' and RecordTime<='"+endTime+"'";
			break;
		case 3://时
			tabName="BEnergyHour";
			sql="select AreaId,TotalDiff,ItDevDiff,CoolingDiff,RefrigerationDiff,LightingDiff,OtherDiff,PUE,RecordTime from "+tabName+" where AreaId="+serial+" and RecordTime>='"+startTime+"' and RecordTime<='"+endTime+"'";
			break;
		case 4://分
			tabName="BEnergyMinute";
			sql="select AreaId,TotalDiff,ItDevDiff,CoolingDiff,RefrigerationDiff,LightingDiff,OtherDiff,PUE,RecordTime from "+tabName+" where AreaId="+serial+" and RecordTime>='"+startTime+"' and RecordTime<='"+endTime+"'";
			break;
		case 5://分
			tabName="BEnergy1Minute";
			sql="select AreaId,TotalDiff,ItDevDiff,CoolingDiff,RefrigerationDiff,LightingDiff,OtherDiff,PUE,HourAvgPUE,RecordTime from "+tabName+" where AreaId="+serial+" and RecordTime>='"+startTime+"' and RecordTime<='"+endTime+"'";
			break;
		}
		ResultSet rs = null;
		SqlServer db=new SqlServer(2);
		//EnergyResponse response =  new EnergyResponse();
		//JSONArray array=new JSONArray();
		//array.add(0, 0);
		//array.add(1, 2147483647);
		Energy TotalPower=new Energy();
		TotalPower.setName("总用电量");
		TotalPower.setSerial(serial);
		TotalPower.setMetric("kWh");
		//TotalPower.setRange(array);
		Energy ItDevlPower=new Energy();
		ItDevlPower.setName("IT设备用电量");
		ItDevlPower.setSerial(serial);
		ItDevlPower.setMetric("kWh");
		//ItDevlPower.setRange(array);
		Energy CoolingPower=new Energy();
		CoolingPower.setName("非接触式供冷系统用电量");
		CoolingPower.setSerial(serial);
		CoolingPower.setMetric("kWh");
		//CoolingPower.setRange(array);
		Energy RefrigerationPower=new Energy();
		RefrigerationPower.setName("接触式致冷系统用电量");
		RefrigerationPower.setSerial(serial);
		RefrigerationPower.setMetric("kWh");
		//RefrigerationPower.setRange(array);
		Energy LightingPower=new Energy();
		LightingPower.setName("照明用电量");
		LightingPower.setSerial(serial);
		LightingPower.setMetric("kWh");
		//LightingPower.setRange(array);
		Energy OtherPower=new Energy();
		OtherPower.setName("其他用电量");
		OtherPower.setSerial(serial);
		OtherPower.setMetric("kWh");
		//OtherPower.setRange(array);
		Energy PUE=new Energy();
		PUE.setName("PUE值");
		PUE.setSerial(serial);
		PUE.setMetric("");
		Energy HourAvgPUE=new Energy();
		HourAvgPUE.setName("小时平均PUE值");
		HourAvgPUE.setSerial(serial);
		HourAvgPUE.setMetric("");
		JSONArray array1=new JSONArray();
		array1.add(0, 1);
		array1.add(1, 2);
		PUE.setRange(array1);
		HourAvgPUE.setRange(array1);
		double TotalPowerdMax=0.0,ItDevlPowerdMax=0.0,CoolingPowerdMax=0.0,LightingPowerdMax=0.0,RefrigerationPowerdMax=0.0,OtherPowerdMax=0.0,PUEdMax=0.0,HourAvgPUEdMax=0.0;
		if(db!=null)
		{
			try
			{
				long time;
				double TotalPowerd=0.0,ItDevlPowerd=0.0,CoolingPowerd=0.0,LightingPowerd=0.0,RefrigerationPowerd=0.0,OtherPowerd=0.0,PUEd=0.0,HourAvgPUEd=0.0;
				double TotalPowerdTmp=0.0,ItDevlPowerdTmp=0.0,CoolingPowerdTmp=0.0,LightingPowerdTmp=0.0,RefrigerationPowerdTmp=0.0,OtherPowerdTmp=0.0,PUEdTmp=0.0,HourAvgPUEdTmp=0.0;
				double TotalPowerdV=0.0,ItDevlPowerdV=0.0,CoolingPowerdV=0.0,LightingPowerdV=0.0,RefrigerationPowerdV=0.0,OtherPowerdV=0.0,PUEdV=0.0,HourAvgPUEdV=0.0;
				
				db.connect();
				//String sql="select AreaId,TotalPower,ItDevlPower,CoolingPower,RefrigerationPower,LightingPower,OtherPower,PUE,HourAvgPUE,RecordTime from "+tabName+" where AreaId="+serial+" and RecordTime>='"+startTime+"' and RecordTime<='"+endTime+"'";
				System.out.println(sql);
				rs=db.executeQuery(sql, rs);
				if(rs==null)
				{
					return "";
				}
				Timestamp times=null;
				while(rs.next())
				{
					/*TotalPowerd=rs.getDouble("TotalPower");
					ItDevlPowerd=rs.getDouble("ItDevlPower");
					CoolingPowerd=rs.getDouble("CoolingPower");
					RefrigerationPowerd=rs.getDouble("RefrigerationPower");
					LightingPowerd=rs.getDouble("LightingPower");
					OtherPowerd=rs.getDouble("OtherPower");
					PUEd=rs.getDouble("PUE");
					if(timeType==5)
					{
						HourAvgPUEd=rs.getDouble("HourAvgPUE");
					}
					times=rs.getTimestamp("RecordTime");
					time=times.getTime()/1000;*/
					//time=times.getTime();
					TotalPowerd=rs.getDouble("TotalDiff");
					ItDevlPowerd=rs.getDouble("ItDevDiff");
					CoolingPowerd=rs.getDouble("CoolingDiff");
					RefrigerationPowerd=rs.getDouble("RefrigerationDiff");
					LightingPowerd=rs.getDouble("LightingDiff");
					OtherPowerd=rs.getDouble("OtherDiff");
					PUEd=rs.getDouble("PUE");
					switch(timeType)
					{
					case 0:
						TotalPowerdTmp=5.79;
						ItDevlPowerdTmp=5.69;
						CoolingPowerdTmp=0.5;
						OtherPowerdTmp=0.0;
						RefrigerationPowerdTmp=0.56;
						LightingPowerdTmp=0.04;
						PUEdTmp=1.15;
						
						TotalPowerdV=30;
						ItDevlPowerdV=25;
						CoolingPowerdV=2;
						OtherPowerdTmp=0;
						RefrigerationPowerdV=5;
						LightingPowerdV=1;
						PUEdV=1.5;
						break;
					case 1:
						TotalPowerdTmp=5.79;
						ItDevlPowerdTmp=5.69;
						CoolingPowerdTmp=0.5;
						OtherPowerdTmp=0.0;
						RefrigerationPowerdTmp=0.56;
						LightingPowerdTmp=0.04;
						PUEdTmp=1.15;
						
						TotalPowerdV=1000000000;
						ItDevlPowerdV=1000000000;
						CoolingPowerdV=1000000000;
						OtherPowerdTmp=1000000000;
						RefrigerationPowerdV=1000000000;
						LightingPowerdV=1000000000;
						PUEdV=1.5;
						break;
					case 2:
						TotalPowerdTmp=504.68;//总
						ItDevlPowerdTmp=413.67;//it
						CoolingPowerdTmp=68.4;//接触式供冷
						RefrigerationPowerdTmp=16.45;//非接触式供冷
						LightingPowerdTmp=5.14;
						OtherPowerdTmp=0.0;//其他
						PUEdTmp=1.15;//PUE
						
						TotalPowerdV=1000000000;
						ItDevlPowerdV=1000000000;
						CoolingPowerdV=1000000000;
						OtherPowerdTmp=1000000000;
						RefrigerationPowerdV=1000000000;
						LightingPowerdV=1000000000;
						PUEdV=1.5;
						break;
					case 3:
						TotalPowerdTmp=21.4541;
						ItDevlPowerdTmp=20.27344;
						CoolingPowerdTmp=2.7;
						OtherPowerdTmp=0.0;
						RefrigerationPowerdTmp=1.45;
						LightingPowerdTmp=0.45;
						PUEdTmp=1.15;
						
						TotalPowerdV=300;
						ItDevlPowerdV=250;
						CoolingPowerdV=20;
						OtherPowerdTmp=50;
						RefrigerationPowerdV=50;
						LightingPowerdV=1;
						PUEdV=1.5;
						break;
					case 4:
						TotalPowerdTmp=5.79;
						ItDevlPowerdTmp=5.69;
						CoolingPowerdTmp=0.5;
						OtherPowerdTmp=0.0;
						RefrigerationPowerdTmp=0.56;
						LightingPowerdTmp=0.04;
						PUEdTmp=1.15;
						
						TotalPowerdV=30;
						ItDevlPowerdV=25;
						CoolingPowerdV=2;
						OtherPowerdTmp=0;
						RefrigerationPowerdV=5;
						LightingPowerdV=1;
						PUEdV=1.5;
						break;
					case 5:
						break;
					default:
						break;
					}

					TotalPowerd=((TotalPowerd<0.0)||TotalPowerd>TotalPowerdV)?TotalPowerdTmp:TotalPowerd;
					ItDevlPowerd=((ItDevlPowerd<0.0)||ItDevlPowerd>ItDevlPowerdV)?ItDevlPowerdTmp:ItDevlPowerd;
					CoolingPowerd=((CoolingPowerd<0.0)||CoolingPowerd>CoolingPowerdV)?CoolingPowerdTmp:CoolingPowerd;
					RefrigerationPowerd=((RefrigerationPowerd<0.0)||RefrigerationPowerd>RefrigerationPowerdV)?RefrigerationPowerdTmp:RefrigerationPowerd;
					LightingPowerd=((LightingPowerd<0.0)||LightingPowerd>LightingPowerdV)?LightingPowerdTmp:LightingPowerd;
					OtherPowerd=((OtherPowerd<0.0)||OtherPowerd>10)?0.0:OtherPowerd;
					if(timeType>=4)
					{
						if(TotalPowerd!=0&&ItDevlPowerd!=0)
						{
							PUEd=TotalPowerd/ItDevlPowerd;
							PUEd=((PUEd<1.0)||PUEd>PUEdV)?1.05:PUEd;
						}
					}
					else
					{
						PUEd=((PUEd<1.0)||PUEd>PUEdV)?1.15:PUEd;
					}
					
					
					TotalPowerdMax=TotalPowerd>TotalPowerdMax?TotalPowerd:TotalPowerdMax;
					ItDevlPowerdMax=ItDevlPowerd>CoolingPowerdMax?ItDevlPowerd:CoolingPowerdMax;
					CoolingPowerdMax=CoolingPowerd>TotalPowerdMax?CoolingPowerd:TotalPowerdMax;
					RefrigerationPowerdMax=RefrigerationPowerd>RefrigerationPowerdMax?RefrigerationPowerd:RefrigerationPowerdMax;
					LightingPowerdMax=TotalPowerd>TotalPowerdMax?TotalPowerd:TotalPowerdMax;
					OtherPowerdMax=OtherPowerd>OtherPowerdMax?OtherPowerd:OtherPowerdMax;
					OtherPowerdMax=OtherPowerdMax<0.01?0.0:OtherPowerdMax;
					PUEdMax=PUEd>PUEdMax?PUEd:PUEdMax;
					
					
					
					
					if(timeType==5)
					{
						HourAvgPUEd=rs.getDouble("HourAvgPUE");
					}
					times=rs.getTimestamp("RecordTime");
					time=times.getTime()/1000;
					
					JSONArray TotalArray=new JSONArray();
					JSONArray ItDevlArray=new JSONArray();
					JSONArray CoolingArray=new JSONArray();
					JSONArray RefrigerationArray=new JSONArray();
					JSONArray LightingArray=new JSONArray();
					JSONArray OtherArray=new JSONArray();
					JSONArray PUEArray=new JSONArray();
					JSONArray HourAvgPUEArray=new JSONArray();
					
					
					TotalArray.add(time);
					TotalArray.add(getBig(TotalPowerd).setScale(2, BigDecimal.ROUND_HALF_UP));
					
					ItDevlArray.add(time);
					ItDevlArray.add(getBig(ItDevlPowerd).setScale(2, BigDecimal.ROUND_HALF_UP));

					CoolingArray.add(time);
					CoolingArray.add(getBig(CoolingPowerd).setScale(2, BigDecimal.ROUND_HALF_UP));
					
					RefrigerationArray.add(time);
					RefrigerationArray.add(getBig(RefrigerationPowerd).setScale(2, BigDecimal.ROUND_HALF_UP));
					
					LightingArray.add(time);
					LightingArray.add(getBig(LightingPowerd).setScale(2, BigDecimal.ROUND_HALF_UP));
						
					OtherArray.add(time);
					OtherArray.add(getBig(OtherPowerd).setScale(2, BigDecimal.ROUND_HALF_UP));
					
					PUEArray.add(time);
					PUEArray.add(getBig(PUEd).setScale(2, BigDecimal.ROUND_HALF_UP));
									
					HourAvgPUEArray.add(time);
					HourAvgPUEArray.add(getBig(HourAvgPUEd).setScale(2, BigDecimal.ROUND_HALF_UP));
									
					TotalPower.getData().add(TotalArray);
					ItDevlPower.getData().add(ItDevlArray);
					CoolingPower.getData().add(CoolingArray);
					RefrigerationPower.getData().add(RefrigerationArray);
					LightingPower.getData().add(LightingArray);
					OtherPower.getData().add(OtherArray);
					PUE.getData().add(PUEArray);
					HourAvgPUE.getData().add(HourAvgPUEArray);
				}
			}
			catch(SQLException e)
			{
				db.close();
				e.printStackTrace();
			}
			db.close();
		}
		TotalPower.setRange(getRange(TotalPowerdMax));
		TotalPower.setData_num(TotalPower.getData().size());
		ItDevlPower.setRange(getRange(ItDevlPowerdMax));
		ItDevlPower.setData_num(ItDevlPower.getData().size());
		CoolingPower.setRange(getRange(CoolingPowerdMax));
		CoolingPower.setData_num(CoolingPower.getData().size());
		RefrigerationPower.setRange(getRange(RefrigerationPowerdMax));
		RefrigerationPower.setData_num(RefrigerationPower.getData().size());
		LightingPower.setRange(getRange(LightingPowerdMax));
		LightingPower.setData_num(LightingPower.getData().size());
		OtherPower.setRange(getRange(OtherPowerdMax));
		OtherPower.setData_num(OtherPower.getData().size());
		PUE.setData_num(PUE.getData().size());
		HourAvgPUE.setData_num(HourAvgPUE.getData().size());
		switch(type)
		{
		case 0:
			response.getTrend_data().put("总用电量", TotalPower);
			break; 
		case 1:
			response.getTrend_data().put("IT设备用电量",ItDevlPower);
			break;
		case 2:
			response.getTrend_data().put("非接触式供冷系统用电量",CoolingPower);
			break;
		case 3:
			response.getTrend_data().put("接触式致冷系统用电量",RefrigerationPower);
			break;
		case 4:
			response.getTrend_data().put("照明用电量",LightingPower);
			break;
		case 5:
			response.getTrend_data().put("其他用电量",OtherPower);
			break;
		case 6:
			response.getTrend_data().put("PUE值",PUE);
			break;
		case 7:
			//response.getTrend_data().put("小时平均PUE值",HourAvgPUE);
			break;
		case 8:
			response.getTrend_data().put("总用电量",TotalPower);
			response.getTrend_data().put("IT设备用电量",ItDevlPower);
			response.getTrend_data().put("非接触式供冷系统用电量",CoolingPower);
			response.getTrend_data().put("接触式致冷系统用电量",RefrigerationPower);
			response.getTrend_data().put("照明用电量",LightingPower);
			response.getTrend_data().put("其他用电量",OtherPower);
			response.getTrend_data().put("PUE值",PUE);
			//if(timeType>3)
			//{
			//response.getTrend_data().put("小时平均PUE值",HourAvgPUE);
			//}
			break;
		default:
			break;
		}
		String str="";
		return str;
	}
	public JSONArray getRange(double v)
	{
		JSONArray array=new JSONArray();
		array.add(0, 0);
		array.add(1, v);
		return array;
	}
	public BigDecimal getBig(double val)
	{
		BigDecimal bigDecimal=new BigDecimal(val);
		return bigDecimal;
	}
	public String getAlarmLevelAnalysis(String startTime,String endTime,AlarmAnalysisResponse response)
	{
		ResultSet rs = null;
		SqlServer db=new SqlServer(0);
		int level1=0,level2=0,level3=0,level4=0;
		if(db!=null)
		{
			try
			{
				db.connect();
				int AlarmlevelInt=-1;
				String sql="select AlarmLevel from CAlarmData where AlarmBegin>='"+startTime+"' and AlarmBegin<='"+endTime+"'";
				System.out.println(sql);
				rs=db.executeQuery(sql, rs);
				if(rs==null)
				{
					return "";
				}
				while(rs.next())
				{
					AlarmlevelInt=rs.getInt("AlarmLevel");
					switch(AlarmlevelInt)
					{
					case 0://运行事件
						level4++;
						break;
					case 1://一般告警
						level3++;
						break;
					case 2://严重告警
						level2++;
						break;
					case 3://紧急告警
						level1++;
						break;
					default:
						break;
					}
				}
			}
			catch(SQLException e)
			{
				db.close();
				e.printStackTrace();
			}
			db.close();
		}
		JSONArray tmp1=new JSONArray();
		JSONArray tmp2=new JSONArray();
		JSONArray tmp3=new JSONArray();
		JSONArray tmp4=new JSONArray();
		tmp1.add("一级告警");
		tmp1.add(level1);
		tmp2.add("二级告警");
		tmp2.add(level2);	
		tmp3.add("三级告警");
		tmp3.add(level3);	
		tmp4.add("四级告警");
		tmp4.add(level4);
		AlarmAnalysis aay=new AlarmAnalysis();
		aay.setData_num(4);
		aay.setMetric("个");
		aay.setName("告警级别分析");
		aay.getData().add(tmp1);
		aay.getData().add(tmp2);
		aay.getData().add(tmp3);
		aay.getData().add(tmp4);
		response.getClass_data().add(aay);
		String str="";
		return str;
	}
	public String getSignalLst(JSONArray jsonArray)
	{
		boolean first=true;
		String lst="";
		for(int j=0;j<jsonArray.size();j++)
		{
			JSONObject signalDat=jsonArray.getJSONObject(j);
			int signalId=signalDat.getInt("signalId");
			if(first)
			{
				lst=lst+signalId;
			}
			else
			{
				lst=lst+","+signalId;
			}
			first=false;
		}
		return lst;
	}
	public void getSignalInfo(Map<Integer,HistoryDataObj> map,String signalLstId)
	{
		String sql = String.format("SELECT b.DataObjID as datId,b.DataObjName as datName,a.MaxVal as maxValue,a.MinVal as minValue,a.MeasureMonad as measureMonad  FROM CAIObject a,CDataObject b where a.AIObjID=b.DataObjID and b.DataObjID in("+signalLstId+")");
		ResultSet rsCfg = null;
		SqlServer dbCfg=new SqlServer(0);//读取配置库
		System.out.println(sql);
		if(dbCfg!=null)
		{
			try
			{
				dbCfg.connect();
				int datId;
				String datName,measureMonad;
				double maxValue,minValue;
				rsCfg=dbCfg.executeQuery(sql, rsCfg);
				if(rsCfg==null)
				{
					return ;
				}
				DecimalFormat df= new DecimalFormat("0");
				while(rsCfg.next())
				{
					datId=rsCfg.getInt("datId");
					datName=rsCfg.getString("datName");
					measureMonad=rsCfg.getString("measureMonad");
					maxValue=rsCfg.getDouble("maxValue");
					minValue=rsCfg.getDouble("minValue");
					HistoryDataObj tmp=new HistoryDataObj();
					tmp.setSerial(new Integer(datId).toString());
					tmp.setMetric(measureMonad);
					tmp.setName(datName);
					tmp.getRange().add(new Double(df.format(minValue)).longValue());
					tmp.getRange().add(new Double(df.format(maxValue)).longValue());
					map.put(new Integer(datId), tmp);
				}
			}
			catch(SQLException e)
			{
				dbCfg.close();
				e.printStackTrace();
			}
			dbCfg.close();
		}
	}
	public Iterable<HistoryAI> selectHistoryAIByIdAndTsRange(List<Integer> ids, Date begin, Date end, int type) {
		log.info("query type = " + type + ", id: " + ids + ", begin = " + begin + ", end = " + end);
		switch(type)
		{
		case 0://年
			return historyAIYearRepository.findByIdAndDateRange(ids, begin, end);
		case 1://月
			return historyAIMonthRepository.findByIdAndDateRange(ids, begin, end);
		case 2://日
			return historyAIDayRepository.findByIdAndDateRange(ids, begin, end);
		case 3://15分钟
			return historyAIQuarterRepository.findByIdAndDateRange(ids, begin, end);
		case 4://1分钟
			return historyAIMinuteRepository.findByIdAndDateRange(ids, begin, end);
		}

		return new ArrayList<>();
	}
	
	public String getHisData(String signalLstId,int type,String startTime,String endTime,EnergyResponse response)
	{
		String tabName="BAIHistoryQuarter";
		String sql="";
		Map<Integer,HistoryDataObj> map =new HashMap<Integer, HistoryDataObj>();
		getSignalInfo(map,signalLstId);

		switch(type)
		{
		case 0://年
			tabName="BAIHistoryDay";//查询每个月的1号0点0分0秒
			break;
		case 1://月
			tabName="BAIHistoryDay";//查询每个月的所有历史数据
			break;
		case 2://日
			tabName="BAIHistoryHour";//查询每个小时的所有历史数据
			break;
		case 3://15分钟
			tabName="BAIHistoryQuarter";//查询15分钟的所有历史数据
			break;
		case 4://1分钟
			tabName="BAIHistoryMinute";//查询1分钟的所有历史数据
			break;
		}
		if(type==0)
		{
			try
			{
				long diff=0;
				long time=0;
				SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
				DateFormat format1 = new SimpleDateFormat("yyyy-MM-01 00:00:00");
				Date startDate = sdf.parse(startTime);
				Date endDate = sdf.parse(endTime);
				GregorianCalendar gc = new GregorianCalendar(); 
				long startT=startDate.getTime()/1000;
				long endT=endDate.getTime()/1000;
				String dbName="";
				for(;startT<=endT;)
				{
					System.out.println(startTime);
					dbName=getHisDbName(startTime);
					sql="select DataObjID,CurrentValue,RecordTime from "+tabName+" where DataObjID in("+signalLstId+") and RecordTime='"+startTime+"'";
					getHisDataFromMstar(dbName,sql,map);
					diff=60*60*24*31;
					startT=startT+diff;
					gc.setTimeInMillis(startT*1000);
					startTime=format1.format(gc.getTime());
				}
			}
			catch(ParseException e)
			{
				
			}
		}
		else
		{
			String dbName="";
			dbName=getHisDbName(startTime);

			sql="select DataObjID,CurrentValue,RecordTime from "+tabName+" where DataObjID in("+signalLstId+") and RecordTime>='"+startTime+"' and RecordTime<='"+endTime+"'";
			System.out.println(sql);
			getHisDataFromMstar(dbName,sql,map);
		}
		
		setHistoryAIToResponse(response, map);
		
		String str="";
		return str;
	}
	public void setHistoryAIToResponse(EnergyResponse response, Map<Integer, HistoryDataObj> map) {
		for (Integer key : map.keySet()) {  
			HistoryDataObj value = map.get(key);
		    value.setData_num(value.getData().size());
		    response.getTrend_data().put(value.getSerial(),value);
		}
	}
	public void getHisDataFromMstar(String dbName,String sql,Map<Integer,HistoryDataObj> map)
	{
		ResultSet rs = null;
		SqlServer db=new SqlServer(dbName,1);
		if(db!=null)
		{
			try
			{
				db.connect();
				int DataObjID;
				double CurrentValue=0.0;
				System.out.println(sql);
				rs=db.executeQuery(sql, rs);
				if(rs==null)
				{
					return ;
				}
				Timestamp times=null;
				long time;
				while(rs.next())
				{
					DataObjID=rs.getInt("DataObjID");
					CurrentValue=rs.getDouble("CurrentValue");
					times=rs.getTimestamp("RecordTime");
					convertHistoryAIToJsonArray(map, DataObjID, times.getTime(), CurrentValue);
				}
			}
			catch(SQLException e)
			{
				db.close();
				e.printStackTrace();
				return;
			}
			db.close();
		}
	}
	
	public void convertHistoryAIToJsonArray(Map<Integer, HistoryDataObj> map, int DataObjID, long timestamp, double CurrentValue) {
		HistoryDataObj h = map.get(new Integer(DataObjID));
		if(h != null) { 
			long time;
			time=timestamp/1000;
			//time=times.getTime();
			JSONArray tmp=new JSONArray();
			tmp.add(time);
			tmp.add(getBig(CurrentValue).setScale(2, BigDecimal.ROUND_HALF_UP));
			h.getData().add(tmp);
		}
	}
	
	public int getParent_Id(int serial)
	{
		String sql = String.format("SELECT LogObjID,LogObjType,ParLogObjID FROM CLogicalObject WHERE LogObjID=%d",serial);;
		System.out.println(sql);
		ResultSet rs = null;
		SqlServer db=new SqlServer(0);//读取配置库
		int parent_Id=0;
		if(db!=null)
		{
			try
			{
				db.connect();
				rs=db.executeQuery(sql, rs);
				int LogObjID,LogObjType,ParLogObjID;
				while(rs.next())
				{
					
					LogObjID=rs.getInt("LogObjID");
					LogObjType=rs.getInt("LogObjType");
					ParLogObjID=rs.getInt("ParLogObjID");
					if(LogObjType==8)
					{
						parent_Id=ParLogObjID;
					}
					else if(LogObjType==7)
					{
						parent_Id=LogObjID;
					}
					else
					{
						parent_Id=serial;
					}
				}
			}
			catch(SQLException e)
			{
				db.close();
				e.printStackTrace();
			}
			db.close();
		}
		return parent_Id;
	}
	public List<AlarmPO> getHisAlarm(int type,String name,String startTime,String endTime)
	{
		String sql;
		if(type==0)
		{
			sql = String.format("SELECT a.DataObjectID as signalId,a.Station as station,"
					+ "a.DeviceName as deviceName,a.ObjectName as signalName,a.AlarmBegin as alarmBegin,"
					+ "a.AlarmEnd as alarmEnd,CASE a.AlarmLevel "
					+ "WHEN 0 THEN '运行事件' "
					+ "WHEN 1 THEN '一般告警' "
					+ "WHEN 2 THEN '严重告警' "
					+ "WHEN 3 THEN '紧急告警' "
					+ "ELSE '未知' END "
					+ "as alarmLevel ,a.AlarmLevel as level, d.ParLogObjID as serial FROM CAlarmData a, CDataObject d WHERE a.DataObjectID=d.DataObjID and a.AlarmBegin>='"+startTime+"' and a.AlarmBegin<='"+endTime+"' and a.AlarmEnd is not NULL");
		}
		else
		{
			sql = String.format("SELECT a.DataObjectID as signalId,a.Station as station,"
					+ "a.DeviceName as deviceName,a.ObjectName as signalName,a.AlarmBegin as alarmBegin,"
					+ "a.AlarmEnd as alarmEnd,CASE a.AlarmLevel "
					+ "WHEN 0 THEN '运行事件' "
					+ "WHEN 1 THEN '一般告警' "
					+ "WHEN 2 THEN '严重告警' "
					+ "WHEN 3 THEN '紧急告警' "
					+ "ELSE '未知' END "
					+ "as alarmLevel ,a.AlarmLevel as level, d.ParLogObjID as serial FROM CAlarmData a, CDataObject d WHERE a.DataObjectID=d.DataObjID and a.AlarmBegin>='"+startTime+"' and a.AlarmBegin<='"+endTime+"' and a.Station like '%%"+name+"%%' and a.AlarmEnd is not NULL");
		}
		System.out.println(sql);
		List<AlarmPO> l=new ArrayList();
		ResultSet rs = null;
		SqlServer db=new SqlServer(0);//读取配置库
		if(db!=null)
		{
			try
			{
				db.connect();
				int signalId,level,serial;
				String station,deviceName,signalName,alarmBegin,alarmEnd,alarmLevel;
				rs=db.executeQuery(sql, rs);
				if(rs==null)
				{
					return l;
				}
				Timestamp times=null;
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				while(rs.next())
				{
					AlarmPO tmp=new AlarmPO();
					signalId=rs.getInt("signalId");
					station=rs.getString("station");
					deviceName=rs.getString("deviceName");
					signalName=rs.getString("signalName");
					times=rs.getTimestamp("alarmBegin");
					if(times!=null)
					{
						alarmBegin = formatter.format(times.getTime());
					}
					else
					{
						alarmBegin="";
					}
					times=rs.getTimestamp("alarmEnd");
					if(times!=null)
					{
						alarmEnd = formatter.format(times.getTime());
					}
					else
					{
						alarmEnd="";
					}
					alarmLevel=rs.getString("alarmLevel");
					level=rs.getInt("level");
					serial=rs.getInt("serial");
					tmp.setAlarmBegin(alarmBegin);
					tmp.setAlarmEnd(alarmEnd);
					tmp.setAlarmLevel(alarmLevel);
					tmp.setDeviceName(deviceName);
					tmp.setLevel(level);
					tmp.setSerial(serial);
					tmp.setParent_id(getParent_Id(serial));
					tmp.setSignalId(signalId);
					tmp.setSignalName(signalName);
					tmp.setStation(station);
					l.add(tmp);
				}
			}
			catch(SQLException e)
			{
				db.close();
				e.printStackTrace();
			}
			db.close();
		}
		return l;
	}
	public String getHisDbName(String startTime)
	{
		String hisName="";
		try
		{
			SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
			Date date = sdf.parse(startTime);
			DateFormat format1 = new SimpleDateFormat("yyyyMM");
			hisName="MStarDb201612";//+format1.format(date);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		return hisName;
	}
	
	
	
	public String getSignalId(JSONArray json)
	{
		String SignalId="";
		for(int i=0;i<json.size();i++)
        {
			JSONObject jsonobj=json.getJSONObject(i);
			if(i==0)
			{
				SignalId+=jsonobj.getInt("signalId");
			}
			else
			{
				SignalId+=","+jsonobj.getInt("signalId");
			}
        }
		return SignalId;
	}
}
