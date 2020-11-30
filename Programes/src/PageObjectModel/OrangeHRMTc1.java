package PageObjectModel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OrangeHRMTc1 {
	WebDriver driver;
	FileInputStream fso;
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet wsh;
	HrmLogin page1;
	@BeforeTest
	public void openBrowser() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	Thread.sleep(5000);
	}
	@Test
	public void operation() throws IOException, InterruptedException{
		page1=PageFactory.initElements(driver, HrmLogin.class);
		fso=new FileInputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb=new XSSFWorkbook(fso);
		wsh=wb.getSheet("Sheet3");
		int rowc=wsh.getLastRowNum();
		System.out.println(rowc + "nos. of rows are avilabe");
		Row r;
		for(int i=1;i<=rowc;i++) {
			r=wsh.getRow(i);
			Thread.sleep(3000);
			page1.login(r.getCell(0).getStringCellValue(), r.getCell(1).getStringCellValue());
		
			String actual=driver.getCurrentUrl();
			System.out.println(actual);
			Thread.sleep(2000);
			wsh.getRow(i).createCell(3).setCellValue(actual);
			String expected=wsh.getRow(i).getCell(2).getStringCellValue();
			
			if(expected.equals(actual)) {
				wsh.getRow(i).createCell(4).setCellValue("Pass");
				
			}
			else {
				wsh.getRow(i).createCell(4).setCellValue("Fail");
				
			}
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			
		}
		fo=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb.write(fo);
		
		driver.close();
	}

	}

	

