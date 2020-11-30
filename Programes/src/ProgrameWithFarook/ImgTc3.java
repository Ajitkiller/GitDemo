package ProgrameWithFarook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImgTc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open browser
		FirefoxDriver d=new FirefoxDriver();
		//Navigate to flipkart.com
		d.get("https://www.flipkart.com/");
		
	   List<WebElement> img=d.findElements(By.id(""));
	    for (int i = 0; i < args.length; i++) {
			
		
		System.out.println(img.get(i).getAttribute("src"));
	    }
		
		
	}

}
