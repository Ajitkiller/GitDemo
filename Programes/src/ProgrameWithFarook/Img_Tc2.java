package ProgrameWithFarook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Img_Tc2 {

	public static void main(String[] args) {
		//Open browser
		FirefoxDriver d=new FirefoxDriver();
		//Navigate to flipkart.com
		d.get("https://www.flipkart.com/");
		//capture all img into a list
		List<WebElement>fk=d.findElements(By.tagName("img"));
		//count no of links
		System.out.println(fk.size());
	}

}
