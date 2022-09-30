package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		WebElement drp_down=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		drp_down.click();
		
		List<WebElement> selenium=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		
		System.out.println(selenium.size());
		
	//	selenium.get(18).click();
		
	//	System.out.println(selenium.get(1).getText());
		
		for (int i=0;i<selenium.size();i++) {
			
			String txt_List=selenium.get(i).getText();
			System.out.println(txt_List);
			
			if(txt_List.equals("Login")) {
				
				selenium.get(i).click();
			}
			
		}
		
		//selenium.get(3).click();
		driver.close();
		
		
		
		
		
		
		
		

	}

}
