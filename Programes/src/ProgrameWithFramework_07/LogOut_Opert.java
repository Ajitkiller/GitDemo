package ProgrameWithFramework_07;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut_Opert {

	public Menu menu=null;
	public LogOut_Opert(WebDriver d){
		menu=PageFactory.initElements(d, Menu.class);
		
	}
	@FindBy(xpath="//a[@id='welcome']")
	WebElement wecm;
	@FindBy(linkText="Logout")
	WebElement log;
	public void logout(){
		wecm.click();
		log.click();
	}
	
}
