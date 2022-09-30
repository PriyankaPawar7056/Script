package POM_Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.utility.RandomString;

public class Library {
	
	public static WebDriver driver;
	
	public static void custon_SendKeys(WebElement element,String value) {
		
		//For Exception Handling used try and catch
		try {
			element.sendKeys(value);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	//get ScreenShotCapture code
	      
	public static void getScreenShotCapture() throws IOException {
		
		
		String RS=RandomString.make(3);   
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dist=new File("C:\\Users\\rpgsa\\eclipse-workspace\\Demo_Batch_10A\\ScreenShot\\FB_Module\\FBlogin"+RS+".png");
		FileUtils.copyFile(source, dist);
	}
	
	// getExpliciteWait code
	public static void getExpliciteWait(WebDriver driver,WebElement element, long time) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
		
	}
	
	
	
	
	}
