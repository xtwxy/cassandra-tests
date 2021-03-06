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
import com.wincom.mstar.EnergyBase;
import com.wincom.mstar.HistoryDataObj;
import com.wincom.mstar.Signal;
import com.wincom.mstar.sqlserver.ReadProperties;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class PUEResponse extends ActionSupport {
	private int error=0;
	private String serial;
	private JSONArray data=new JSONArray();
	public void setSerial(String serial)
	{
		this.serial=serial;
	}
	public void setError(int error)
	{
		this.error=error;
	}
	public int getError()
	{
		return error;
	}
	public void setData(JSONArray data)
	{
		this.data=data;
	}
	public JSONArray getData()
	{
		return data;
	}
	public BigDecimal Big(double val)
	{
		BigDecimal bigDecimal=new BigDecimal(val);
		return bigDecimal;
	}
	public String responsePUE() 
	{
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
        /*Map<Integer,HistoryDataObj> map =new HashMap<Integer, HistoryDataObj>();
        EnergyBase eb=new EnergyBase();
        String SignalIdLst=eb.getSignalId(DatArr);//获得实时数据中的对象Id
        eb.getSignalInfo(map,SignalIdLst);//获得id对应的最大值，最小值以及配置的单位
        HistoryDataObj hdo=null;*/
        /*
         * {"count":2,"data":[{"signalId":529327,"isValid":1,"signalType":"AI","diValue":0,"aiValue":55265.222656,"signalName":"A相电压"},{"signalId":529329,"isValid":1,"signalType":"AI","diValue":0,"aiValue":-5052902.5,"signalName":"A相电流"}],"message":"success"}
         */
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
        		/*hdo=null;
        		hdo=map.get(new Integer(SignalId));*/
        		obj.put("name", SignalName);
        		obj.put("value", Big(aiValue).setScale(2, BigDecimal.ROUND_HALF_UP));
        		obj.put("metric", "");
        		JSONArray arr=new JSONArray();
        		arr.add(0,1);
        		arr.add(1,2);
        		obj.put("range", arr);
        		
        		/*if(hdo!=null)
        		{
        			val=String.format("%.2f", aiValue,hdo.getMetric());
        		}
        		else
        		{
        			val=String.format("%.2f", aiValue);
        		}*/
        		
        		getData().add(obj);
        	}
        }
        
        return "success";
	}
}
