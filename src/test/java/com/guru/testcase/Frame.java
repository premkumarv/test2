package com.guru.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.guru.testbase.TestBase;

public class Frame extends TestBase{

	
	@Test(priority =0)
	
	public  void  testFrame (){
		
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait  wait = new WebDriverWait(driver, 30);
		
	 WebElement hp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("homePage"))));
	 
	 hp.click();
		
		
	}
	
	
	@Test (priority =1)
	
	public void iframe() throws InterruptedException{
		Thread.sleep(30000);
		driver.switchTo().frame("a077aa5e");
  WebElement fra =	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("frame1"))))	;
 // fra.click();
	//	Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
}
