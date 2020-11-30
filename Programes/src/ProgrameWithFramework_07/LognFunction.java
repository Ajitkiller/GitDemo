package ProgrameWithFramework_07;

import java.awt.Menu;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class LognFunction {

		public Menu menu=null;
		public LognFunction(WebDriver d){
			menu=PageFactory.initElements(d, Menu.class);
	
		}
		@FindBy(id="txtUsername")
		WebElement user;
		@FindBy(id="txtPassword")
		WebElement pass;
		@FindBy(id="btnLogin")
		WebElement login;
		
		public void Login(String u,String p){
			user.clear();
			user.sendKeys(u);
			pass.clear();
			pass.sendKeys(p);
			login.click();
			
			
			
			
		}
		
		
		
		
		
		
}
