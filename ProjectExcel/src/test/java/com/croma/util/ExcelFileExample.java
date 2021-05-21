package com.croma.util;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileExample {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	
	public static void main(String[] args) {
		
		//getRowCount();
		//getCellData();
		getCellDataNumber();
	}
	
	public static void getRowCount()
	{
		// XLSX(XSSFWorkbook) & .xls(HSSFWorkbook)
		
				try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/Excel/data.XLSX");
						XSSFSheet sheet = workbook.getSheet("Sheet1");
			int rowcCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : "+rowcCount);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void getCellData()
	{
			
				try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/Excel/data.XLSX");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(cellData);			
						
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void getCellDataNumber()
	{
			
				try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/Excel/data.XLSX");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			double cellDataNumber = sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println(cellDataNumber);			
						
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

	

}
