package com.vittech.inetbanking.seleniumframework.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vittech.inetbanking.seleniumframework.pageobjects.LoginPage;
import com.vittech.inetbanking.seleniumframework.testbase.TestBase;
import com.vittech.inetbanking.seleniumframework.utility.Helper;

public class LoginTC extends TestBase{
	
	@Test(priority = 1)
	public void verifyLoginPageTitle() {
//		Assert.assertEquals(driver.getTitle(), "GTPL Bank Home Page");
		Assert.assertEquals(driver.getTitle(), configDataProvider.searchKey("HpTitle"));

	}
	
	@Test(priority = 2)
	public void verifyLoginF() {
		LoginPage lp = new LoginPage(driver);
		
		//lp.setUserId("mngr609714");
		//lp.setPassword("egEzape");
		lp.setUserId(configDataProvider.getUserId());
		lp.setPassword(configDataProvider.getPassword());
		lp.clickOnSubmitBtn();
		//Assert.assertEquals(driver.getTitle(), "GTPL Bank Manager HomePage");
		Assert.assertEquals(driver.getTitle(), configDataProvider.searchKey("LpTitle"));
	}
	

	

	
	

}
