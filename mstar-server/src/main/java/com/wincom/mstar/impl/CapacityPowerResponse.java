package com.wincom.mstar.impl;

import com.opensymphony.xwork2.ActionSupport;
import com.wincom.mstar.dao.MonitorServiceDAO;
import com.wincom.mstar.dao.impl.MonitorServiceDAOImpl;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class CapacityPowerResponse extends ActionSupport{
	private String data;
	private int code=1;
	private String metric="KW";
	private JSONObject json=new JSONObject();
	public JSONObject getData()//传入客户端信息
	{
		return this.json;
	}
	public int getCode()//传入客户端信息
	{
		return this.code;
	}
	public String getMetric()//传入客户端信息
	{
		return this.metric;
	}
	
	public void setData(String data)//收到客户端信息
	{
		this.data=data;
	}
	public String responseP()
	{
		JSONObject dat=JSONObject.fromObject(data);
		JSONArray datArr=dat.getJSONArray("serials");
		JSONArray jsonDat=new JSONArray();
		MonitorServiceDAO monitorServiceDAO=new MonitorServiceDAOImpl();
		for(int i=0;i<datArr.size();i++)
		{
			String idStr=datArr.getString(i);
			if(idStr.compareToIgnoreCase("")==0)
			{
				continue;
			}
			int id=new Integer(idStr).intValue();
			monitorServiceDAO.getCapacityRPData(id,0,jsonDat);
		}
		getData().put("power", jsonDat);
		return "success";
	}
	public String responseR()
	{
		JSONObject dat=JSONObject.fromObject(data);
		JSONArray datArr=dat.getJSONArray("serials");
		JSONArray jsonDat=new JSONArray();
		MonitorServiceDAO monitorServiceDAO=new MonitorServiceDAOImpl();
		for(int i=0;i<datArr.size();i++)
		{
			String idStr=datArr.getString(i);
			if(idStr.compareToIgnoreCase("")==0)
			{
				continue;
			}
			int id=new Integer(idStr).intValue();
			monitorServiceDAO.getCapacityRPData(id,1,jsonDat);
		}
		getData().put("refrigerating", jsonDat);
		return "success";
	}
}
