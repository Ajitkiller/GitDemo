package JanLast;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc2Image {

	public static void main(String[] args) {
	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> img=driver.findElements(By.tagName("img"));
	    System.out.println(img.size());
		
		
	}

}
