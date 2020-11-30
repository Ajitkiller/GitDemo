package ProgWithFarook_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Btn_Tc2 {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.mercurytravels.co.in/");
		
		List<WebElement>radio=d.findElements(By.xpath("//input[@type='radio']"));
		for (int i = 0; i < radio.size(); i++) {
			
			String name=radio.get(i).getText();
			System.out.println(name);
		}
		
		
		
	}

}
