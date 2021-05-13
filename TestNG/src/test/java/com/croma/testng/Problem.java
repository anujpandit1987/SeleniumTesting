package com.croma.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Problem {
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "D:\\Croma\\Selenium\\chromedriver.exe");
	  	 WebDriver driver;
	  	//Setting the driver to chrome driver
	  	  driver = new ChromeDriver();
	  	 
			driver.get("https://www.google.com");
			 
			 WebElement element1=driver.findElement(By.id("input"));
			 element1.sendKeys("Croma Cammpus");
			 element1.sendKeys(Keys.ENTER);
		  }

		  @BeforeMethod
		  public void beforeMethod()
		  {
		 	 System.out.println("Start Broswer Session");
		 	
		  }
		  @AfterMethod
		  public void afterMethod()
		  {
		 	 System.out.println("Ending Broswer Session");
		 	
		  }
		}



