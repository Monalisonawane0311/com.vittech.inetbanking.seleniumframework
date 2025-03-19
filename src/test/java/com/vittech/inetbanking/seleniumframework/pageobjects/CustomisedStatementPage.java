package com.vittech.inetbanking.seleniumframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomisedStatementPage {

WebDriver driver;
	
	public CustomisedStatementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "accountno")
	WebElement accountNoField;
	
	@FindBy(name = "fdate")
	WebElement fromDate;
	
	@FindBy(name = "tdate")
	WebElement toDate;
	
	@FindBy(name = "loweramt")
	WebElement amountLowerLimit;
	
	@FindBy(name ="tranno")
	WebElement transctionNum;
		
	@FindBy (name = "AccSubmit")
	WebElement submitBtn;
	
	@FindBy (name = "res")
	WebElement resetBtn;
	
	
	
}
