package Selenium_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		//  Fetch  String Data  From  Excel
		String filepath="C:\\Users\\rpgsa\\eclipse-workspace\\Demo_Batch_10A\\Test_Data\\Data_Excel.xlsx";
		
		FileInputStream fis=new FileInputStream(filepath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		String data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		WebElement txt_emeil=driver.findElement(By.xpath("//input[@name='email']"));
		txt_emeil.sendKeys(data_1);
		
		// Get numeric data from excel in the form of string
		double data_2=wb.getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
		System.out.println(data_2);
		String data_3=String.valueOf(data_2).replace(".", "").replace("E9", "");
		System.out.println(data_3);
		WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_pass.sendKeys(data_3);
		

	}

}
