package com.wincom.mstar;

import net.sf.json.JSONArray;

public class Signal {
	private JSONArray signalLst=new JSONArray();
	private int type;
	public Signal() {
		super();
	}
	public JSONArray getSignalLst() {
		return signalLst;
	}
	public void setSignalLst(JSONArray signalLst) {
		this.signalLst = signalLst;
	}
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
