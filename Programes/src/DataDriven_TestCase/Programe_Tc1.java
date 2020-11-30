package DataDriven_TestCase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Programe_Tc1 {

	WebDriver d;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sht;
	int rowc;
	//public Logger log;
	@BeforeTest
	public void openBrow() throws IOException{
		d=new FirefoxDriver();
		d.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@Test
	public void executePlan() throws InterruptedException, IOException{
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fis=new FileInputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb=new XSSFWorkbook(fis);
		sht=wb.getSheet("Sheet5");
		rowc=sht.getLastRowNum();
		for (int i = 1; i <= rowc; i++) {
			String user=sht.getRow(i).getCell(0).getStringCellValue();
			String pass=sht.getRow(i).getCell(1).getStringCellValue();
			WebElement user1=d.findElement(By.id("txtUsername"));
			user1.clear();
			user1.sendKeys(user);
			WebElement pass1=d.findElement(By.id("txtPassword"));
			pass1.clear();
			pass1.sendKeys(pass);
			d.findElement(By.id("btnLogin")).click();
			Thread.sleep(4000);
			String actual=d.getCurrentUrl();
			String expect=sht.getRow(i).getCell(2).getStringCellValue();
			sht.getRow(i).createCell(3).setCellValue(actual);
			Thread.sleep(4000);
			if (actual.equals(expect)) {
				sht.getRow(i).createCell(4).setCellValue("pass");
			}
			else {
				sht.getRow(i).createCell(4).setCellValue("fail");
				//log.info(i+" "+"Test case fail");
			}
			d.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			
		
		}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb.write(fos);
		
	}
	
	
	
	
	
	
}
