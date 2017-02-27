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
import com.wincom.mstar.Device;
import com.wincom.mstar.DeviceRealData;
import com.wincom.mstar.EnergyBase;
import com.wincom.mstar.HistoryDataObj;
import com.wincom.mstar.SignalRealData;
import com.wincom.mstar.readconfig.ReadConfig;
import com.wincom.mstar.sqlserver.ReadProperties;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
public class DeviceRealDataResponse extends ActionSupport  {
	private String data;
	private int error=0;
	private String message="success";
	private JSONArray json=new JSONArray();
	Map<String,String> filetermap =new HashMap<String, String>();
	public JSONArray getData()
	{
		return this.json;
	}
	public int getError()
	{
		return this.error;
	}
	public void setError(int error)
	{
		this.error=error;
	}
	public String getMessage()
	{
		return this.message;
	}
	public void setData(String data)
	{
		this.data=data;
	}
	public JSONObject sendDev(int deviceId)
	{
		Client client = ClientBuilder.newClient();
		ReadProperties pro=new ReadProperties();
		String rootPath = pro.getPropertyString();
		WebTarget target = client.target(rootPath);
		Device device = new Device(deviceId,0);
        Response response = target.request().buildPost(Entity.entity(device, MediaType.APPLICATION_JSON)).invoke();
        String str = response.readEntity(String.class);
        JSONObject json = JSONObject.fromObject(str);  
        response.close();
		return json;
	}
	public void Fileter(Map<String,String> map)
	{
		ReadConfig rc=new ReadConfig();
		String filetername=rc.getFilter();
		String[] fileter = filetername.split(",");
		for(int i=0;i<fileter.length;i++)
		{
			map.put(fileter[i], fileter[i]);
		}
	}
	public String responseDev()
	{
		Fileter(filetermap);
		System.out.println(data);
		EnergyBase eb=new EnergyBase();
		Map<Integer,HistoryDataObj> map =new HashMap<Integer, HistoryDataObj>();
		JSONObject dat=JSONObject.fromObject(data);
		JSONArray serials=dat.getJSONArray("serials");
		for(int i=0;i<serials.size();i++)
		{
			map.clear();
			String serial=serials.getString(i);
			if(serial.compareToIgnoreCase("")==0)
			{
				continue;
			}
			int serialId = Integer.parseInt(serial);
			JSONObject json=sendDev(serialId);
			JSONArray jsonArray=json.getJSONArray("data");
			String signalLstId=eb.getSignalLst(jsonArray);
			eb.getSignalInfo(map,signalLstId);
			DeviceRealData drd=new DeviceRealData();
			drd.setSerial(serial);
			for(int j=0;j<jsonArray.size();j++)
			{
				JSONObject signalDat=jsonArray.getJSONObject(j);
				
				int isValid=signalDat.getInt("isValid");
				if(isValid==1)
				{
					int signalId=signalDat.getInt("signalId");
					String signalType=signalDat.getString("signalType");
					int diValue=signalDat.getInt("diValue");
					double aiValue=signalDat.getDouble("aiValue");
					String signalName=signalDat.getString("signalName");
					if(filetermap.get(signalName)==null)
					{
						continue;
					}
					HistoryDataObj value;
					value = map.get(new Integer(signalId));
					SignalRealData srd=new SignalRealData();
					srd.setAlarm(diValue);
					srd.setMetric(value.getMetric());
					srd.setName(signalName);
					srd.setRange(value.getRange());
					if(signalType.compareToIgnoreCase("AI")==0)
					{
						srd.setValue(eb.getBig(aiValue).setScale(2, BigDecimal.ROUND_HALF_UP));
						srd.setAlarm(0);
					}
					else if(signalType.compareToIgnoreCase("DI")==0)
					{
						srd.setValue(eb.getBig(diValue).setScale(0, BigDecimal.ROUND_HALF_UP));
						srd.setAlarm(diValue);
					}
					drd.getData().add(srd);
				}
			}
			getData().add(drd);
		}
		setError(0);
		return "success";
	}
}
