package com.wincom.mstar.impl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.opensymphony.xwork2.ActionSupport;
import com.wincom.mstar.Room;
import com.wincom.mstar.sqlserver.ReadProperties;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class CloudChartResponse extends ActionSupport{
	private JSONArray data =new JSONArray();
	private int error;
	private int Serial;
	private String message="success";
	public void setSerial(int Serial)
	{
		this.Serial=Serial;
	}
	public JSONArray getData() {
		return data;
	}
	public void setData(JSONArray data) {
		this.data = data;
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String responseCloudChart()
	{
		System.out.println(Serial);
		Client client = ClientBuilder.newClient();
		ReadProperties pro=new ReadProperties();
		String rootPath = pro.getPropertyString();
		System.out.println(rootPath);
		WebTarget target = client.target(rootPath);
		//WebTarget target = client.target("http://192.168.0.33:8088/realdata");
		Room room = new Room(Serial,2);
        Response response = target.request().buildPost(Entity.entity(room, MediaType.APPLICATION_JSON)).invoke();
        String str = response.readEntity(String.class);
        JSONObject a = JSONObject.fromObject(str);  
        setError(a.getInt("error"));
        setMessage(a.getString("message"));
        if(getError()==0)
        {
        	setData(a.getJSONArray("data"));
        }       
        response.close();
		return "success";
	}
}
