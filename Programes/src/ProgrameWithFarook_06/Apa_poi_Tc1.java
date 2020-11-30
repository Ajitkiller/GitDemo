package ProgrameWithFarook_06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Apa_poi_Tc1 {

	WebDriver d;
	FileInputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sht;
	
	@BeforeTest
	public void startOpen(){
		d=new FirefoxDriver();
		d.get("http://www.google.com/");
	}
	@Test
	public void Tvs_Apache_180() throws IOException{
		fos=new FileInputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb=new XSSFWorkbook(fos);
		sht=wb.getSheet("Sheet5");
		String data=d.findElement(By.linkText("Gmail")).getText();
		sht.createRow(3).createCell(7).setCellValue(data);
		FileOutputStream fio=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb.write(fio);
		
	}
	
	
	
}
