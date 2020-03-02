package JanLast;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioEx1 {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		List<WebElement>radio=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("total no of radio buttons :"+"  "+radio.size());
		System.out.println("Name of all links are :");
		for (int i = 0; i < radio.size(); i++) {
			
			System.out.println(radio.get(i).getAttribute("name"));
		}
		
		
		
		
	}

}
