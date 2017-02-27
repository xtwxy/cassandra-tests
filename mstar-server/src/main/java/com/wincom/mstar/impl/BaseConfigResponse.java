package com.wincom.mstar.impl;

import java.util.LinkedList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wincom.mstar.dao.*;
import com.wincom.mstar.dao.impl.MonitorServiceDAOImpl;

public class BaseConfigResponse extends ActionSupport {
	private int count;
	private int code;
	private String message;
	private List<BaseConfig> data = new LinkedList<BaseConfig>();
	//********************
	private int parentId;
	public void setParentId(int parentId)
	{
		this.parentId=parentId;
	}
	//*******************
	public List<BaseConfig> getData() {
		return data;
	}
	public void setData(List<BaseConfig> data) {
		this.data = data;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String responseConfig()
	{
		System.out.println(parentId);
		MonitorServiceDAO monitorServiceDAO=new MonitorServiceDAOImpl();
		List<BaseConfig> config =monitorServiceDAO.getConfig(parentId);
		setCode(0);
		setMessage("success");
		for(int i=0;i<config.size();i++){
			getData().add(config.get(i));
		}
		setCount(getData().size());
		return "success";
	}
	public String responseSignalConfig()
	{
		MonitorServiceDAO monitorServiceDAO=new MonitorServiceDAOImpl();
		List<BaseConfig> config =monitorServiceDAO.getSignal(parentId);
		this.setCode(0);
		this.setMessage("success");
		for(int i=0;i<config.size();i++){
			getData().add(config.get(i));
		}
		setCount(getData().size());
		return "success";
	}
}
