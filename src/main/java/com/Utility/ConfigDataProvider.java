package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	public static Properties pro;
	public ConfigDataProvider() throws Exception {
		String Cpath="C:\\Users\\Shree\\eclipse-workspace\\Automation_Framework\\Config\\configFile";
		FileInputStream fis=new FileInputStream(Cpath);
		 pro=new Properties();
		pro.load(fis);
	}
	
	public String getBaseurl() {
		return pro.getProperty("Baseurl");
	}
	
	public String getBrowserChrome() {
		return pro.getProperty("BrowserChrome");
	}
	
	public String getBrowserEdge() {
		return pro.getProperty("BrowserEdge");
	}
}
