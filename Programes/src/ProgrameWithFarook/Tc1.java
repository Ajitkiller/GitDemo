package ProgrameWithFarook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver d=new FirefoxDriver();
		d.get("http://gooogle.com");
		
		d.findElement(By.linkText("Gmail")).click();
		
		String Expected="Gmail";
		
		String Actual=d.getTitle();
		
		if (Actual.contains(Expected)) {
			System.out.println("Pass");
		}
		
		
	}

}
