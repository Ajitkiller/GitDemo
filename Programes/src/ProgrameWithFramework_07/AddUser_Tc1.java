package ProgrameWithFramework_07;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser_Tc1 {
WebDriver d;
	public Menu menu=null;
	public AddUser_Tc1(WebDriver d){
	menu=PageFactory.initElements(d, Menu.class);
	
	}
	@FindBy(xpath="//a[@id='menu_pim_viewPimModule']/b")
	WebElement PIM;
	@FindBy(linkText="Add Employee")
	WebElement Addemp;
	@FindBy(xpath="//input[@id='firstName']")
	WebElement Fname;
	@FindBy(xpath="//input[@id='middleName']")
	WebElement Mname;
	@FindBy(xpath="//input[@id='lastName']")
	WebElement Lname;
	@FindBy(id="employeeId")
	WebElement Empid;
	@FindBy(id="photofile")
	WebElement photo;
	@FindBy(id="btnSave")
	WebElement Save;
	
	public void Adduser(String a, String c, String l, String id) throws InterruptedException{
	//	Actions a1=new Actions(d);
		//a1.moveToElement(PIM).build().perform();
		Thread.sleep(5000);
		PIM.click();
		Thread.sleep(5000);
		Addemp.click();
		Thread.sleep(5000);
		Fname.sendKeys(a);
		Mname.sendKeys(c);
		Lname.sendKeys(l);
		Empid.clear();
		Empid.sendKeys(id);
		//photo.click();
		Thread.sleep(5000);
		Save.click();
	}
	
}
