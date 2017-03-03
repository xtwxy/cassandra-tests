package com.wincom.mstar.domain;

public class AnalogInputHistory extends HistoryKey {

	private static final long serialVersionUID = -5856156204586784641L;

	private Double value;

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
