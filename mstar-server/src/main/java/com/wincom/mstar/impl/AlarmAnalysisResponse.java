package com.wincom.mstar.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.opensymphony.xwork2.ActionSupport;
import com.wincom.mstar.EnergyBase;

import net.sf.json.JSONArray;

public class AlarmAnalysisResponse extends ActionSupport{
	private String startTime;
	private String endTime;
	private JSONArray class_data=new JSONArray();
	public JSONArray getClass_data()
	{
		return class_data;
	}
	public void setClass_data(JSONArray class_data)
	{
		this.class_data=class_data;
	}
	public void setStartTime(String startTime)
	{
		this.startTime=startTime;
	}
	public void setEndTime(String endTime)
	{
		this.endTime=endTime;
	}
	public String responseAlarmAnalysis()
	{
		EnergyBase eb=new EnergyBase();
		eb.getAlarmLevelAnalysis(startTime, endTime, this);
		return "success";
	}
}
