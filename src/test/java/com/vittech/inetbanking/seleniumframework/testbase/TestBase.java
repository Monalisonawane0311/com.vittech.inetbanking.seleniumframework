package com.vittech.inetbanking.seleniumframework.testbase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.vittech.inetbanking.seleniumframework.utility.ConfigDataProvider;
import com.vittech.inetbanking.seleniumframework.utility.ExcelDataProvider;

public class TestBase {
	public static ChromeDriver driver;
	
	public static ConfigDataProvider configDataProvider;
	public static ExcelDataProvider excelDataProvider;
	
	@BeforeSuite
	public void init() {									//When we run are test case init method operated then configdataprovider constructor executed using this line then load the config file into properties then exceute Tc
	configDataProvider = new ConfigDataProvider("config");
	excelDataProvider = new ExcelDataProvider("datasheet");
	}
	
	@BeforeTest
	//@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get(configDataProvider.getAppURL());
		driver.manage().window().maximize();
		}
	@AfterTest
	//@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	
	
}
