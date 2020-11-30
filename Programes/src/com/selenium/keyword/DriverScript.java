package com.selenium.keyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DriverScript {
	FileInputStream fis;
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet wsh;
	@Test
	public void login() throws IOException{
		ActionKeywords aks=new ActionKeywords();
		fis=new FileInputStream("C:\\Users\\USER\\Desktop\\KeywordDF.xlsx");
		wb=new XSSFWorkbook(fis);
		wsh=wb.getSheet("Sheet1");
		Row r;
		int rowc=wsh.getLastRowNum();
		for (int i = 1; i < rowc; i++) {
			r=wsh.getRow(i);
			String rm=r.getCell(4).getStringCellValue();
			if (rm.equals("y")) {
				String Action=r.getCell(3).getStringCellValue();
				if (Action.equals("lunchBrowser")) {
					aks.lunchBrowser();
				}
				else if (Action.equals("navigate")) {
					aks.navigate();
				}
				else if (Action.equals("enterUsername")) {
					aks.enterUsername();
				}
				else if (Action.equals("enterPassword")) {
					aks.enterPassword();
				}
				else if (Action.equals("login")) {
					aks.login();
				}
			}
		}
	}
}
