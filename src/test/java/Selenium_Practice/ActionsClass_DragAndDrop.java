package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);    //Used to handle mouse and keyboard actions
		
		// Move one place to another place ( MoveToElement )
		WebElement drp_SEO=driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[2]"));
		
		act.moveToElement(drp_SEO).click().build().perform();
		
		Thread.sleep(2000);
		
		//right click
		WebElement btn_telecom_project=driver.findElement(By.xpath("//a[text()='Telecom Project']"))	;
		act.moveToElement(btn_telecom_project).contextClick().build().perform();
		
		//double click
		
		// act.doubleClick();
		
		//drag and drop
		
		WebElement source_element=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destination_WebElement=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		act.dragAndDrop(source_element, destination_WebElement).build().perform();
		
		Thread.sleep(2000);
		
		WebElement src_Element=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest_Element=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		act.dragAndDrop(src_Element, dest_Element).perform();
		
		//To get size of all the element
		List<WebElement> listelement=driver.findElements(By.xpath("//a[@class='button button-orange']"));
		System.out.println(listelement.size());
		System.out.println(listelement.get(0).getText());
		
	 //To get All the options name on console
		
		for(int i=0;i<listelement.size();i++) {
			
			System.out.println(listelement.get(i).getText());
		}
		
		driver.quit();
		
		

	}

}
