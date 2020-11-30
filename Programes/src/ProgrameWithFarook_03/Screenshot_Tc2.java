package ProgrameWithFarook_03;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot_Tc2 {
	public static void main(String[] args) throws IOException {
	
	FirefoxDriver d=new FirefoxDriver();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.get("https://www.flipkart.com/");
	File flipkart=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(flipkart, new File("C:\\Users\\USER\\Desktop\\google/flipk.png"));
	
	//d.findElement(By.id(""));
	
	
	
	
	}
}
