package Test_TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_ScreenShot {
	
	@Test
	public void VerifyTest_001() throws IOException{
		
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	
	String RS=RandomString.make(3);            //We make it as a dynamic
	
	//take screenshot of FB login page
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	File source=ts.getScreenshotAs(OutputType.FILE);
	
	//Now the screenshot is near to source and we need to move that screenshot to particular location that's why we need to create object of file class
	File dist=new File("C:\\Users\\rpgsa\\eclipse-workspace\\Demo_Batch_10A\\ScreenShot\\FB_Module\\FBlogin"+RS+".png");
	
	//Now screenshot is near to destination and we need to move screenshot 
	FileUtils.copyFile(source, dist);//we need to copysourceFile copy distinationFile thats why we call FileUtils.copyFile(sourceFile, distinationFile);
	
	}
	
	
	
	
	
	
	
	
	
}

