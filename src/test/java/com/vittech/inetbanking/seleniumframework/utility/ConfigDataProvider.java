package com.vittech.inetbanking.seleniumframework.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	public static Properties prop;
	
	public ConfigDataProvider(String fname) {
		try {
			File fs =new File("./Config/"+fname+".properties"); 		//fname is a config.properties file name  you can change this name when it is called
			FileInputStream fins = new FileInputStream(fs);      	//convert raw data into readable format
			prop = new Properties();
			prop.load(fins);								// load the data in to the properties file into key value pair
				
			
		}catch(Exception e) {
			e.printStackTrace();		
			}
	}
	
	//after loading data into properties the access this method getuserId and all
	
	
	// Retrieve the data using getter method
	public String getUserId() {
		return prop.getProperty("UserID");
	}
	
	public String getPassword() {
		return prop.getProperty("UserPassword");
	}
	public String getAppURL() {
		return prop.getProperty("AppURL");
	}
	
	public String searchKey	(String key) {
		return prop.getProperty(key);
	}
	
	public static void main(String[] args) {
		ConfigDataProvider configDataProvider = new ConfigDataProvider("config");		//config is a file name where we can fetch the data we have to create object 
		System.out.println(configDataProvider.getUserId());
		System.out.println(configDataProvider.getPassword());
		System.out.println(configDataProvider.getAppURL());
		System.out.println(configDataProvider.searchKey("HpTitle"));
		System.out.println(configDataProvider.searchKey("LpTitle"));
		
		
	}

}
