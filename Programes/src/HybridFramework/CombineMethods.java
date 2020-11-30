package HybridFramework;

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


public class CombineMethods {
	WebDriver driver;
	FileInputStream fso;
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet wsh;
	@BeforeTest
	public void openBrowser() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	Thread.sleep(5000);
	}
	@Test
	public void login() throws IOException, InterruptedException{
		fso=new FileInputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb=new XSSFWorkbook(fso);
		wsh=wb.getSheet("Sheet3");
		int rowc=wsh.getLastRowNum();
		System.out.println(rowc + "nos. of rows are avilabe");
		
		for(int i=1;i<=rowc;i++) {
			String user=wsh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("pass 39");
			String pass=wsh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("pas 40");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id='txtUsername']")).clear();
			driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(user);
			
			driver.findElement(By.xpath("//*[@id='txtPassword']")).clear();
			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(pass);
			
			driver.findElement(By.xpath("//*[@id='btnLogin']g")).click();
			Thread.sleep(3000);
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
		}			
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		
		fo=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb.write(fo);
	}
	/*public void DataloginAgain(String user, String pass) throws InterruptedException{
		
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
		public void status(){
			String Actual=driver.findElement(By.linkText("Welcome Admin")).getText();
			String Expected="Welcome";
			//Assert.assertEquals(Expected, Actual);
			if (Actual.contains(Expected)) {
				System.out.println("Verify Login successfully");
			}
		}
		public void addUser() throws InterruptedException{
			driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
			driver.findElement(By.id("menu_pim_addEmployee")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("firstName")).sendKeys("Ajit");
			driver.findElement(By.id("middleName")).sendKeys("Kumar");
			driver.findElement(By.id("lastName")).sendKeys("Sahoo");
			driver.findElement(By.id("employeeId")).clear();
			driver.findElement(By.id("employeeId")).sendKeys("007");
			driver.findElement(By.id("btnSave")).click();
		}
		public void Logout(){
			driver.findElement(By.linkText("Welcome Admin")).click();
			driver.findElement(By.linkText("Logout")).click();
			
		}
		public void close(){
			driver.close();
		}
		*/
	
	
	
	
		
	
	
}
