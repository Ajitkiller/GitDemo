package JanLast;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrGoogle {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\Users\\USER\\Desktop\\Screenshot\\gooogle.png"));
		
		driver.findElement(By.linkText("Gmail")).click();
		File srcfile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile1, new File("C:\\Users\\USER\\Desktop\\Screenshot\\gmail.png"));
		
		
		
	}

}
