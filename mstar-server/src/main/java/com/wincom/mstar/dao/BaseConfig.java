package com.wincom.mstar.dao;

public class BaseConfig {
	private int objId;
	private int parentObjId;
	private String objName;
	private String objType;
	public int getObjId() {
		return objId;
	}
	public void setObjId(int objId) {
		this.objId = objId;
	}
	public int getParentObjId() {
		return parentObjId;
	}
	public void setParentObjId(int parentObjId) {
		this.parentObjId = parentObjId;
	}
	public String getObjName() {
		return objName;
	}
	public void setObjName(String objName) {
		this.objName = objName;
	}
	public String getObjType() {
		return objType;
	}
	public void setObjType(String objType) {
		this.objType = objType;
	}
}
