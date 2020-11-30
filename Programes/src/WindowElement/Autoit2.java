package WindowElement;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoit2 {
WebDriver d;
@BeforeTest
public void openSite(){
	d=new FirefoxDriver();
	d.get("https://www.selenium.dev/");
	System.out.println("Site open successfully");
}
@Test
public void findWebelement() throws IOException, InterruptedException{
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.findElement(By.xpath("/html/body/header/nav/a[1]")).click();
	System.out.println("Click on download option");
	Thread.sleep(5000);
	d.findElement(By.linkText("3.141.59")).click();
	System.out.println("Click on webdriver for download");
	java.lang.Runtime.getRuntime().exec("C:\\Users\\USER\\Desktop\\webd03.exe");
	System.out.println("Download successfully");
}
}
