package com.vittech.inetbanking.seleniumframework.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vittech.inetbanking.seleniumframework.pageobjects.LoginPage;
import com.vittech.inetbanking.seleniumframework.testbase.TestBase;
import com.vittech.inetbanking.seleniumframework.utility.Helper;

public class DataDrivenTC extends TestBase  {
	
/*	
	@Test(dataProvider = "LoginTest")
	public void validateLoginFunctionalityWithValidandInvalidTestData(String user_id, String user_paswword, String pgTitle) 
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserId(user_id);
		lp.setPassword(user_paswword);
		lp.clickOnSubmitBtn();
		Helper.handleAlertPopUp(driver);
		Assert.assertEquals(driver.getTitle(), pgTitle);
			
		
	}
	
	@DataProvider(name="LoginTest")
	public String[][] getTestData() {
		String[][] data = new String[3][3];
		data[0][0]="mngr609714";
		data[0][1]="egEzape";
		data[0][2]="GTPL Bank Manager HomePage";
		
		data[1][0]="mngr609714";
		data[1][1]="egEzap#";
		data[1][2]="GTPL Bank Home Page";
		
		data[2][0]="mngr60971";
		data[2][1]="egEzape";
		data[2][2]="GTPL Bank Home Page";
		
		return data;
		
		
	}
	
*/
	
	@Test(dataProvider = "getExcelTestData")
	public void validateLoginFunctionality(String user_id, String user_password, String pgTitle) {
		LoginPage lp = new LoginPage(driver);
		lp.setUserId(user_id);
		lp.setPassword(user_password);
		lp.clickOnSubmitBtn();
		Helper.handleAlertPopUp(driver);
		Assert.assertEquals(driver.getTitle(), pgTitle);
		
	}
	
	
	
	/*@DataProvider
	public String[][] getExcelTestData() {
		return excelDataProvider.getCellData("Data Driven Test1");
		
		
	}*/
	
	@DataProvider
	public String[][] getExcelTestData() {
		return excelDataProvider.getCellData(2);
		
		
	}


}
