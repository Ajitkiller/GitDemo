package ProgrameWithFarook_03;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Screenshot_Tc1 {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver d=new FirefoxDriver();
		
		d.get("https://www.google.com/");
		
		//d.findElement(By.linkText("Gmail"));
		WebDriverWait w1=new WebDriverWait(d, 10);
		w1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Gmail")));
		d.findElement(By.linkText("Gmail")).click();
		
		File Gglpic=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Gglpic, new File("C:\\Users\\USER\\Desktop\\google\\ggl.png"));
	}

}
