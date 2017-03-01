package com.wincom.mstar.sqlserver;

import java.io.FileInputStream;
import java.util.Properties;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
public class ReadProperties {
	//监控之星配置库信息
	private String MonitorDBIpAddres="127.0.0.1";
	private String MonitorDBName="";
	private String MonitorDBUserName="sa";
	private String MonitorDBPassWord="";
	//监控之星历史库配置
	private String HisdbIpAddres="127.0.0.1";
	private String HisdbUserName="sa";
	private String HisdbPassWord="";
	//能耗库配置
	private String EnergyDBIpAddres="127.0.0.1";
	private String EnergyDBName="Energy";
	private String EnergyDBUserName="sa";
	private String EnergyDBPassWord="";
	private String PropertyString;
	public ReadProperties(){
		try {		
			FileInputStream fis=null;
			HttpServletRequest request = ServletActionContext.getRequest();
			String basePath=request.getSession().getServletContext().getRealPath("/WEB-INF/Db_Config.properties");
			fis=new FileInputStream(basePath);
			Properties prop =  new  Properties();
			prop.load(fis); 
			MonitorDBIpAddres=prop.getProperty( "MonitorDBIpAddres" ).trim();
			MonitorDBName=prop.getProperty( "MonitorDBName" ).trim();
			MonitorDBUserName=prop.getProperty( "MonitorDBUserName" ).trim();
			MonitorDBPassWord=prop.getProperty( "MonitorDBPassWord" ).trim();
			
			HisdbIpAddres=prop.getProperty( "HisdbIpAddres" ).trim();
			HisdbUserName=prop.getProperty( "HisdbUserName" ).trim();
			HisdbPassWord=prop.getProperty( "HisdbPassWord" ).trim();
			
			EnergyDBIpAddres=prop.getProperty( "EnergyDBIpAddres" ).trim();
			EnergyDBName=prop.getProperty( "EnergyDBName" ).trim();
			EnergyDBUserName=prop.getProperty( "EnergyDBUserName" ).trim();
			EnergyDBPassWord=prop.getProperty( "EnergyDBPassWord" ).trim();
			
			PropertyString=prop.getProperty("realdata-server").trim();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public String getDbIpAddres(int type){
		String Ip="127.0.0.1";
		if(type==0)
		{
			Ip=MonitorDBIpAddres;
		}
		else if(type==1)
		{
			Ip=HisdbIpAddres;
		}
		else if(type==2)
		{
			Ip=EnergyDBIpAddres;
		}
		return Ip;
	}
	public String getDbName(int type){
		String DBName="";
		if(type==0)
		{
			DBName=MonitorDBName;
		}
		else if(type==1)
		{
			//DBName=HisdbUserName;
		}
		else if(type==2)
		{
			DBName=EnergyDBName;
		}
		return DBName;
	}
	public String getDbUserName(int type){
		String UserName="";
		if(type==0)
		{
			UserName=MonitorDBUserName;
		}
		else if(type==1)
		{
			UserName=HisdbUserName;
		}
		else if(type==2)
		{
			UserName=EnergyDBUserName;
		}
		return UserName;
	}
	public String getDbPassWord(int type){
		String PassWord="";
		if(type==0)
		{
			PassWord=MonitorDBPassWord;
		}
		else if(type==1)
		{
			PassWord=HisdbPassWord;
		}
		else if(type==2)
		{
			PassWord=EnergyDBPassWord;
		}
		return PassWord;
	}
	public String getPropertyString() {
		
		return PropertyString;
	}
}
