package com.vittech.inetbanking.seleniumframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
	
WebDriver driver;
	
	public NewCustomerPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
		@FindBy(xpath = "//input[@name = 'name']")
	    WebElement customerName;

	    @FindBy(xpath = "//input[@name = 'rad1'][1]")
	    WebElement maleRadioButton;

	    @FindBy(xpath = "//input[@name = 'rad1'][2]")
	    WebElement femaleRadioButton;
	    
	    @FindBy(id = "dob")
	    WebElement dateField;

	    @FindBy(xpath = "//textarea[@name ='addr']")
	    WebElement addressField;
	    @FindBy(xpath = "//input[@name ='city']")
	    WebElement cityField;

	    @FindBy(xpath = "//input[@name ='state']")
	    WebElement stateField;

	    @FindBy(xpath = "//input[@name ='pinno']")
	    WebElement pinField;

	    @FindBy(xpath = "//input[@name ='telephoneno']")
	    WebElement telephoneNoField;

	    @FindBy(xpath = "//input[@name ='emailid']")
	    WebElement emailIdField;

	    @FindBy(xpath = "//input[@name ='sub']")
	    WebElement submitButton;

	    @FindBy(xpath = "//input[@name ='res']")
	    WebElement resetButton;
	    
	    
	    public void setAllData(String customerNme, String gender, String dob,String address, String city, String state, String pin,String telephone, String email ) {
			try {
							
				customerName.sendKeys(customerNme);
				femaleRadioButton.sendKeys(gender);
				dateField.sendKeys(dob);
				addressField.sendKeys(address);
				cityField.sendKeys(city);
				stateField.sendKeys(state);
				pinField.sendKeys(pin);
				telephoneNoField.sendKeys(telephone);
				emailIdField.sendKeys(email);
				
				}
				catch(Exception e) {
			e.printStackTrace();
			}
	    }
	    
	    public void setCustomerName(String name) {
			try {
			
				customerName.clear();
				customerName.sendKeys(name);
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
		
	    public void selectRadioButton(String gender) {
	    	if(gender.equalsIgnoreCase("male"))
	    		maleRadioButton.click();
	    	else if(gender.equalsIgnoreCase("female"))
	    		femaleRadioButton.click();
	    	else
	    		System.out.println("invalid data");
	    	}
	    
	    public void setDateOfBirth(String dob) {
			try {
			
				dateField.clear();
				dateField.sendKeys(dob);
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	    
	    public void setAddress(String address) {
			try {
			
				addressField.clear();
				addressField.sendKeys(address);
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	    
	    public void setCity(String city) {
			try {
			
				cityField.clear();
				cityField.sendKeys(city);
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	    
	    public void setPIN(String pin) {
			try {
			
				pinField.clear();
				pinField.sendKeys(pin);
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	    
	    public void setState(String state) {
			try {
			
				stateField.clear();
				stateField.sendKeys(state);
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	    
	    public void setTelephone(String telephone) {
			try {
			
				telephoneNoField.clear();
				telephoneNoField.sendKeys(telephone);
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	    
	    public void setEmail(String email) {
			try {
			
				emailIdField.clear();
				emailIdField.sendKeys (email);
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	    
		    
	   
	    
	    public void resetdata() {
			try {
			resetButton.click();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}


}
	    
