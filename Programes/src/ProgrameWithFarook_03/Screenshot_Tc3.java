package ProgrameWithFarook_03;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot_Tc3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.google.com/");
		
		List<WebElement>links=d.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			if(links.get(i).isDisplayed()){
			String name=links.get(i).getText();
			Thread.sleep(3000);
			links.get(i).click();
		
			File ggl=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ggl, new File("C:\\Users\\USER\\Desktop\\google\\"+name+".png"));
			Thread.sleep(5000);
			d.navigate().back();
			Thread.sleep(3000);
			links=d.findElements(By.tagName("a"));
			}
			
			
		}
		
		
	
	
	
	
	
	
	
	
	
	}
	
}
