package com.croma.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class FacebookLogin {

	@Test
	@Parameters({"sUsername","sPassword"})
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
       
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("sUsername");
        //driver.findElement(By.className("_6lux")).sendKeys("panuj87@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("sPassword");
        driver.findElement(By.name("login")).click();
        
        driver.quit();
	}
}
