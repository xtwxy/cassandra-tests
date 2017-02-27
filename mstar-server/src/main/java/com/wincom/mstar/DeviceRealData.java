package com.wincom.mstar;
import net.sf.json.JSONArray;
public class DeviceRealData {
	private String serial;
	private JSONArray data=new JSONArray();
	public void setSerial(String serial)
	{
		this.serial=serial;
	}
	public String getSerial()
	{
		return this.serial;
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
