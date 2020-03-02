package JanLast;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithImg {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		
	WebElement image=	driver.findElement(By.cssSelector(".fb_logo"));
		image.click();
		String Expected="Facebook";
		String Actual=driver.getTitle();
		if (Actual.contains(Expected)) {
			System.out.println("Tc is pass");
		}
		else
		System.out.println("Tc is fail");
		
		
		
		
		
		
		
		
	}

}
