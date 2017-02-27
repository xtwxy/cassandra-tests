package com.wincom.mstar.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.opensymphony.xwork2.ActionSupport;
import com.wincom.mstar.AlarmAnalysis;
import com.wincom.mstar.EnergyBase;
import com.wincom.mstar.HistoryDataObj;
import com.wincom.mstar.Signal;
import com.wincom.mstar.sqlserver.ReadProperties;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class RealDataPowerResponse extends ActionSupport {
	private JSONArray class_data=new JSONArray();
	private String serial;
	public void setSerial(String serial)
	{
		this.serial=serial;
	}
	public JSONArray getClass_data()
	{
		return class_data;
	}
	public void setClass_data(JSONArray class_data)
	{
		this.class_data=class_data;
	}
	public BigDecimal Big(double val)
	{
		BigDecimal bigDecimal=new BigDecimal(val);
		return bigDecimal;
	}
	public String responsePowerAnalysis()
	{
		//EnergyBase eb=new EnergyBase();
		//eb.getAlarmLevelAnalysis(startTime, endTime, this);
		Signal signal=new Signal();
		signal.setType(1);
		String []strArr=serial.split(",");
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
		System.out.println(rootPath);
		//WebTarget target = client.target("http://192.168.0.33:8088/realdata");
		WebTarget target = client.target(rootPath);
		Response response = target.request().buildPost(Entity.entity(signal, MediaType.APPLICATION_JSON)).invoke();
        String str = response.readEntity(String.class);
        response.close();
        //*************************************
        JSONObject a = JSONObject.fromObject(str);  
        JSONArray DatArr=a.getJSONArray("data");//获得实时数据
        /*
         * {"count":2,"data":[{"signalId":529327,"isValid":1,"signalType":"AI","diValue":0,"aiValue":55265.222656,"signalName":"A相电压"},{"signalId":529329,"isValid":1,"signalType":"AI","diValue":0,"aiValue":-5052902.5,"signalName":"A相电流"}],"message":"success"}
         */
        int count=0;
        AlarmAnalysis aay=new AlarmAnalysis();
        for(int i=0;i<DatArr.size();i++)
        {
        	JSONObject jsonobj=DatArr.getJSONObject(i);
        	String signalType=jsonobj.getString("signalType");
        	int SignalId=jsonobj.getInt("signalId");
    		String SignalName=jsonobj.getString("signalName");
    		JSONObject obj=new JSONObject();
    		String val;
        	if(signalType.compareToIgnoreCase("AI")==0)
        	{
        		double aiValue=jsonobj.getDouble("aiValue");
        		JSONArray tmp1=new JSONArray();
        		tmp1.add(SignalName);
        		tmp1.add(Big(aiValue).setScale(2, BigDecimal.ROUND_HALF_UP));
        		count++;
        		aay.getData().add(tmp1);
        	}
        }
		aay.setData_num(count);
		aay.setMetric("个");
		aay.setName("能耗分析");
		getClass_data().add(aay);
		return "success";
	}
}
