package ProgWithFarook_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Btn_Tc1 {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.mercurytravels.co.in/");
		
		List<WebElement>radio=d.findElements(By.tagName("//input[@type='radio']"));
		System.out.println("total no of radio buttons are :"+radio.size());
		
		
		
		
	}
	
	
	
}
