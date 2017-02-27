package com.wincom.mstar;

import net.sf.json.JSONArray;

public class HistoryDataObj {
	private String serial;
	private String name;
	private String metric;
	private JSONArray range=new JSONArray();
	private int data_num;
	private JSONArray data=new JSONArray();
	public void setSerial(String serial)
	{
		this.serial=serial;
	}
	public String getSerial()
	{
		return serial;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setMetric(String metric)
	{
		this.metric=metric;
	}
	public String getMetric()
	{
		return metric;
	}
	
	public void setRange(JSONArray range)
	{
		this.range=range;
	}
	public JSONArray getRange()
	{
		return range;
	}
	
	public void setData_num(int data_num)
	{
		this.data_num=data_num;
	}
	public int getData_num()
	{
		return data_num;
	}
	
	public void setData(JSONArray data)
	{
		this.data=data;
	}
	public JSONArray getData()
	{
		return data;
	}
}
