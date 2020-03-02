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

public class Tc6Screenshot {

	public static void main(String[] args) throws IOException {
		
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	//	way---1
		
	/*	List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("total links are:"+links.size());
		String Expected="Business";
		
		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).isDisplayed()) {
				
			
			String Actual=links.get(i).getText();
			if (Actual.contains(Expected)) {
				
				String lname=links.get(i).getText();
					System.out.println("business case pass");
					File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(srcfile, new File("C:\\Users\\USER\\Desktop\\Screenshot\\business.png"));
					//driver.navigate().back();
					//links=driver.findElements(By.tagName("a"));
			}
				else
					System.out.println("tc fail");
			}
		}*/
		
	//way--2
		
		WebElement business=driver.findElement(By.xpath("/html/body/div/div[5]/div[1]/div/div/div/div/span[2]/a[2]"));
		String Actual=business.getText();
		String Expected="Business";
		
		if (Actual.contains(Expected)) {
			
				System.out.println("business case pass");
				File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcfile, new File("C:\\Users\\USER\\Desktop\\Screenshot\\business.png"));
				//driver.navigate().back();
				//links=driver.findElements(By.tagName("a"));
		}
			else
				System.out.println("tc fail");
		
	}

}
