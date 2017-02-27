package com.wincom.mstar;
import java.math.BigDecimal;

import net.sf.json.JSONArray;
public class SignalRealData {
	private String name;
	private BigDecimal value;
	private String metric;
	private int alarm;
	private JSONArray range=new JSONArray();
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	
	public void setValue(BigDecimal value)
	{
		this.value=value;
	}
	public BigDecimal getValue()
	{
		return this.value;
	}
	
	public void setMetric(String metric)
	{
		this.metric=metric;
	}
	public String getMetric()
	{
		return this.metric;
	}
	
	public void setAlarm(int alarm)
	{
		this.alarm=alarm;
	}
	public int getAlarm()
	{
		return this.alarm;
	}
	
	public void setRange(JSONArray range)
	{
		this.range=range;
	}
	public JSONArray getRange()
	{
		return this.range;
	}
}
