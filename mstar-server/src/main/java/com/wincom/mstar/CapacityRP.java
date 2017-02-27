package com.wincom.mstar;
//电力和冷量信息

import java.math.BigDecimal;

public class CapacityRP {
	private String serial;
	private BigDecimal standard;
	private BigDecimal current;
	private BigDecimal avg;
	private BigDecimal max;
	public void setSerial(String serial)
	{
		this.serial=serial;
	}
	public String getSerial()
	{
		return this.serial;
	}
	
	public void setStandard(BigDecimal standard)
	{
		this.standard=standard;
	}
	public BigDecimal getStandard()
	{
		return this.standard;
	}
	
	public void setCurrent(BigDecimal current)
	{
		this.current=current;
	}
	public BigDecimal getCurrent()
	{
		return this.current;
	}
	
	public void setAvg(BigDecimal avg)
	{
		this.avg=avg;
	}
	public BigDecimal getAvg()
	{
		return this.avg;
	}
	
	public void setMax(BigDecimal max)
	{
		this.max=max;
	}
	public BigDecimal getMax()
	{
		return this.max;
	}
}
