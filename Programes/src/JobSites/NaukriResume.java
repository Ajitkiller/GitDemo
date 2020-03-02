package JobSites;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NaukriResume {

	WebDriver driver;
	@BeforeTest
	public void openNaukri(){
		driver = new FirefoxDriver();
		//open browser navigate to naukri.com
		driver.get("https://www.naukri.com/mnjuser/homepage");	
		driver.manage().window().maximize();
	}
	@Test
	public void updateProfile() throws InterruptedException, IOException{
		List<WebElement>frame=driver.findElements(By.tagName("frame"));
		
		System.out.println("Total no of frames are in :"+frame.size());
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[2]/div/form/div[2]/div/div[1]/a[2]/span")).click();
		Thread.sleep(5000);
		
		String MainWindow=driver.getWindowHandle();		
		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                  //enter the valid data in Email-id
            		WebElement email=driver.findElement(By.id("identifierId"));
            		email.clear();
            		driver.manage().window().maximize();
            		email.sendKeys("sajit3701@gmail.com");
            		Thread.sleep(5000);
            		//click on Next button
            		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span")).click();
            		Thread.sleep(3000);
            		// Enter valid password for login
            		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Killer@1995");
            		Thread.sleep(3000);
            		//click on Next button
            		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
            		Thread.sleep(5000);     			
                    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
            			
                 		
            		
                                 
			}		
        }	
     // Switching to Parent window i.e Main Window.
       // driver.switchTo().window(MainWindow);				

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//click on edit profile
		driver.findElement(By.linkText("Edit Profile")).click();
		Thread.sleep(3000);
		//click on Delete button
		driver.findElement(By.linkText("DELETE RESUME")).click();
		//
		String delete=driver.switchTo().alert().getText();
		System.out.println(delete);
		Thread.sleep(3000);
		//click on Delete
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		//Click on upload resume
		driver.findElement(By.id("attachCV")).click();
		//Autoit executable jar file to Execute
		java.lang.Runtime.getRuntime().exec("‪C:\\Users\\USER\\Desktop\\naukri.exe");
		
		
		
	}
	
	
	
	
}
