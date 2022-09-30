package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {

	public static void main(String[] args) {
		
		// Open Browser
		
		WebDriverManager.chromedriver().setup();    //chromedriver Executable
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		//KeyBoard Actions
		Actions act=new Actions(driver);
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		
		// send value PRIYANKA to SearchBar
		act.keyDown(txt_email, Keys.SHIFT).sendKeys("bugspotter").keyUp(Keys.SHIFT).build().perform();
		
	    // To select value  ( Control A )
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		// To copy the Value ( Control c )
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		// click on password field and then paste the value ( Control P )
		WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_pass.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//click on login button
		WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
	//	btn_login.click();
		
	//	OR 
		txt_pass.sendKeys(Keys.ENTER);
		
		// close the driver
		driver.close();
		
		
		
		
		

	}

}
