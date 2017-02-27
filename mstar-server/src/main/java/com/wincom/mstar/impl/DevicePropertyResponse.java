package com.wincom.mstar.impl;
import java.util.LinkedList;
import java.util.List;
import com.wincom.mstar.PropertyKV;
import com.wincom.mstar.dao.MonitorServiceDAO;
import com.wincom.mstar.dao.impl.MonitorServiceDAOImpl;
import com.wincom.mstar.DevicePropertyPO;;
public class DevicePropertyResponse extends BaseResponse {
	private List<PropertyKV> data = new LinkedList<PropertyKV>();
	private int serial=0;
	public List<PropertyKV> getData() {
		return data;
	}
	public void setData(List<PropertyKV> data) {
		this.data = data;
	}
	//***************
	
	//serial
	public void setSerial(int serial)
	{
		this.serial=serial;
	}
	//***************
	public String responseDevProperty()
	{
		MonitorServiceDAO monitorServiceDAO=new MonitorServiceDAOImpl();
		DevicePropertyPO po = monitorServiceDAO.getDeviceProperty(serial);
		setCode(0);
		setMessage("success");
		if(po==null){
			setCode(1);
			setMessage("设备未发现");
			setCount(0);
		}else{
			setCode(0);
			setMessage("success");
			PropertyKV kv1 = new PropertyKV();
			kv1.setAttr_name("设备厂家");
			kv1.setAttr_value(po.getProducer());
			getData().add(kv1);
			
			PropertyKV kv2 = new PropertyKV();
			kv2.setAttr_name("设备型号");
			kv2.setAttr_value(po.getModel());
			getData().add(kv2);
			
			PropertyKV kv3 = new PropertyKV();
			kv3.setAttr_name("设备类型");
			kv3.setAttr_value(po.getDeviceType());
			getData().add(kv3);
			
			PropertyKV kv4 = new PropertyKV();
			kv4.setAttr_name("设备编码");
			kv4.setAttr_value(po.getDeviceNO());
			getData().add(kv4);
			
			//PropertyKV kv5 = new PropertyKV();
			//kv5.setAttr_name("启用日期");
			//kv5.setAttr_value(po.getUseDate());
			//getData().add(kv5);
			
			setCount(getData().size());
			setMessage("success");
		}
		setCount(getData().size());
		return "success";
	}
}
