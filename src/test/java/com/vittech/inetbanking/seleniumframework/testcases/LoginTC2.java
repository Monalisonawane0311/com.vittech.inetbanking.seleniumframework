package com.vittech.inetbanking.seleniumframework.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vittech.inetbanking.seleniumframework.pageobjects.LoginPage;
import com.vittech.inetbanking.seleniumframework.testbase.TestBase;

public class LoginTC2 extends TestBase {
	
	@Test(priority = 1)
	public void verifyLoginPageTitle() {
//		Assert.assertEquals(driver.getTitle(), "GTPL Bank Home Page");
		Assert.assertEquals(driver.getTitle(), excelDataProvider.getStringCellData("Login", 1, 2));

	}
	
	@Test(priority = 2)
	public void verifyLoginF() {
		LoginPage lp = new LoginPage(driver);
		
		String userid = excelDataProvider.getStringCellData("Login", 1, 0);
		String userpswrd = excelDataProvider.getStringCellData("Login", 1,1);
		lp.setUserId(userid);
		lp.setPassword(userpswrd);
		
		lp.clickOnSubmitBtn();
		//Assert.assertEquals(driver.getTitle(), "GTPL Bank Manager HomePage");
		Assert.assertEquals(driver.getTitle(), excelDataProvider.getStringCellData("Login", 1, 3));
	}

}
