package com.wincom.mstar.impl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.opensymphony.xwork2.ActionSupport;
import com.wincom.mstar.sqlserver.ReadProperties;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.wincom.mstar.Device;
import com.wincom.mstar.Signal;

public class RealDataResponse extends ActionSupport {
	private int deviceId;
	private int count;
	private String signalLst;
	private String message;
	private JSONArray data=new JSONArray();
	public void setSignalLst(String signalLst)
	{
		this.signalLst=signalLst;
	}
	public void setDeviceId(int deviceId)
	{
		this.deviceId=deviceId;
	}
	public int getDeviceId()
	{
		return deviceId;
	}
	public void setCount(int count)
	{
		this.count=count;
	}
	public int getCount()
	{
		return count;
	}
	public void setMessage(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
	public void setData(JSONArray data)
	{
		this.data=data;
	}
	public JSONArray getData()
	{
		return data;
	}
	public String responseDevRealdata() 
	{
		Client client = ClientBuilder.newClient();
		ReadProperties pro=new ReadProperties();
		String rootPath = pro.getPropertyString();
		//System.out.println(rootPath);
		//WebTarget target = client.target("http://192.168.0.33:8088/realdata");
		//System.out.println(deviceId);
		WebTarget target = client.target(rootPath);
		Device device = new Device(deviceId,0);
        Response response = target.request().buildPost(Entity.entity(device, MediaType.APPLICATION_JSON)).invoke();
        String str = response.readEntity(String.class);
        JSONObject a = JSONObject.fromObject(str);  
        setMessage(a.getString("message"));
        setDeviceId(a.getInt("deviceId"));
        setCount(a.getInt("count"));
        setData(a.getJSONArray("data"));
        response.close();  
        return "success";
	}
	public String responseDatRealdata() 
	{
		Signal signal=new Signal();
		signal.setType(1);
		String []strArr=signalLst.split(",");
		for(int i=0;i<strArr.length;i++)
		{
			if(strArr[i].compareToIgnoreCase("")==0)
			{
				continue;
			}
			signal.getSignalLst().add(new Integer(strArr[i]).intValue());
		}
		Client client = ClientBuilder.newClient();
		ReadProperties pro=new ReadProperties();
		String rootPath = pro.getPropertyString();
		//System.out.println(rootPath);
		//WebTarget target = client.target("http://192.168.0.33:8088/realdata");
		WebTarget target = client.target(rootPath);
		Response response = target.request().buildPost(Entity.entity(signal, MediaType.APPLICATION_JSON)).invoke();
        String str = response.readEntity(String.class);
        JSONObject a = JSONObject.fromObject(str);  
        setMessage(a.getString("message"));
        setCount(a.getInt("count"));
        setData(a.getJSONArray("data"));
        setDeviceId(0);
        response.close();
        return "success";
	}
}
