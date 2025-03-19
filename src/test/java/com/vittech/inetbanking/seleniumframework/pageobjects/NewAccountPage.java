package com.vittech.inetbanking.seleniumframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
	WebDriver driver;
	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "cusid")
	WebElement customerIdField;
	
	@FindBy(name = "inideposit")
	WebElement initialDeposit;
	
	@FindBy(name = "selaccount")		// select saving and current dropdown
	WebElement accountType;
	
	@FindBy(name = "button2")
	WebElement submitBtn;
	
	@FindBy(name = "reset")
	WebElement resetBtn;
	
	
	
	

}
