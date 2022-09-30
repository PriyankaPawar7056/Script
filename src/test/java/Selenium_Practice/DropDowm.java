package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();    //chromedriver Executable
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement drp_select=driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		Select s=new Select(drp_select);
		
		s.selectByIndex(1);    //it is not Used Because if their is a dynamic value then it does not giver a expected value 
		Thread.sleep(2000);
		
		s.selectByValue("option2");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Option3");
		Thread.sleep(1000);
		
		//To Find ByDefault value of DropDown
		WebElement defaultOption=s.getFirstSelectedOption();
		System.out.println(defaultOption.getText());
		
		//To find How Many OPtions In DropDowm
		System.out.println(s.getOptions().size());
		
		driver.close();

	}

}
