package com.wincom.mstar.dao.impl;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.wincom.mstar.dao.MonitorServiceDAO;
import com.wincom.mstar.sqlserver.ReadProperties;
import com.wincom.mstar.sqlserver.SqlServer;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import com.wincom.mstar.dao.*;
import com.wincom.mstar.DevicePropertyPO;
import com.wincom.mstar.HistoryDataObj;
import com.wincom.mstar.Signal;
import com.wincom.mstar.AlarmPO;
import com.wincom.mstar.Capacity;
import com.wincom.mstar.CapacityBase;
import com.wincom.mstar.CapacityRP;
import com.wincom.mstar.DataObj;
public class MonitorServiceDAOImpl implements MonitorServiceDAO {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<BaseConfig> getConfig(int parentId) {
		String sql = String.format("SELECT LogObjID as objId,ParLogObjID as parentObjId,"
				+ "LogObjName as objName,CASE LogObjType "
				+ "WHEN 1 THEN '监控中心' "
				+ "WHEN 2 THEN '区域' "
				+ "WHEN 3 THEN '机楼' "
				+ "WHEN 4 THEN '楼层' "
				+ "WHEN 5 THEN '房间' "
				+ "WHEN 6 THEN '基站' "
				+ "WHEN 7 THEN '设备' "
				+ "WHEN 8 THEN '子设备' "
				+ "ELSE '未知' END "
				+ "as objType "
				+ "FROM CLogicalObject WHERE ParLogObjID=%d AND LogObjID!=0", parentId);
		System.out.println(sql);
		List<BaseConfig> l=new ArrayList();
		ResultSet rs = null;
		SqlServer db=new SqlServer(0);//读取配置库
		if(db!=null)
		{
			try
			{
				db.connect();
				int objId,parentObjId;
				String objName,objType;
				rs=db.executeQuery(sql, rs);
				while(rs.next())
				{
					BaseConfig tmp=new BaseConfig();
					objId=rs.getInt("objId");
					parentObjId=rs.getInt("parentObjId");
					objName=rs.getString("objName");
					objType=rs.getString("objType");
					tmp.setObjId(objId);
					tmp.setParentObjId(parentObjId);
					tmp.setObjName(objName);
					tmp.setObjType(objType);
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<BaseConfig> getSignal(int parentDeviceId) {
		String sql = String.format("SELECT DataObjID as objId,ParLogObjID as parentObjId,"
				+ "DataObjName as objName,CASE DataObjType "
				+ "WHEN 18 THEN 'DI' "
				+ "WHEN 19 THEN 'AI' "
				+ "WHEN 20 THEN 'SI' "
				+ "WHEN 34 THEN 'DO' "
				+ "WHEN 35 THEN 'AO' "
				+ "WHEN 36 THEN 'SO' "
				+ "WHEN 66 THEN 'VDI' "
				+ "WHEN 67 THEN 'VAI' "
				+ "WHEN 68 THEN 'VSI' "
				+ "ELSE '未知' END "
				+ "as objType "
				+ "FROM CDataObject WHERE ParLogObjID=%d AND DataObjType IN(18,19,20,34,35,36,66,67,68)", parentDeviceId);
		System.out.println(sql);
		List<BaseConfig> l=new ArrayList();
		ResultSet rs = null;
		SqlServer db=new SqlServer(0);//读取配置库
		if(db!=null)
		{
			try
			{
				db.connect();
				int objId,parentObjId;
				String objName,objType;
				rs=db.executeQuery(sql, rs);
				while(rs.next())
				{
					BaseConfig tmp=new BaseConfig();
					objId=rs.getInt("objId");
					parentObjId=rs.getInt("parentObjId");
					objName=rs.getString("objName");
					objType=rs.getString("objType");
					tmp.setObjId(objId);
					tmp.setParentObjId(parentObjId);
					tmp.setObjName(objName);
					tmp.setObjType(objType);
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

	@Override
	public DevicePropertyPO getDeviceProperty(int deviceId) {
		BaseConfig baseConfig = getConfigByObjId(deviceId);
		if(baseConfig.getObjType().equals("子设备")){
			deviceId=baseConfig.getParentObjId();
		}
		String sql = String.format("SELECT d.DeviceProducer as producer,d.DeviceVersion as model,"
				+ "d.UseDate as useDate,d.DeviceNo as deviceNO, e.DeviceName as deviceType "
				+ "FROM CDeviceProperty d,CDeviceTypeEx e WHERE d.ObjID=%d AND e.DeviceID=d.DeviceType", deviceId);
		System.out.println(sql);
		DevicePropertyPO devPro=new DevicePropertyPO();
		ResultSet rs = null;
		SqlServer db=new SqlServer(0);//读取配置库
		if(db!=null)
		{
			try
			{
				db.connect();
				String producer,model,useDate,deviceNO,deviceType;
				rs=db.executeQuery(sql, rs);
				Timestamp times=null;
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				while(rs.next())
				{
					producer=rs.getString("producer");
					model=rs.getString("model");
					deviceNO=rs.getString("deviceNO");
					deviceType=rs.getString("deviceType");
					times=rs.getTimestamp("useDate");
					if(times!=null)
					{
						useDate = formatter.format(times.getTime());
					}
					else
					{
						useDate="";
					}
					devPro.setDeviceNO(deviceNO);
					devPro.setDeviceType(deviceType);
					devPro.setModel(model);
					devPro.setProducer(producer);
					devPro.setUseDate(useDate);
				}
			}
			catch(SQLException e)
			{
				db.close();
				e.printStackTrace();
			}
			db.close();
		}
		return devPro;
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<AlarmPO> getAllAlarm() {
		String sql = String.format("SELECT a.DataObjectID as signalId,a.Station as station,"
				+ "a.DeviceName as deviceName,a.ObjectName as signalName,a.AlarmBegin as alarmBegin,"
				+ "a.AlarmEnd as alarmEnd,CASE a.AlarmLevel "
				+ "WHEN 0 THEN '运行事件' "
				+ "WHEN 1 THEN '一般告警' "
				+ "WHEN 2 THEN '严重告警' "
				+ "WHEN 3 THEN '紧急告警' "
				+ "ELSE '未知' END "
				+ "as alarmLevel ,a.AckStatus as ackStatus,a.AlarmLevel as level, d.ParLogObjID as serial FROM AAlarmData a, CDataObject d WHERE a.DataObjectID=d.DataObjID");
		System.out.println(sql);
		List<AlarmPO> l=new ArrayList();
		ResultSet rs = null;
		SqlServer db=new SqlServer(0);//读取配置库
		if(db!=null)
		{
			try
			{
				db.connect();
				int signalId,level,serial,ackStatus;
				String station,deviceName,signalName,alarmBegin,alarmEnd,alarmLevel;
				rs=db.executeQuery(sql, rs);
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
					ackStatus=rs.getInt("ackStatus");
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
					tmp.setAckStatus(ackStatus);
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<AlarmPO> getDeviceAlarm(int deviceId) {
		String sql = String.format("SELECT a.DataObjectID as signalId,a.Station as station,"
				+ "a.DeviceName as deviceName,a.ObjectName as signalName,a.AlarmBegin as alarmBegin,"
				+ "a.AlarmEnd as alarmEnd,CASE a.AlarmLevel "
				+ "WHEN 0 THEN '运行事件' "
				+ "WHEN 1 THEN '一般告警' "
				+ "WHEN 2 THEN '严重告警' "
				+ "WHEN 3 THEN '紧急告警' "
				+ "ELSE '未知' END "
				+ "as alarmLevel,a.AckStatus as ackStatus,a.AlarmLevel as level, d.ParLogObjID as serial FROM AAlarmData a, CDataObject d "
				+ "WHERE a.DataObjectID=d.DataObjID AND d.ParLogObjID=%d",deviceId);
		System.out.println(sql);
		List<AlarmPO> l=new ArrayList();
		ResultSet rs = null;
		SqlServer db=new SqlServer(0);//读取配置库
		if(db!=null)
		{
			try
			{
				db.connect();
				int signalId,level,serial,ackStatus;
				String station,deviceName,signalName,alarmBegin,alarmEnd,alarmLevel;
				rs=db.executeQuery(sql, rs);
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
					ackStatus=rs.getInt("ackStatus");
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
					tmp.setAckStatus(ackStatus);
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
			hisName="MStarDb"+format1.format(date);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		return hisName;
	}
	public void getSignalObj(Map<Integer,DataObj> map)
	{
		String sql = String.format("SELECT DataObjID,DataObjName,ParLogObjID FROM CDataObject");
		ResultSet rsCfg = null;
		SqlServer dbCfg=new SqlServer(0);//读取配置库
		System.out.println(sql);
		if(dbCfg!=null)
		{
			try
			{
				dbCfg.connect();
				int DataObjID,ParLogObjID;
				String DataObjName;
				double maxValue,minValue;
				rsCfg=dbCfg.executeQuery(sql, rsCfg);
				if(rsCfg==null)
				{
					return ;
				}
				while(rsCfg.next())
				{
					DataObjID=rsCfg.getInt("DataObjID");
					DataObjName=rsCfg.getString("DataObjName");
					ParLogObjID=rsCfg.getInt("ParLogObjID");
					
					DataObj tmp=new DataObj();
					tmp.setSerial(new Integer(DataObjID).toString());
					tmp.setParentId(ParLogObjID);
					tmp.setName(DataObjName);
					map.put(new Integer(DataObjID), tmp);
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
	public List<AlarmPO> getHisAlarm(int type,String name,String startTime,String endTime)
	{
		String tmpSql="";
		switch(type)
		{
		case 0://表示全部告警
			tmpSql="a.AlarmBegin>='"+startTime+"' and a.AlarmBegin<='"+endTime+"'";
			break;
		case 1://表示按站点查询
			tmpSql="a.AlarmBegin>='"+startTime+"' and a.AlarmBegin<='"+endTime+"' and a.Station like '%"+name+"%'";
			break;
		case 2://表示按设备查询
			tmpSql="a.AlarmBegin>='"+startTime+"' and a.AlarmBegin<='"+endTime+"' and a.DeviceName like '%"+name+"%'";
			break;
		case 3://表示按信号查询
			tmpSql="a.AlarmBegin>='"+startTime+"' and a.AlarmBegin<='"+endTime+"' and a.ObjectName like '%"+name+"%'";
			break;
		default:
			tmpSql="a.AlarmBegin>='"+startTime+"' and a.AlarmBegin<='"+endTime+"'";
			break;
		}
		String sql = "SELECT a.DataObjectID as signalId,a.Station as station,"
				+ "a.DeviceName as deviceName,a.ObjectName as signalName,a.AlarmBegin as alarmBegin,"
				+ "a.AlarmEnd as alarmEnd,CASE a.AlarmLevel "
				+ "WHEN 0 THEN '运行事件' "
				+ "WHEN 1 THEN '一般告警' "
				+ "WHEN 2 THEN '严重告警' "
				+ "WHEN 3 THEN '紧急告警' "
				+ "ELSE '未知' END "
				+ "as alarmLevel,a.AckStatus as ackStatus ,a.AlarmLevel as level FROM BAlarmData a WHERE  "+tmpSql;
		System.out.println(sql);
		String dbName=getHisDbName(startTime);
		Map<Integer,DataObj> map =new HashMap<Integer, DataObj>();
		getSignalObj(map);
		
		List<AlarmPO> l=new ArrayList();
		ResultSet rs = null;
		SqlServer db=new SqlServer(dbName,1);
		if(db!=null)
		{
			try
			{
				db.connect();
				int signalId,level,serial,ackStatus;
				String station,deviceName,signalName,alarmBegin,alarmEnd,alarmLevel;
				rs=db.executeQuery(sql, rs);
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
					//serial=rs.getInt("serial");
					ackStatus=rs.getInt("ackStatus");
					DataObj dataObj=map.get(new Integer(signalId));
					if(dataObj==null)
					{
						continue;
					}
					tmp.setAlarmBegin(alarmBegin);
					tmp.setAlarmEnd(alarmEnd);
					tmp.setAlarmLevel(alarmLevel);
					tmp.setDeviceName(deviceName);
					tmp.setLevel(level);
					tmp.setSerial(dataObj.getParentId());
					tmp.setParent_id(getParent_Id(dataObj.getParentId()));
					tmp.setSignalId(signalId);
					tmp.setSignalName(signalName);
					tmp.setStation(station);
					tmp.setAckStatus(ackStatus);
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
	public BaseConfig getConfigByObjId(int objId) {
		String sql = String.format("SELECT LogObjID as objId,ParLogObjID as parentObjId,"
				+ "LogObjName as objName,CASE LogObjType "
				+ "WHEN 1 THEN '监控中心' "
				+ "WHEN 2 THEN '区域' "
				+ "WHEN 3 THEN '机楼' "
				+ "WHEN 4 THEN '楼层' "
				+ "WHEN 5 THEN '房间' "
				+ "WHEN 6 THEN '基站' "
				+ "WHEN 7 THEN '设备' "
				+ "WHEN 8 THEN '子设备' "
				+ "ELSE '未知' END "
				+ "as objType "
				+ "FROM CLogicalObject WHERE LogObjID=%d", objId);
		System.out.println(sql);
		ResultSet rs = null;
		SqlServer db=new SqlServer(0);//读取配置库
		BaseConfig baseConfig=new BaseConfig();
		if(db!=null)
		{
			try
			{
				db.connect();
				int objId1,parentObjId;
				String objName,objType;
				rs=db.executeQuery(sql, rs);
				while(rs.next())
				{
					
					objId1=rs.getInt("objId");
					parentObjId=rs.getInt("parentObjId");
					objName=rs.getString("objName");
					System.out.println(objName);
					objType=rs.getString("objType");
					System.out.println(objType);
					baseConfig.setObjId(objId1);
					baseConfig.setParentObjId(parentObjId);
					baseConfig.setObjName(objName);
					baseConfig.setObjType(objType);
				}
			}
			catch(SQLException e)
			{
				db.close();
				e.printStackTrace();
			}
			db.close();
		}
		return baseConfig;
	}

	@Override
	public List<AlarmPO> getAllAlarm(int objId) {
		String sql = String.format("SELECT a.DataObjectID as signalId,a.Station as station,"
				+ "a.DeviceName as deviceName,a.ObjectName as signalName,a.AlarmBegin as alarmBegin,"
				+ "a.AlarmEnd as alarmEnd,CASE a.AlarmLevel "
				+ "WHEN 0 THEN '运行事件' "
				+ "WHEN 1 THEN '一般告警' "
				+ "WHEN 2 THEN '严重告警' "
				+ "WHEN 3 THEN '紧急告警' "
				+ "ELSE '未知' END "
				+ "as alarmLevel ,a.AlarmLevel as level, d.ParLogObjID as serial FROM AAlarmData a, CDataObject d WHERE a.DataObjectID=d.DataObjID and a.DataObjectID="+objId);
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
	//************************************容量获取***************************************
	public JSONArray getCapacityData(String IdLst,int type,JSONArray data)
	{
		//JSONArray data=new JSONArray();
		String []strArr=IdLst.split(",");
		JSONObject jsonobj=null;
		JSONArray DatLst=null;
		for(int i=0;i<strArr.length;i++)
		{
			Capacity capacity=new Capacity();
			capacity.setSerial(strArr[i]);
			DatLst=getDatLst(new Integer(strArr[i]).intValue(),type);
			System.out.println(DatLst.toString());
			for(int j=0;j<DatLst.size();j++)
			{
				jsonobj = DatLst.getJSONObject(j);
				CapacityBase cb=getCapacityObj(jsonobj.getInt("DatId"),jsonobj.getInt("Type"));
				//capacity.getData().add(cb);
				data.add(cb);
			}
			//data.add(capacity);
		}
		return data;
	}
	public JSONArray getDatLst(int Id,int type)
	{
		String sql="";
		JSONArray dat=new JSONArray();
		if(type==0)//表示获取机房容量
		{
			sql = String.format("SELECT distinct EnergyType, DatId FROM AHistoryDataMinute WHERE Type=1 and EnergyType in(22,23,24) and MachRoomId=%d",Id);
		}
		else if(type==1)//表示获取机柜容量
		{
			sql = String.format("SELECT distinct EnergyType, DatId FROM AHistoryDataMinute WHERE Type=1 and EnergyType in(20,21) and MachRoomId=%d",Id);
		}
		else if(type==2)//表示获取网络机柜容量
		{
			sql = String.format("SELECT distinct EnergyType, DatId FROM AHistoryDataMinute WHERE Type=1 and EnergyType=25 and MachRoomId=%d",Id);
		}
		else if(type==3)//表示获取单个容量
		{
			sql = String.format("SELECT distinct DatId, EnergyType FROM AHistoryDataMinute WHERE Type=1 and DatId=%d",Id);
		}
		System.out.println(sql);
		SqlServer db=new SqlServer(2);//读取能耗库
		if(db!=null)
		{
			try
			{
				ResultSet rs = null;
				db.connect();
				rs=db.executeQuery(sql, rs);
				int DatId=0,Type=0;
				while(rs.next())
				{
					DatId=rs.getInt("DatId");
					Type=rs.getInt("EnergyType");
					JSONObject jsonObj=new JSONObject();
					jsonObj.put("DatId", DatId);
					jsonObj.put("Type", Type);
					dat.add(jsonObj);
				}
			}
			catch(SQLException e)
			{
				db.close();
				e.printStackTrace();
			}
			db.close();
		}
		
		return dat;
	}
	public CapacityBase getCapacityObj(int DatId,int type)
	{
		CapacityBase cb=new CapacityBase();
		String name="",metric="kW";
		switch(type)
		{
		case 20:
			name="服务器机柜功率";
			break;
		case 21:
			name="接触式服务器机柜冷量";
			break;
		case 22:
			name="微模块功率";
			break;
		case 23:
			name="微模块接触式冷量";
			break;
		case 24:
			name="微模块非接触式冷量";
			break;
		case 25:
			name="网络机柜功率";
			break;
		}
		
		cb.setName(name);
		cb.setMetric(metric);
		//cb.getData().add(getCapacity(DatId,type));
		cb.setData(getCapacity(DatId,type));
		cb.setData_num(cb.getData().size());
		return cb;
	}
	public JSONArray getCapacity(int DatId,int type)
	{
		JSONArray capacity=new JSONArray();
		double RatedValue=0.0,MaxValue=0.0,AvgValue=0.0,CurrentValue=0.0;
		
		switch(type)
		{
		case 20://机柜功耗
			{
				RatedValue=6;
				MaxValue=getMaxValue(DatId,RatedValue);
				AvgValue=getAvgValue(DatId,RatedValue);
				CurrentValue=getCurrentValue(DatId,RatedValue);
				capacity.add(pushVal(RatedValue,"5.额定功率"));
				capacity.add(pushVal(CurrentValue,"4。当前功率"));
				capacity.add(pushVal(RatedValue-CurrentValue,"3.剩余功率"));
				capacity.add(pushVal(AvgValue,"1.平均功率"));
				capacity.add(pushVal(MaxValue,"2.历史最大功率"));
			}	
			break;
		case 21://接触式机柜冷量
			{
				RatedValue=2.85;
				MaxValue=getMaxValue(DatId,RatedValue);
				AvgValue=getAvgValue(DatId,RatedValue);
				CurrentValue=getCurrentValue(DatId,RatedValue);
				capacity.add(pushVal(RatedValue,"5.接触式设计冷量"));
				capacity.add(pushVal(CurrentValue,"4.当前冷量"));
				capacity.add(pushVal(RatedValue-CurrentValue,"3.剩余冷量"));
				capacity.add(pushVal(AvgValue,"1.平均冷量"));
				capacity.add(pushVal(MaxValue,"2.历史最大冷量"));
			}
			break;
		case 22://机房功耗
			{
				RatedValue=93;
				MaxValue=getMaxValue(DatId,RatedValue);
				AvgValue=getAvgValue(DatId,RatedValue);
				CurrentValue=getCurrentValue(DatId,RatedValue);
				capacity.add(pushVal(RatedValue,"5.额定功率"));
				capacity.add(pushVal(CurrentValue,"4.当前功率"));
				capacity.add(pushVal(RatedValue-CurrentValue,"3.剩余功率"));
				capacity.add(pushVal(AvgValue,"1.平均功率"));
				capacity.add(pushVal(MaxValue,"2.历史最大功率"));
			}
			break;
		case 23://接触式机房冷量
			{
				RatedValue=45;
				MaxValue=getMaxValue(DatId,RatedValue);
				AvgValue=getAvgValue(DatId,RatedValue);
				CurrentValue=getCurrentValue(DatId,RatedValue);
				capacity.add(pushVal(RatedValue,"5.接触式设计冷量"));
				capacity.add(pushVal(CurrentValue,"4.当前冷量"));
				capacity.add(pushVal(RatedValue-CurrentValue,"3.剩余冷量"));
				capacity.add(pushVal(AvgValue,"1.平均冷量"));
				capacity.add(pushVal(MaxValue,"2.历史最大冷量"));
			}
			break;
		case 24://非接触式机房冷量
			{
				RatedValue=60;
				MaxValue=getMaxValue(DatId,RatedValue);
				AvgValue=getAvgValue(DatId,RatedValue);
				CurrentValue=getCurrentValue(DatId,RatedValue);
				capacity.add(pushVal(RatedValue,"5.非接触式设计冷量"));
				capacity.add(pushVal(CurrentValue,"4.当前冷量"));
				capacity.add(pushVal(RatedValue-CurrentValue,"3.剩余冷量"));
				capacity.add(pushVal(AvgValue,"1.平均冷量"));
				capacity.add(pushVal(MaxValue,"2.历史最大冷量"));
			}
			break;
		case 25://网络机柜
		{
			RatedValue=3;
			MaxValue=getMaxValue(DatId,RatedValue);
			AvgValue=getAvgValue(DatId,RatedValue);
			CurrentValue=getCurrentValue(DatId,RatedValue);
			capacity.add(pushVal(RatedValue,"5.额定功率"));
			capacity.add(pushVal(CurrentValue,"4.当前功率"));
			capacity.add(pushVal(RatedValue-CurrentValue,"3.剩余功率"));
			capacity.add(pushVal(AvgValue,"1.平均功率"));
			capacity.add(pushVal(MaxValue,"2.历史最大功率"));
		}
		break;
		default:
			break;
		}
		
		return capacity;
	}
	public JSONArray pushVal(double val,String name)
	{
		JSONArray Val=new JSONArray();
		Val.add(name);
		Val.add(getBig(val).setScale(2, BigDecimal.ROUND_HALF_UP));
		return Val;
	}
	public BigDecimal getBig(double val)
	{
		BigDecimal bigDecimal=new BigDecimal(val);
		return bigDecimal;
	}
	public double getMaxValue(int DatId,double RatedValue)//获取最大值,type表示类型，20表示机柜功耗，21表示接触式机柜冷量，22表示机房功耗，23表示接触式机房冷量，24表示非接触式机房冷量
	{
		String sql = String.format("SELECT MAX(MaxValue) AS MaxValue FROM AHistoryDataMinute WHERE Type=1 and DatId=%d and MaxValue<=%.2f",DatId,RatedValue);
		System.out.println(sql);
		SqlServer db=new SqlServer(2);//读取配置库
		double MaxValue=0.0;
		if(db!=null)
		{
			try
			{
				ResultSet rs = null;
				db.connect();
				rs=db.executeQuery(sql, rs);
				while(rs.next())
				{
					MaxValue=rs.getDouble("MaxValue");
				}
			}
			catch(SQLException e)
			{
				db.close();
				e.printStackTrace();
			}
			db.close();
		}
		MaxValue=MaxValue<0.0?0.0:MaxValue;
		return MaxValue;
	}
	public double getAvgValue(int DatId,double RatedValue)//获取平均值
	{
		String sql = String.format("SELECT CurrentValue FROM AHistoryDataMinute WHERE Type=1 and DatId=%d and CurrentValue<=%.2f",DatId,RatedValue);
		System.out.println(sql);
		SqlServer db=new SqlServer(2);//读取配置库
		double Value=0.0,AvgValue=0.0;
		int count=0;
		if(db!=null)
		{
			try
			{
				ResultSet rs = null;
				db.connect();
				rs=db.executeQuery(sql, rs);
				while(rs.next())
				{
					Value=rs.getDouble("CurrentValue");
					AvgValue+=Value;
					count++;
				}
			}
			catch(SQLException e)
			{
				db.close();
				e.printStackTrace();
			}
			db.close();
		}
		if(count!=0)
		{
			AvgValue=AvgValue/count;
		}
		else
		{
			AvgValue=0.0;
		}
		AvgValue=AvgValue<0.0?0.0:AvgValue;
		return AvgValue;
	}
	public double getCurrentValue(int DatId,double RatedValue)//获取当前
	{
		double CurrentValue=0.0;
		Signal signal=new Signal();
		signal.setType(1);
		signal.getSignalLst().add(DatId);
		Client client = ClientBuilder.newClient();
		ReadProperties pro=new ReadProperties();
		String rootPath = pro.getPropertyString();
		WebTarget target = client.target(rootPath);
		Response response = target.request().buildPost(Entity.entity(signal, MediaType.APPLICATION_JSON)).invoke();
        String str = response.readEntity(String.class);
        JSONObject a = JSONObject.fromObject(str);  
        response.close();
        JSONArray json=a.getJSONArray("data");
        for(int i=0;i<json.size();i++)
        {
        	JSONObject jsonobj = json.getJSONObject(i);
        	if(jsonobj.getInt("signalId")==DatId&&jsonobj.getInt("isValid")==1)
        	{
        		CurrentValue=jsonobj.getDouble("aiValue");
        		if(CurrentValue>RatedValue)
        		{
        			CurrentValue=RatedValue;
        		}
        		break;
        	}
        }
        CurrentValue=CurrentValue<0.0?0.0:CurrentValue;
		return CurrentValue;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void getCapacityRPData(int Id,int type,JSONArray data)
	{
		JSONArray DatLst=getDatLstRP(Id,type);
		System.out.println(DatLst.toString());
		JSONObject jsonobj=new JSONObject();
		for(int j=0;j<DatLst.size();j++)
		{
			jsonobj = DatLst.getJSONObject(j);
			CapacityRP crp=getCapacityRP(jsonobj.getInt("DatId"),jsonobj.getInt("Type"));
			crp.setSerial(new Integer(Id).toString());
			data.add(crp);
		}
	}
	public JSONArray getDatLstRP(int Id,int type)
	{
		String sql="";
		JSONArray dat=new JSONArray();
		if(type==0)//表示是电量
		{
			sql = String.format("SELECT distinct EnergyType, DatId FROM AHistoryDataMinute WHERE Type=1 and EnergyType in(20,25) and MachRoomId=%d",Id);
		}
		else if(type==1)//表示制冷
		{
			//sql = String.format("SELECT distinct EnergyType, DatId FROM AHistoryDataMinute WHERE Type=1 and EnergyType in(21,26) and MachRoomId=%d",Id);
			sql = String.format("SELECT distinct EnergyType, DatId FROM AHistoryDataMinute WHERE Type=1 and EnergyType in(21) and MachRoomId=%d",Id);
		}
		System.out.println(sql);
		SqlServer db=new SqlServer(2);//读取能耗库
		if(db!=null)
		{
			try
			{
				ResultSet rs = null;
				db.connect();
				rs=db.executeQuery(sql, rs);
				int DatId=0,Type=0;
				while(rs.next())
				{
					DatId=rs.getInt("DatId");
					Type=rs.getInt("EnergyType");
					JSONObject jsonObj=new JSONObject();
					jsonObj.put("DatId", DatId);
					jsonObj.put("Type", Type);
					dat.add(jsonObj);
				}
			}
			catch(SQLException e)
			{
				db.close();
				e.printStackTrace();
			}
			db.close();
		}
		return dat;
	}
	public CapacityRP getCapacityRP(int DatId,int type)
	{
		CapacityRP crp=new CapacityRP();
		double RatedValue=0.0,MaxValue=0.0,AvgValue=0.0,CurrentValue=0.0;
		
		switch(type)
		{
		case 20://机柜功耗
			{
				RatedValue=6.0;
			}	
			break;
		case 21://接触式机柜冷量
			{
				RatedValue=3.15;
			}
			break;
		case 22://机房功耗
			{
				RatedValue=93.0;
			}
			break;
		case 23://接触式机房冷量
			{
				RatedValue=45.0;
			}
			break;
		case 24://非接触式机房冷量
			{
				RatedValue=60.0;
			}
			break;
		case 25://网络机柜
		{
			RatedValue=3.0;
		}
		break;
		default:
			break;
		}
		MaxValue=getMaxValue(DatId,RatedValue);
		AvgValue=getAvgValue(DatId,RatedValue);
		CurrentValue=getCurrentValue(DatId,RatedValue);
		crp.setAvg(getBig(AvgValue).setScale(2, BigDecimal.ROUND_HALF_UP));
		crp.setCurrent(getBig(CurrentValue).setScale(2, BigDecimal.ROUND_HALF_UP));
		crp.setMax(getBig(MaxValue).setScale(2, BigDecimal.ROUND_HALF_UP));
		crp.setStandard(getBig(RatedValue).setScale(2, BigDecimal.ROUND_HALF_UP));
		return crp;
	}
}
