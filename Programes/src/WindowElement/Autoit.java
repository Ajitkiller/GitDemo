package WindowElement;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoit {
WebDriver d;
@BeforeTest
public void openBrowser(){
	d=new FirefoxDriver();
	d.get("https://www.hdnicewallpapers.com/Bikes-Wallpapers");
	System.out.println("site open successfully");
}
@Test
public void downloadPic() throws IOException, InterruptedException {
	d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
Thread.sleep(5000);
	//d.findElement(By.linkText("Bikes")).click();
	
	d.findElement(By.xpath("/html/body/main/div/div/div/div[1]/section/section[2]/div[1]/figure[2]/a/img")).click();
	System.out.println("image select successfully");
	d.findElement(By.xpath("/html/body/main/div/div/div/div[1]/section[4]/div[1]/div[2]/a/div")).click();
	System.out.println("successfully click download button");
		
	
	java.lang.Runtime.getRuntime().exec("C:\\Users\\USER\\Desktop\\ato10.exe");
	System.out.println("Autoit success");
}


}
