package com.vittech.inetbanking.seleniumframework.pageobjects;

import java.util.NoSuchElementException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vittech.inetbanking.seleniumframework.utility.Helper;




public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	 @FindBy(xpath = "//img[@alt='Guru99 Demo Sites']")
	 WebElement titleLogo;
	
	 @FindBy(xpath = "//h2[text()='Gtpl Bank']")
	 WebElement titleBarLogo;

	 @FindBy(xpath = "//marquee[@class='heading3']")
	 WebElement scrollNameOfGTPLBank;

	 @FindBy(xpath = "//a[text()='Manager']")
	 WebElement managerName;

	 @FindBy(xpath = "//a[text()='New Customer']")
	 WebElement newCustomerName;

	 @FindBy(xpath = "//a[text()='Edit Customer']")
	 WebElement editCustomerName;
	 
	 @FindBy(xpath = "//a[text()='Delete Customer']")
	 WebElement deleteCustomerName;

	 @FindBy(xpath = "//a[text()='New Account']")
	 WebElement newAccountName;

	 @FindBy(xpath = "Edit Account")
	 WebElement editAccountName;

	 @FindBy(xpath = "//a[text()='Delete Account']")
	 WebElement deleteAccountName;
	 
	 @FindBy(xpath = "//a[text()='Mini Statement']")
	 WebElement miniAccountName;

	 @FindBy(xpath = "//a[text()='Customised Statement']")
	 WebElement customisedStatementName;

	 @FindBy(xpath  ="//a[text()='Log out']")
	 WebElement logOutButton;
	 
	 
	 public void clickOnNewCustomerBtn() {
		 try {
			newCustomerName.click();
		 }catch(Exception e) {
			 e.printStackTrace();;
		 }
	 }
	 
	 public void clickOnNewAccountBtn() {
		 newAccountName.click();
	 }

	
	 
	 
}
