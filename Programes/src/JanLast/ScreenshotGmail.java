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

public class ScreenshotGmail {

	public static void main(String[] args) throws IOException {
		
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mygoodtimes.in/");
		
		List<WebElement> links=driver.findElements(By.linkText("BKFS"));
		if (links.size()==0) {
			
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\Users\\USER\\Desktop\\Screenshot\\bkfs.png"));
		}
		else{
			System.out.println("click the link");
			links.get(0).click();
		}
		
		
		
		
		
	}

}
