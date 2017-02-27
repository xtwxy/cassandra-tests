package com.wincom.mstar.impl;

import java.util.LinkedList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wincom.mstar.Alarm;
import com.wincom.mstar.EnergyBase;
import com.wincom.mstar.dao.MonitorServiceDAO;
import com.wincom.mstar.dao.impl.MonitorServiceDAOImpl;
import com.wincom.mstar.AlarmPO;
public class HisAlarmResponse extends ActionSupport {
	private List<Alarm> data = new LinkedList<Alarm>();
	private int count;
	private int code;
	private String message;
	//*****************************
	private String name;
	private int serial;
	private int type;
	private String startTime;
	private String endTime;
	private int deviceId;
	public void setStartTime(String startTime)
	{
		this.startTime=startTime;
	}
	public void setEndTime(String endTime)
	{
		this.endTime=endTime;
	}
	public void setType(int type)
	{
		this.type=type;
	}
	public void setDeviceId(int deviceId)
	{
		this.deviceId=deviceId;
	}
	public void setSerial(int serial)
	{
		this.serial=serial;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	//*****************************
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
	public void setData(List<Alarm> data) {
		this.data = data;
	}
	public String responseHisAlarm()
	{
		/*EnergyBase eb=new EnergyBase();
		List<AlarmPO> alarm =eb.getHisAlarm(type, name, startTime, endTime);
		setCode(0);
		setMessage("success");
		for(int i=0;i<alarm.size();i++){
			getData().add(AlarmPOToAlarm(alarm.get(i)));
		}
		setCount(getData().size());*/
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
	public String responseAllAlarm()
	{
		MonitorServiceDAO monitorServiceDAO=new MonitorServiceDAOImpl();
		List<AlarmPO> alarm;
		System.out.println(type);
		if(type==0)//表示获取所有的告警
		{
			alarm=monitorServiceDAO.getAllAlarm();
		}
		else
		{
			alarm=monitorServiceDAO.getAllAlarm(serial);
		}
		setCode(0);
		setMessage("success");
		for(int i=0;i<alarm.size();i++){
			getData().add(AlarmPOToAlarm(alarm.get(i)));
		}
		setCount(getData().size());
		return "success";
	}
	public String responseDeviceAlarm()
	{
		MonitorServiceDAO monitorServiceDAO=new MonitorServiceDAOImpl();
		List<AlarmPO> alarm =monitorServiceDAO.getDeviceAlarm(serial);
		setCode(0);
		setMessage("success");
		for(int i=0;i<alarm.size();i++){
			getData().add(AlarmPOToAlarm(alarm.get(i)));
		}
		setCount(getData().size());
		return "success";
	}
/*	public String responseHisAlarm()
	{
		MonitorServiceDAO monitorServiceDAO=new MonitorServiceDAOImpl();
		List<AlarmPO> alarm =monitorServiceDAO.getDeviceAlarm(serial);
		setCode(0);
		setMessage("success");
		for(int i=0;i<alarm.size();i++){
			getData().add(AlarmPOToAlarm(alarm.get(i)));
		}
		setCount(getData().size());
		return "success";
	}*/
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
		alarm.setAckStatus(po.getAckStatus());
		return alarm;
	}
}
