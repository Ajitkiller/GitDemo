package ProgrameWithFarook_06;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class Qr_code_Tc1 {

	WebDriver d;
	@BeforeTest
	public void openBrow(){
		d=new FirefoxDriver();
		d.get("");
		}
	@Test
	public void performTest() throws IOException, NotFoundException{
		
	String d1=d.findElement(By.xpath("//*[' ']")).getAttribute("src");
	URL u1=new URL(d1);
	BufferedImage bio=ImageIO.read(u1);
	LuminanceSource lso=new BufferedImageLuminanceSource(bio);
	BinaryBitmap bmp=new BinaryBitmap(new HybridBinarizer(lso));
	Result rs=new MultiFormatReader().decode(bmp);
	System.out.println("name of bar code is :"+rs.getText());
	
	
	
	
	}
	
	
	
}
