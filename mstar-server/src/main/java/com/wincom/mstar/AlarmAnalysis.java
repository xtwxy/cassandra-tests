package com.wincom.mstar;

import net.sf.json.JSONArray;

public class AlarmAnalysis {
	private String name;
	private String metric;
	private int data_num;
	private JSONArray data=new JSONArray();
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getMetric()
	{
		return metric;
	}
	public void setMetric(String metric)
	{
		this.metric=metric;
	}
	
	public int getData_num()
	{
		return data_num;
	}
	public void setData_num(int data_num)
	{
		this.data_num=data_num;
	}
	
	public JSONArray getData()
	{
		return data;
	}
	public void setData(JSONArray data)
	{
		this.data=data;
	}
}
