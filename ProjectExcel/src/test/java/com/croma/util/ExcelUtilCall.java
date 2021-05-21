package com.croma.util;

public class ExcelUtilCall {

	public static void main(String[] args) {
		
		String projectPath =System.getProperty("user.dir");
		ExcelUtil excel = new ExcelUtil(projectPath+"/Excel/data.XLSX", "Sheet1");
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
		excel.getColCount();
		

	}

}
