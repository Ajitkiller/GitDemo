package com.selenium.keyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DriverScriptTc2 {

	FileInputStream fis;
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet wsh;
	
	@Test
	public void test() throws IOException, InterruptedException{
	ActionkeyTc2 act=new ActionkeyTc2();
	fis=new FileInputStream("C:\\Users\\USER\\Desktop\\KeywordDF.xlsx");
	wb=new XSSFWorkbook(fis);
	wsh=wb.getSheet("Sheet2");
	Row r;
	int rowc=wsh.getLastRowNum();

	for (int i = 0; i < rowc; i++) {
		r=wsh.getRow(i);
		String rn=r.getCell(4).getStringCellValue();
		if (rn.equals("y")) {
			String Action=r.getCell(3).getStringCellValue();
			if (Action.equals("lunchBrowser")) {
				act.lunchBrowser();
			}
			else if (Action.equals("navigate")) {
				act.navigate();
			}
			else if (Action.equals("login")) {
				act.navigate();
			}
			else if (Action.equals("status")) {
				act.status();
			}
			else if (Action.equals("addUser")) {
				act.addUser();
			}
			else if (Action.equals("Logout")) {
				act.Logout();
			}
			else if (Action.equals("close")) {
				act.close();
			}
		 }
	   }
	}
}
