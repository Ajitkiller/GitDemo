package ProgrameWithFarook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc2 {
public static void main(String[] args) {
	
	//Open firefox browser
	FirefoxDriver d=new FirefoxDriver();
	
	d.get("http://www.icicibank.com");
	
	List<WebElement> links=d.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	
}
	
}
