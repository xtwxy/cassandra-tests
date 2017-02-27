package com.wincom.mstar;

public class Device {
	public Device() {
		super();
	}
	public Device(int deviceId,int type) {
		super();
		this.deviceId = deviceId;
		this.type=type;
	}

	private int deviceId;
	private int type;
	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
