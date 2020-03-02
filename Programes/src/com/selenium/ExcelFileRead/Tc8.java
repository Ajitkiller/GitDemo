package com.selenium.ExcelFileRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Tc8 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fso=new FileInputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fso);
		XSSFSheet wsht=wb.getSheet("sheet1");
		int count=0;
		
		for (int i = 0; i < 10; i++) {
			String Actual=wsht.getRow(i).getCell(1).getStringCellValue();
			String Expected="Automation";
			
			if (Actual.equals(Expected)) {
				System.out.println("pass");
				count++;
			}
			else
			System.out.println("fail");
			
		}
		System.out.println("Automation is avilable "+" "+count+"   "+"no . of times");
		
		
		
	}

}
