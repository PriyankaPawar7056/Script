package Selenium_Practice;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggesion {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();   //chromedriver Executable
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement txt_searchbar=driver.findElement(By.xpath("//input[@name='q']"));
		txt_searchbar.sendKeys("Maven");
		
		Thread.sleep(2000);
		
		List<WebElement> autolist =driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		System.out.println(autolist.size());   //10
		
		System.out.println(autolist.get(0).getText());    //index value start from 0
		
		for (int i=0;i<autolist.size();i++) {
			Thread.sleep(2000);
			
			String txt_list=autolist.get(i).getText();
			System.out.println(txt_list);
			
			if (txt_list.equals("maven repository")) {
				autolist.get(i).click();
				
			}
			
			
		}
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
