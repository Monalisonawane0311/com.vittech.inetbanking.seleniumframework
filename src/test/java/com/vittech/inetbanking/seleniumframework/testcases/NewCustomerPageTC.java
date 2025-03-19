package com.vittech.inetbanking.seleniumframework.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vittech.inetbanking.seleniumframework.pageobjects.HomePage;
import com.vittech.inetbanking.seleniumframework.pageobjects.LoginPage;
import com.vittech.inetbanking.seleniumframework.pageobjects.NewCustomerPage;
import com.vittech.inetbanking.seleniumframework.testbase.TestBase;

public class NewCustomerPageTC extends TestBase {
	
	@Test  (dataProvider = "getExcelTestData")
	public void validateNewCustomer(String name, String gender, String dob,String address, String city,String state, String pin,String telephone, String email) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		NewCustomerPage ncp = new NewCustomerPage(driver);
		lp.setUserId(configDataProvider.getUserId());
		lp.setPassword(configDataProvider.getPassword());
		lp.clickOnSubmitBtn();
		hp.clickOnNewCustomerBtn();
		ncp.setCustomerName(name);
		ncp.selectRadioButton(gender);
		ncp.setDateOfBirth(dob);
		ncp.setAddress(address);
		ncp.setCity(city);
		ncp.setState(state);
		ncp.setPIN(pin);
		ncp.setTelephone(telephone);
		ncp.setEmail(email);
		Thread.sleep(3000);
		ncp.resetdata();
		
		
		
	}
	
	@DataProvider
	public String[][] getExcelTestData() {
		return excelDataProvider.getCellData("New Customer Page");
		
		
	}

}
