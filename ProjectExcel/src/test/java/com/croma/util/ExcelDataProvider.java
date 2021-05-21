package com.croma.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	public void testData(String excelPath, String sheetName)
	{
		
		ExcelUtil excel = new ExcelUtil(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount= excel.getColCount();
	}

}
