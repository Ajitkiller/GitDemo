package ProgrameWithFarook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Img_Tc1 {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.facebook.com/");
		
		d.findElement(By.id("")).click();
		String title=d.getTitle();
		
		System.out.println(title);
		
		
		
		
	}
	
	
	
}
