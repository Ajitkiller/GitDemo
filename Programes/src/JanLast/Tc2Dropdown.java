package JanLast;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc2Dropdown {

	public static void main(String[] args) {
		
	//	ProfilesIni pr=new ProfilesIni();
	//	FirefoxProfile pf=pr.getProfile("Ak007");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
//Tc-2		
		List<WebElement>Dropdown=driver.findElements(By.tagName("select"));
		System.out.println("total no. of Dropdown is   :"+" "+Dropdown.size());

//Tc-3	
		for (int i = 0; i < Dropdown.size(); i++) {
			//System.out.println(Dropdown.get(i).getAttribute("size"));
			System.out.println(Dropdown.get(i).getAttribute("name"));
			//System.out.println(Dropdown.get(i).getAttribute("code"));
			
		}
		
		
		
		
		
	}

}
