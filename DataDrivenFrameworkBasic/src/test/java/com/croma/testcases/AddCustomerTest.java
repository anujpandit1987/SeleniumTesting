package com.croma.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.croma.base.TestBase;

public class AddCustomerTest extends TestBase {

	@Test(dataProvider="getData")
	public void addCutomer(String firstName, String lastName, String postCode, String alerttext) throws Exception
	{
		
		driver.findElement(By.cssSelector(OR.getProperty("addCustBtn_CSS"))).click();;
		driver.findElement(By.cssSelector(OR.getProperty("firstname_CSS"))).sendKeys(firstName);;
		driver.findElement(By.cssSelector(OR.getProperty("lastname_CSS"))).sendKeys(lastName);;
		driver.findElement(By.cssSelector(OR.getProperty("postcode_CSS"))).sendKeys(postCode);;
		driver.findElement(By.cssSelector(OR.getProperty("addbtn_CSS"))).click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(alerttext));
		alert.accept();
		
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		String sheetName = "AddCustomerTest";
		
		   int rows=excel.getRowCount(sheetName);
		   int cols=excel.getColumnCount(sheetName);
		   Object data[][]=new Object[rows-1][cols];
		  
		   for(int rowNum =2; rowNum<=rows; rowNum++) {
					for(int colNum =0; colNum<cols; colNum++) {
						
			data[rowNum -2][colNum]= excel.getCellData(sheetName, colNum, rowNum);
			
			
					}

		
					log.debug("Data selected");	
		
		
		
	}
		return data;
	}}
