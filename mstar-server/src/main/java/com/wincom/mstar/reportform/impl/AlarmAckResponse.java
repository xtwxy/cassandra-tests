package com.wincom.mstar.reportform.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.sql.SQLException;
import com.opensymphony.xwork2.ActionSupport;
import com.wincom.mstar.dao.BaseConfig;
import com.wincom.mstar.sqlserver.SqlServer;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class AlarmAckResponse extends ActionSupport{
	private String dataJson;
	private JSONObject data=new JSONObject();
	private String message;
	private int error;
	public void setData(String dataJson)//收到客户端信息
	{
		this.dataJson=dataJson;
	}
	public String getMessage()
	{
		return this.message;
	}
	public int getError()
	{
		return this.error;
	}
	public String responseAlarmAck()
	{
		System.out.println(dataJson);
		LocalDateTime localtDateAndTime = LocalDateTime.now(); 
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String ackTime=localtDateAndTime.format(formatter); 
		String singalLst="";
		JSONObject dat=JSONObject.fromObject(dataJson);
		int type=dat.getInt("type");
		String ackUser=dat.getString("ackUser");
		String remarks=dat.getString("remarks");
		String sql="";
		if(type!=0)
		{
			JSONArray datArr=dat.getJSONArray("serials");
			JSONArray jsonDat=new JSONArray();
			for(int i=0;i<datArr.size();i++)
			{
				String idStr=datArr.getString(i);
				if(idStr.compareToIgnoreCase("")==0)
				{
					continue;
				}
				if(i==0)
				{
					singalLst=idStr;
				}
				else
				{
					singalLst=singalLst+","+idStr;
				}
			}
			if(singalLst.compareToIgnoreCase("")==0)
			{
				message="在确认时，信号ID为空";
				error=1;
			}
			else
			{
				sql=String.format("update AAlarmData set AckStatus=1,AckUserName='%s',AckTime='%s' where DataObjectID in(%s)",ackUser,ackTime,singalLst);
			}
		}
		else
		{
			sql=String.format("update AAlarmData set AckStatus=1,AckUserName='%s',AckTime='%s'",ackUser,ackTime);
		}
		message="";
		error=0;
		SqlServer db=new SqlServer(0);//读取配置库
		if(db!=null)
		{
			db.connect();
			db.executeUpdate(sql);
			db.close();
		}
		return "success";
	}
}
