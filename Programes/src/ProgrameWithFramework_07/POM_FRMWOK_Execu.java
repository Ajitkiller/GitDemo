package ProgrameWithFramework_07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POM_FRMWOK_Execu {

	WebDriver d;
	
	@Test
	public void techm() throws InterruptedException{
		d=new FirefoxDriver();
		d.get("https://opensource-demo.orangehrmlive.com/");
		
		LognFunction pag1=PageFactory.initElements(d, LognFunction.class);
		pag1.Login("Admin", "admin123");
		
		AddUser_Tc1 pag2=PageFactory.initElements(d, AddUser_Tc1.class);
		pag2.Adduser("Ajit", "Kumar", "Sahoo", "10012");
		
		LogOut_Opert pag3=PageFactory.initElements(d, LogOut_Opert.class);
		pag3.logout();
	}
}
