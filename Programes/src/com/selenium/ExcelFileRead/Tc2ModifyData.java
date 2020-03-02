package com.selenium.ExcelFileRead;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Tc2ModifyData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fso=new FileInputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fso);
		XSSFSheet wsht=wb.getSheet("sheet1");
		for (int i = 0; i < 10; i++) {
		wsht.getRow(i).getCell(1).setCellValue("love hate fear");
		}
		System.out.println("Sarkar");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb.write(fo);
		
		
		
	}

}
