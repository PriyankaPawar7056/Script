package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard_Actions_ByActionsClass {

	public static void main(String[] args) {
		
		//Open Browser
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//for mouse moment and key-board actions Actions Class Used 
		Actions act=new Actions (driver);
		
		//Email=ID
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		act.keyDown(txt_email, Keys.SHIFT).sendKeys("bugspotter").keyUp(Keys.SHIFT).build().perform();
		
		//select value - control a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//copy  - control c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//click on password tab
        WebElement txt_Pass=driver.findElement(By.xpath("//div[@id='passContainer']"));
        txt_Pass.click();
		
        //Peast - control v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//click on login button
		WebElement btn_login=driver.findElement(By.xpath("//button[@value='1']"));
		btn_login.click();
		
		driver.close();
		
	}

}
