package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataProvider {
	
	public void excel(String SheetName, int Row, int Cell) throws Exception{
		String path="C:\\Users\\Shree\\eclipse-workspace\\Automation_Framework\\TestData\\Data.xlsx";

		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		wb.getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();
	}

	

}
