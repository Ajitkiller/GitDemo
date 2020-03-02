package com.selenium.ExcelFileRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromExcelFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fso=new FileInputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fso);
		XSSFSheet wsht=wb.getSheet("sheet1");
		String data=wsht.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(data);
		
		
		
		
		
	}

}
