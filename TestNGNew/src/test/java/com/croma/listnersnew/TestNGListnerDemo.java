package com.croma.listnersnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestNGListnerDemo {
	
	@Test
	public void test1()
	{
		System.out.println("I am inside test 1 method");
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("I am inside test 2 method");
		
		System.setProperty("webdriver.gecko.driver", "D:\\Croma\\Selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
       
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("panuj87@gmail.com");
        driver.findElement(By.xpath("pas")).sendKeys("password");
        
        driver.close();
		
	}

	
	@Test
	public void test3()
	{
		System.out.println("I am inside test 3 method");
		
	}


}
