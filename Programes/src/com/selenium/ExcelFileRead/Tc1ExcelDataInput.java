package com.selenium.ExcelFileRead;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Tc1ExcelDataInput {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fso=new FileInputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fso);
		XSSFSheet wsht=wb.getSheet("sheet1");
		
		wsht.createRow(1).createCell(1).setCellValue("Ajit Killer");
		System.out.println("AK");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb.write(fo);
		
		
		
	}
	
	
	
	
	
}
