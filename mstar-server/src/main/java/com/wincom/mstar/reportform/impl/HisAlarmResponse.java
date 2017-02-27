package com.wincom.mstar.reportform.impl;

import java.util.LinkedList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wincom.mstar.Alarm;
import com.wincom.mstar.AlarmPO;
import com.wincom.mstar.dao.MonitorServiceDAO;
import com.wincom.mstar.dao.impl.MonitorServiceDAOImpl;

import net.sf.json.JSONObject;

public class HisAlarmResponse extends ActionSupport {
	private List<Alarm> data = new LinkedList<Alarm>();
	private int count;
	private int code;
	private String message;
	private String dataJson;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Alarm> getData() {
		return data;
	}
	//public void setData(List<Alarm> data) {
	//	this.data = data;
	//}
	
	public void setData(String dataJson)//收到客户端信息
	{
		this.dataJson=dataJson;
	}
	public String responseHisAlarm()
	{
		System.out.println(dataJson);
		JSONObject dat=JSONObject.fromObject(dataJson);
		int type=dat.getInt("type");
		String name=dat.getString("name");
		String startTime=dat.getString("startTime");
		String endTime=dat.getString("endTime");
		MonitorServiceDAO monitorServiceDAO=new MonitorServiceDAOImpl();
		List<AlarmPO> alarm=monitorServiceDAO.getHisAlarm(type, name, startTime, endTime);
		setCode(0);
		setMessage("success");
		for(int i=0;i<alarm.size();i++){
			getData().add(AlarmPOToAlarm(alarm.get(i)));
		}
		setCount(getData().size());
		return "success";
	}
	private Alarm AlarmPOToAlarm(AlarmPO po){
		Alarm alarm = new Alarm();
		alarm.setAlarmLevel(po.getAlarmLevel());
		alarm.setDeviceName(po.getDeviceName());
		alarm.setSignalId(po.getSignalId());
		alarm.setSignalName(po.getSignalName());
		alarm.setStation(po.getStation());
		alarm.setLevel(po.getLevel());
		alarm.setSerial(po.getSerial());
		alarm.setAlarmBegin(po.getAlarmBegin());
		alarm.setAlarmEnd(po.getAlarmEnd());
		alarm.setParent_id(po.getParent_id());
		alarm.setRemarks("");
		alarm.setAckStatus(po.getAckStatus());
		return alarm;
	}
}
