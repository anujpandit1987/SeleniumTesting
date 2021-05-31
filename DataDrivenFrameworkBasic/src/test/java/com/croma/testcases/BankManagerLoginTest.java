package com.croma.testcases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.croma.base.TestBase;

public class BankManagerLoginTest extends TestBase {
	
	
	@Test
	public void loginAsBankManager() throws InterruptedException
	{
	
		log.debug("Inside Login Test");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		
		//Thread.sleep(3000);
		//Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),"Login not successful");
		//Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))), "Login is not sucessful");
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),"Login is not sucessful");
		
		log.debug("Login sucessfully executed");
		
		
	}
	


}
