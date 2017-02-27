package com.wincom.mstar;

import net.sf.json.JSONArray;

public class CapacityBase {
	private String name;
	private String metric;
	private int data_num;
	private JSONArray data=new JSONArray();
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	
	public void setMetric(String metric)
	{
		this.metric=metric;
	}
	public String getMetric()
	{
		return this.metric;
	}
	
	public void setData_num(int data_num)
	{
		this.data_num=data_num;
	}
	public int getData_num()
	{
		return this.data_num;
	}
	
	public void setData(JSONArray data)
	{
		this.data=data;
	}
	public JSONArray getData()
	{
		return this.data;
	}
}
