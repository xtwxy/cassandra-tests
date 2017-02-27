package com.wincom.mstar.impl;

import com.opensymphony.xwork2.ActionSupport;

public class BaseResponse extends ActionSupport {
	private int count;
	private int code;
	private String message;
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
}
