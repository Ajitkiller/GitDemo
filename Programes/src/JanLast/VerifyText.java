package JanLast;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyText {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");

		WebElement text=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b"));
		String tname=text.getTagName();
		
		if (tname.equals("p")) {
			System.out.println("bold");
		}
		else {
			System.out.println("Normal");
		}
		
		
		
		
	}

}
