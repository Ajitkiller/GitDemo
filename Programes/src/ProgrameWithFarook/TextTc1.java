package ProgrameWithFarook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextTc1 {

	public static void main(String[] args) {
		//Open browser
		FirefoxDriver d=new FirefoxDriver();
		//commands for implecity wait
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Navigate to mecury travel
		d.get("https://www.mercurytravels.co.in/");
		//int a[]=new int [size];
		List<WebElement>nort=d.findElements(By.tagName("p"));
		List<WebElement>bolt=d.findElements(By.tagName("b"));
		System.out.println("Total no of normal text is :"+nort);
		System.out.println("Total no of normal text is :"+bolt);
		
		
		
		
		
		
		
		
		
		
		
	}

}
