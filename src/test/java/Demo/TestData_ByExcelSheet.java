package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestData_ByExcelSheet {

	public static void main(String[] args) throws IOException {
		
		//open Browser
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		//txt_email.sendKeys("Test");   //Test is a Hard-Coaded Data
		
		
		String filepath="C:\\Users\\rpgsa\\eclipse-workspace\\Demo_Batch_10A\\TestData\\Data_3.xlsx";
		FileInputStream fis=new FileInputStream(filepath);   //Creating object of FileInputStream
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//To get String data from excel sheet
	    String data_0=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String data_1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		String data_2=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();     //numeric value in excel sheet
		
		System.out.println(data_0);
		System.out.println(data_1);
		System.out.println(data_2);
		
		txt_email.sendKeys(data_0); //send value to email field
		
		
		
		
		

	}

}
