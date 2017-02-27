package com.wincom.mstar.readconfig;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

public class ReadConfig {
	private String Filter="";
	public ReadConfig(){
		try {		
			HttpServletRequest request = ServletActionContext.getRequest();
			String basePath=request.getSession().getServletContext().getRealPath("/WEB-INF/FilterSignalName.properties");
			Properties prop = new Properties();
			FileInputStream fis=new FileInputStream(basePath);     
			BufferedReader bf = new BufferedReader(new InputStreamReader(fis,"utf8"));
			prop.load(bf);
			Filter=prop.getProperty( "Filter" ).trim();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public String getFilter(){
		return Filter;
	}
}
