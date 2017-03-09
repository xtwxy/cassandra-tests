package com.wincom.mstar.tests.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextLoader {
	private ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
	public ApplicationContext getContext() {
		return context;
	}
	public void closeContext() {
		context.close();
	}
}
