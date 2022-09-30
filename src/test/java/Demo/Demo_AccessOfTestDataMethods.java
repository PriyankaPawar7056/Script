package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_AccessOfTestDataMethods {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		
		Library.getExcelData_Numeric("Sheet1", 0, 3);
		System.out.println(Library.getExcelData_String("Sheet1", 0, 1));
		
		txt_email.sendKeys(Library.getExcelData_String("Sheet1", 0, 1));
		
		Thread.sleep(3000);
		
		txt_email.sendKeys(Library.getExcelData_Numeric("Sheet1", 0, 3));
		
		//OR
		//Send-keys method 
		
		Library.custom_sendkeys(txt_email, Library.getExcelData_String("Sheet1", 0, 1));
		
		

	}

}
