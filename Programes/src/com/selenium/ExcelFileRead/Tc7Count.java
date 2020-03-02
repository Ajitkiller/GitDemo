package com.selenium.ExcelFileRead;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Tc7Count {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fso=new FileInputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fso);
		XSSFSheet wsht=wb.getSheet("sheet1");
		int row=wsht.getLastRowNum();
		int count=0;
		for (int i = 0; i < 10; i++) {
			String Actual=wsht.getRow(i).getCell(1).getStringCellValue();
			String Expected="Automation";
			if (Actual.equals(Expected)) {
				count++;
				
			}
		}
		System.out.println(count);
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb.write(fo);
		
		
		
		
	}

}
