package com.croma.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTestTwo {
	WebDriver driver;
 	  @Test
 	  public void f() { 	 
      	  System.out.println("Start test");
      	//Setting up the chrome driver exe, the second argument is the location where you have kept the driver in your system
      	  System.setProperty("webdriver.chrome.driver", "D:\\Croma\\Selenium\\chromedriver.exe");
      	//Setting the driver to chrome driver
      	  driver = new ChromeDriver();
      	  String url = "https://www.google.com";
      	  driver.get(url);
      	  //Searching the values on google
      	  WebElement txtBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
      	  txtBox.sendKeys("croma campus");
      	  txtBox.sendKeys(Keys.ENTER);
      	  }
	  @BeforeMethod
	  public void beforeMethod() {  	 
      	  System.out.println("Starting the browser session");
	  }
	  @AfterMethod
	  public void afterMethod() { 
      	  System.out.println("Closing the browser session");
      	  //driver.quit();
	  }
}
