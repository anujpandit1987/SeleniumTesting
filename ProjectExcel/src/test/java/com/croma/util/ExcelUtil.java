package com.croma.util;



import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	static String projectPath;
	static XSSFSheet sheet;
	static XSSFWorkbook workbook;
	
	public ExcelUtil(String excelPath, String sheetName)
	{
		//projectPath = System.getProperty("user.dir");
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	public static void main(String[] args) { 

		/*
		 * getRowCount(); getCellDataString(0,0); getCellDataNumber(1,1);
		 */
	}


	public static int getRowCount()
	{
		int rowCount =0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : " + rowCount);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		}
		return rowCount;
			
		
	}

	public static void getCellDataString(int rowNum, int colNum)
	{

		try {
			
			String cellData = sheet.getRow(rowNum).getCell(rowNum).getStringCellValue();
			System.out.println( cellData);
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		}
			
			
		

	}

	public static void getCellDataNumber(int rowNum, int colNum)
	{

		try {
			
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println( cellData);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		}
			
			
			}

	public static int  getColCount()
	{

		int colCount=0;
		try {
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of col : " + colCount);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		}
		return colCount;
			
		
	}



}

