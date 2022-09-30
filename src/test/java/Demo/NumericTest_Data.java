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

public class NumericTest_Data {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		
		String filepath="C:\\Users\\rpgsa\\eclipse-workspace\\Demo_Batch_10A\\TestData\\Data_3.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		double data_3=wb.getSheet("Sheet1").getRow(0).getCell(3).getNumericCellValue();
		String data_4=String.valueOf(data_3).replace(".", "").replace("E8", "");      //convert data into string (987654321)
		txt_email.sendKeys(data_4);    //numeric converted into string then send that value through send-keys
		System.out.println(data_4);
		
		//String data_2=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		//	txt_email.sendKeys(data_2);   //Already a string value in excel sheet
		
		
		
		
		
		
		

	}

}
