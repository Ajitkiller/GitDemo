package ProgWithFarook_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Btn_Tc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.mercurytravels.co.in/");
		
		List<WebElement>radio=d.findElements(By.tagName("//input[@type='radio']"));
		for (int i = 0; i < radio.size(); i++) {
			String name=radio.get(i).getText();
			if (radio.get(i).isSelected()) {
				System.out.println(name+"Is active");
			}
			else {
				System.out.println(name+"is not active");
			}
			
		}
		
		
		
		
		
	}

}
