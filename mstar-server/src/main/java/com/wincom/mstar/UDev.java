package com.wincom.mstar;

import net.sf.json.JSONArray;

public class UDev {
	private JSONArray udev_info=new JSONArray();
	private int cabinet;
	public void setUdev_info(JSONArray udev_info)
	{
		this.udev_info=udev_info;
	}
	public JSONArray getUdev_info()
	{
		return this.udev_info;
	}
	
	public void setCabinet(int cabinet)
	{
		this.cabinet=cabinet;
	}
	public int getCabinet()
	{
		return this.cabinet;
	}
}
