package DataDriven_TestCase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc2 {

	
	WebDriver d;
	@BeforeTest
	public void openBrow(){
		d=new FirefoxDriver();
		d.get("http://google.com/");
	}
	
	@Test
	public void maching() throws IOException{
		FileInputStream fis=new FileInputStream("C:\\Users\\USER\\Desktop\\fprac.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sht=wb.getSheet("Sheet2");
		
		List<WebElement> d1=d.findElements(By.tagName("a"));
		System.out.println(d1.size());
		for (int i = 0; i < d1.size(); i++) {
			
			String m1=d.getCurrentUrl();
			System.out.println(m1);
			sht.createRow(i).createCell(0).setCellValue(m1);
			sht.getRow(i).createCell(1).setCellValue("Url print successfull");
			
			String m2=d1.get(i).getText();
			sht.getRow(i).createCell(2).setCellValue(m2);
			sht.getRow(i).createCell(3).setCellValue("get text printed successfully");
			
		}
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\USER\\Desktop\\fprac.xlsx");
		wb.write(fos);
	}
	
	
}
