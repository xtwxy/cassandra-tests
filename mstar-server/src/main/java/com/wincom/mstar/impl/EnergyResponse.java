package com.wincom.mstar.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;
import com.wincom.mstar.*;
public class EnergyResponse extends ActionSupport {
	private String serial;
	private int type;
	private int timeType;
	private String startTime;
	private String endTime;
	private String signalLstId;
	private JSONObject trend_data =new JSONObject();
	public JSONObject getTrend_data() {
		return trend_data;
	}
	public void setTrend_data(JSONObject data) {
		this.trend_data = data;
	}
	public void setSerial(String serial)
	{
		this.serial=serial;
	}
	public void setType(int type)
	{
		this.type=type;
	}
	public void setTimeType(int timeType)
	{
		this.timeType=timeType;
	}
	public void setStartTime(String startTime)
	{
		this.startTime=startTime;
	}
	public void setEndTime(String endTime)
	{
		this.endTime=endTime;
	}
	public void setSignalLstId(String signalLstId)
	{
		this.signalLstId=signalLstId;
	}
	public String responseHis()
	{
		System.out.println(serial);
		System.out.println(type);
		System.out.println(timeType);
		System.out.println(startTime);
		System.out.println(endTime);
		EnergyBase eb=new EnergyBase();
		eb.getEnergy(serial, type, timeType, startTime, endTime, this);
		return "success";
	}
	public String responseToDay()
	{
		EnergyBase eb=new EnergyBase();
		String str="",startTime="",endTime="";
		LocalDateTime localtDateAndTime = LocalDateTime.now(); 
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		endTime=localtDateAndTime.format(formatter); 
		DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("yyyy-MM-dd 00:00:00");
		startTime=localtDateAndTime.format(formatter1); 
		eb.getEnergy(serial, type, timeType, startTime, endTime, this);
		return "success";
	}
	public String responseHisData()
	{
		EnergyBase eb=new EnergyBase();
		eb.getHisData(serial, type,startTime, endTime, this);
		return "success";
	}
	public String responseCurve()
	{
		EnergyBase eb=new EnergyBase();
		eb.getCurve(serial, this);
		return "success";
	}
}
