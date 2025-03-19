package com.vittech.inetbanking.seleniumframework.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.vittech.inetbanking.seleniumframework.testbase.TestBase;
import com.vittech.inetbanking.seleniumframework.utility.Helper;

public class CommonFunctionTest extends TestBase {
	
	
	@Test
	public void runtest() throws InterruptedException {
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	WebElement day = driver.findElement(By.id("day"));
	WebElement month = driver.findElement(By.id("month"));
	WebElement year = driver.findElement(By.id("year"));
	
/*	Helper.handledropDown( "21", day);
	Helper.handledropDown( "Jun", month);
	Helper.handledropDown( "2021", year);
	Thread.sleep(5000);
	
	Helper.handledropDown(day, 8);
	Helper.handledropDown(month,5 );
	Helper.handledropDown(year,10 );
	
	
	//Helper.handledropDown(driver.findElement(By.id("day")), 8);
	//Helper.handledropDown(driver.findElement(By.id("month")),5 );
	//Helper.handledropDown(driver.findElement(By.id("year")),10 );
	
	Thread.sleep(5000);

	
	//Helper.handledropDown(day, 3);
	//Helper.handledropDown(month, 11);
	//Helper.handledropDown(year, 1990);
	
	Thread.sleep(10000);
		
	
	
	Helper.handledropDown(driver.findElements(By.xpath("//select[@name='birthday_day']//option")), "20");
	*/
	
	Helper.mouseHoverAction(driver.findElement(By.id("u_0_8_qm")));
	Thread.sleep(8000);	
		
	
	
	
	

	
	
	}
	
	
	

}
