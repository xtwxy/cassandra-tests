package com.wincom.mstar.dao;

import java.util.List;
import com.wincom.mstar.AlarmPO;
import com.wincom.mstar.DevicePropertyPO;

import net.sf.json.JSONArray;

public interface MonitorServiceDAO {
	public List<BaseConfig> getConfig(int parentId);
	public List<BaseConfig> getSignal(int parentDeviceId);
	public DevicePropertyPO getDeviceProperty(int deviceId);
	public List<AlarmPO> getAllAlarm();
	public List<AlarmPO> getDeviceAlarm(int deviceId);
	public List<AlarmPO> getAllAlarm(int objId);
	public List<AlarmPO> getHisAlarm(int type,String name,String startTime,String endTime);
	public JSONArray getCapacityData(String IdLst,int type,JSONArray data);
	public void getCapacityRPData(int Id,int type,JSONArray data);
}
