package com.wincom.mstar.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.wincom.mstar.EnergyBase;
import com.wincom.mstar.HistoryDataObj;
import com.wincom.mstar.domain.HistoryAI;

import net.sf.json.JSONObject;
public class EnergyResponse extends ActionSupport {
	Log log = LogFactory.getLog(this.getClass());
	
	private String serial;
	private int type;
	private int timeType;
	private String startTime;
	private String endTime;
	private String signalLstId;
	private JSONObject trend_data =new JSONObject();
	@Autowired
	EnergyBase eb;
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
		eb.getEnergy(serial, type, timeType, startTime, endTime, this);
		return "success";
	}
	public String responseToDay()
	{
		String str="",startTime="",endTime="";
		LocalDateTime localtDateAndTime = LocalDateTime.now(); 
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		endTime=localtDateAndTime.format(formatter); 
		DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("yyyy-MM-dd 00:00:00");
		startTime=localtDateAndTime.format(formatter1); 
		eb.getEnergy(serial, type, timeType, startTime, endTime, this);
		return "success";
	}
	
	private List<Integer> convertStringToIntegers(String str) {
		List<Integer> l = new ArrayList<>();
		if(l != null) {
			String[] sa = str.split(",");
			for(String s: sa) {
				l.add(Integer.valueOf(s.trim()));
			}
		}
		return l;
	}
	
	private Date parseDatetime(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
	
	public String responseHisData() 
	{
		// eb.getHisData(serial, type,startTime, endTime, this);
		Date begin = parseDatetime(startTime);
		Date end = parseDatetime(endTime);
		
		Map<Integer,HistoryDataObj> map =new HashMap<Integer, HistoryDataObj>();
		eb.getSignalInfo(map, serial);

		Iterable<HistoryAI> history = eb.selectHistoryAIByIdAndTsRange(convertStringToIntegers(serial), begin, end, type);
		
		for(HistoryAI h : history) {
			eb.convertHistoryAIToJsonArray(map, h.getId(), h.getTs(), h.getValue());
		}
		
		eb.setHistoryAIToResponse(this, map);
		
		return "success";
	}
	
	public String responseCurve()
	{
		eb.getCurve(serial, this);
		return "success";
	}
}
