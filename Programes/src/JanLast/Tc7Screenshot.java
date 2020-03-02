package JanLast;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc7Screenshot {

	public static void main(String[] args) throws IOException {
	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");

		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("total links are:"+links.size());
		
		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).isDisplayed()) {
				
			
			String lname=links.get(i).getText();
			
		links.get(i).click();
		if (links.size()<50) {
			System.out.println("Tc pass");
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File("C:\\Users\\USER\\Desktop\\Screenshot\\links50.png"));
			
		}
		else{
			System.out.println("fail");
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
		}
	}else {
		System.out.println("1,2,3 fail");
		driver.navigate().back();
		links=driver.findElements(By.tagName("a"));
		
	}

}
}}