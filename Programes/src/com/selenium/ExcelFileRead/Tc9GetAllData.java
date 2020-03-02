package com.selenium.ExcelFileRead;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Tc9GetAllData {

	public static void main(String[] args) throws IOException {
		FileInputStream fso=new FileInputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fso);
		XSSFSheet wsht=wb.getSheet("sheet2");
		
		int rowc=wsht.getLastRowNum();
		Row r;
		
		for(int i = 0; i < rowc; i++) {
			r=wsht.getRow(i);
			int colc=r.getLastCellNum();
			for(int j = 0; j < colc; j++) {
				String d1=r.getCell(j).getStringCellValue();
				System.out.print(d1+"  ");
			}
			System.out.println();
		}
		FileOutputStream fo=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb.write(fo);
		
	}

}
