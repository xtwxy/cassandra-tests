package com.wincom.mstar.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.opensymphony.xwork2.ActionSupport;
import com.wincom.mstar.AlarmPO;
import com.wincom.mstar.Capacity;
import com.wincom.mstar.CapacityBase;
import com.wincom.mstar.Signal;
import com.wincom.mstar.dao.MonitorServiceDAO;
import com.wincom.mstar.dao.impl.MonitorServiceDAOImpl;
import com.wincom.mstar.sqlserver.ReadProperties;
import com.wincom.mstar.sqlserver.SqlServer;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class CapacityResponse extends ActionSupport {
	private String serialLst;
	private int type;//0表示机房，1表示机柜,2表示单个信号
	private JSONArray class_data=new JSONArray();
	public void setSerial(String serialLst)
	{
		this.serialLst=serialLst;
	}
	public String getSerial()
	{
		return this.serialLst;
	}
	public void setType(int type)
	{
		this.type=type;
	}
	public JSONArray getClass_data()
	{
		return class_data;
	}
	public void setClass_data(JSONArray class_data)
	{
		this.class_data=class_data;
	}
	public String responseCapacity()
	{
		System.out.println(type);
		System.out.println(serialLst);
		MonitorServiceDAO monitorServiceDAO=new MonitorServiceDAOImpl();
		//setClass_data(monitorServiceDAO.getCapacityData(serialLst,type));
		monitorServiceDAO.getCapacityData(serialLst,type,getClass_data());
		return "success";
	}
}
