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

public class TaskTc {

	public static void main(String[] args) throws IOException {
	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).isDisplayed()) {
				String lname=links.get(i).getText();
				links.get(i).click();
				File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcfile, new File("C:\\Users\\USER\\Desktop\\google\\"+lname+".png"));
				
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));
				
			}
				
		}
		
		
		
		
		
		
	}

}
