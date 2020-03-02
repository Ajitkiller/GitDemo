package JanLast;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tagname {

	public static void main(String[] args) {
	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		/*List<WebElement>elements=driver.findElements(By.tagName("a"));
		System.out.println("no. of links is :"+elements.size());
		
		elements=driver.findElements(By.tagName("img"));
		System.out.println("no. of links is :"+elements.size());
		
		elements=driver.findElements(By.tagName("select"));
		System.out.println("no. of links is :"+elements.size());
		
		elements=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("no. of links is :"+elements.size());
		
		elements=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("no. of links is :"+elements.size());
		
		elements=driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("no. of links is :"+elements.size());
		*/
		List<WebElement>elements=driver.findElements(By.tagName("a"));
		
		elements.addAll(driver.findElements(By.tagName("img")));
		elements.addAll(driver.findElements(By.tagName("select")));
		elements.addAll(driver.findElements(By.xpath("//input[@type='radio']")));
		elements.addAll(driver.findElements(By.xpath("//input[@type='checkbox']")));
		
		elements.addAll(driver.findElements(By.xpath("//input[@type='text']")));
		System.out.println("no. of tagname is :"+elements.size());
		
	}

}
