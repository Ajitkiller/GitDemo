package AtuTestRecorder;

import java.awt.image.BufferedImage;
import java.io.IOException;
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

public class QRcode {

	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.barcodesinc.com/generator/qr/?chl=ajit&chs=200x200&cht=qr&chld=H%7C0&g-recaptcha-response=&g-recaptcha-response=03AERD8Xo1SPoKCQYc89oXNXdkWuFMlYO224TSpAklNNIsGyDQER8BluOrkdqQOf6QNiit1d3-ZxowuSbmf4ao4l0F8BxpLHAY0vQ3hvPf5197SlSWvx_T-_dJ0_7a9nJJ9xoK9T9N1NSk4308o7UOuras8HzzrEw-PsUPnFcdeWKUopnE8gA3ZhH7LeLTzFfaua9_t1DKjgdnvdzWxkGdXRjwolroXiro7EXunqA3OvKEe2EQWIPXTRzOVV3Giy0pdnsvw7tPVYAdBrg1vW6YZeMOirIEG2f-jCrEWd2Yzh1LkV_VwI9bQ-xAWh-5tLzociHutWaCfm2E-tm-LFoqe8Duk18KORsE8mT39XJIHRO6NFCZp7CuzD5jXbWT1YcJiez9Idf1V3kFKuYH8BRwbOW2c4x4vBtXWQ");
	}
	@Test 
	public void barCode() throws IOException, NotFoundException, InterruptedException {
		Thread.sleep(5000);
		//driver.findElement(By.id("input_5")).sendKeys("Ajit is dead killer is back");
		String imgurl=driver.findElement(By.xpath("/html/body/div[6]/div[1]/a/img")).getAttribute("src");
		Thread.sleep(5000);
		URL url=new URL(imgurl);
		BufferedImage bimg=ImageIO.read(url);
		LuminanceSource isource=new BufferedImageLuminanceSource(bimg);
		BinaryBitmap bmap=new BinaryBitmap(new HybridBinarizer(isource));
		Result rs= new MultiFormatReader().decode(bmap);
		System.out.println("Bar code is "+" "+rs.getText());
		
	}
}
