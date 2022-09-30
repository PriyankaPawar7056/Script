package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Class {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
	   //mouse-moment over to web-element and click on that
		
		WebElement btn_selenium=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		
		Actions act=new Actions(driver) ;
		
		act.contextClick().perform();   //Used for right click on web-page
	
		//move mouse to selenium tab  //mouse-moment over to web-element and click on that
		act.moveToElement(btn_selenium).click().build().perform();
		
		//Drag and Drop
		WebElement source_Account_element=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement destination_element=driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		
		act.dragAndDrop(source_Account_element, destination_element).perform();
		
		Thread.sleep(3000);
		
		WebElement source_Amount_element=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	    WebElement destination_Amount_element=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		act.dragAndDrop(source_Amount_element, destination_Amount_element).perform();
		
		//Double click
		WebElement btn_bankproject=driver.findElement(By.xpath("//a[text()='Bank Project']"));
		act.doubleClick(btn_bankproject).perform();
		
		driver.close();
		
		
	}

}
