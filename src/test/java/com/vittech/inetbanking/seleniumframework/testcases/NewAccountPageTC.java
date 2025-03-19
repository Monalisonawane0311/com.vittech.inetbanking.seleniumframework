package com.vittech.inetbanking.seleniumframework.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vittech.inetbanking.seleniumframework.pageobjects.HomePage;
import com.vittech.inetbanking.seleniumframework.pageobjects.LoginPage;
import com.vittech.inetbanking.seleniumframework.pageobjects.NewAccountPage;
import com.vittech.inetbanking.seleniumframework.testbase.TestBase;

public class NewAccountPageTC extends TestBase {
	
	@DataProvider
	public String[][] getExcelTestData() {
		return excelDataProvider.getCellData("newAccountPage");
		
	}
	
	@Test(dataProvider = "getExcelTestData")
	public void createNewAccount() {
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		NewAccountPage nap = new NewAccountPage(driver);
		lp.setUserId(configDataProvider.getUserId());
		lp.setPassword(configDataProvider.getPassword());
		lp.clickOnSubmitBtn();
		hp.clickOnNewAccountBtn();
		
	}
	
	

}
