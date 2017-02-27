package com.wincom.mstar;
public class DataObj {
	private String serial;
	private String name;
	private int getParentId;
	public void setSerial(String serial)
	{
		this.serial=serial;
	}
	public String getSerial()
	{
		return serial;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setParentId(int getParentId)
	{
		this.getParentId=getParentId;
	}
	public int getParentId()
	{
		return getParentId;
	}
}
