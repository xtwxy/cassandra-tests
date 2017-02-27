package com.wincom.mstar;

import java.util.Date;

public class AlarmPO {
	private int signalId;
	private String station;
	private String deviceName;
	private String signalName;
	private String alarmBegin;
	private String alarmEnd;
	private String alarmLevel;
	private int level;
	private int serial;
	private int parent_id;
	private int ackStatus;
	public int getSignalId() {
		return signalId;
	}
	public void setSignalId(int signalId) {
		this.signalId = signalId;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getSignalName() {
		return signalName;
	}
	public void setSignalName(String signalName) {
		this.signalName = signalName;
	}
	public String getAlarmBegin() {
		return alarmBegin;
	}
	public void setAlarmBegin(String alarmBegin) {
		this.alarmBegin = alarmBegin;
	}
	public String getAlarmEnd() {
		return alarmEnd;
	}
	public void setAlarmEnd(String alarmEnd) {
		this.alarmEnd = alarmEnd;
	}
	public String getAlarmLevel() {
		return alarmLevel;
	}
	public void setAlarmLevel(String alarmLevel) {
		this.alarmLevel = alarmLevel;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public int getAckStatus() {
		return ackStatus;
	}
	public void setAckStatus(int ackStatus) {
		this.ackStatus = ackStatus;
	}
	
	
	
}
