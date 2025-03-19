package com.vittech.inetbanking.seleniumframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	
	WebDriver driver;
	
	public EditCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "cusid")
	WebElement customerIDField;
	
	@FindBy(name = "AccSubmit")
	WebElement submitBtn;
	
	@FindBy(name = "res")
	WebElement resetBtn;

}
