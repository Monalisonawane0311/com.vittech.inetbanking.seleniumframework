package com.vittech.inetbanking.seleniumframework.utility;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vittech.inetbanking.seleniumframework.testbase.TestBase;

public class Helper extends TestBase {
	private static WebDriver driver;
	
	public static final long EXPLICITY_WAIT = 20;

    public Helper(WebDriver driver) {
        this.driver = driver;
    }
	

    public static void handledropDown(WebElement element, int index) {
		try {
			new Select(element).selectByIndex(index);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
	}
    
    public static void handledropDown( String visibleText, WebElement element) {
		try {
			new Select(element).selectByVisibleText("visibleText");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
    
    public static void handledropDown( WebElement element,String value) {
    	try {
			new Select(element).selectByValue(value);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
    
    public static void handledropDown(List<WebElement> element, String value ) {
    for (WebElement option : element) {
        if (option.getText().equals(value)) {
            option.click();
           
            break;
        }
    	
    }
   }
    
    
    public static boolean isAlertPresent(WebDriver driver) {
    	
    	try {
    		driver.switchTo().alert();
    		return true;
    	}catch(NoAlertPresentException e) {
    		e.printStackTrace();
    		return false;
    	}
		
    }
    
    public static boolean isSelected(WebElement element) {
    	return element.isSelected();
    }
    
    public static void handleAlertPopUp(WebDriver driver) {
    	if(isAlertPresent(driver)) {
    		driver.switchTo().alert().accept();
    	}else {
    		System.out.println("No present alert on page...");
    	}
    }
    
    
    
    
	 // perform mouse hover 
	public static void mouseHoverAction(WebElement element) {
		
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click();
		//actions.moveToElement(element).click().sendKeys("Monali").keyDown(Keys.ENTER).build().perform();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
    
      
    
	
	public static String tryAlertAccept(String text){

        try{
        	String text1 = driver.switchTo().alert().getText();
        	driver.switchTo().alert().accept();
        	
        	
        	
        	//Alert alert = driver.switchTo().alert();
           // String alertMessage = driver.switchTo().alert().getText();
            //System.out.println(alertMessage);
           // alert.accept();

       }
        catch (Exception e) {
            e.printStackTrace();

        }
		return text;
    }
	
	 public void captureScreenshot(String filename){
	        TakesScreenshot takesScreenshot = (TakesScreenshot)driver ;
	        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	        File destFile = new File(("./Screenshot/img.jpg"));
	        try {
	            FileUtils.copyFile(sourceFile,destFile);
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	        System.out.println("Screenshot save Successfully");
	    }
	 
	
	 //handle frame by index
	 	 
	 public void switchToIframeByIndex(int index) {
		 driver.switchTo().frame(index);
			 
	 }
	 
	 // switch back to main page
	 public void switchToMainPage() {
		 driver.switchTo().defaultContent();
	 }
	 
	 

	
	
	
	
	
    public void waitElementUntilToClickable(WebElement element){
    	WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITY_WAIT));
    	
    	try {
			 webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
		
		}catch(TimeoutException e)
		{
			e.printStackTrace();
		}
		

    }
	

	// handle multiple window
	public void handleWindow() {
		String parentWindow = driver.getWindowHandle();
		Set <String> childWindow = driver.getWindowHandles();
		)
		for(String allWindow : childWindow) {
			if(!allWindow.contentEquals(parentWindow)) {
				driver.switchTo().window(allWindow);
				System.out.println(driver.getTitle());
				
			}
		}
		driver.switchTo().window(parentWindow);
	}
	

}
