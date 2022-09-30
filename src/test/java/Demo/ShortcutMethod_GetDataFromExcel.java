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

public class ShortcutMethod_GetDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		//txt_email.sendKeys("Test");   //Test is a Hard-Coaded Data
		
		getExcelData_String("Sheet1",0,0);
		getExcelData_String("Sheet1",0,1);
		System.out.println(getExcelData_String("Sheet1",0,2));        //String Value in this cell
		System.out.println(getExcelData_Numeric("Sheet1",0,3));       //Numeric Value in this cell
		
		txt_email.sendKeys(getExcelData_Numeric("Sheet1",0,3));     //send value to email
		

	}
public static String getExcelData_String(String sheetname,int row,int cell) throws IOException {//Return type is string that's why void remove add string
		String filepath="C:\\Users\\rpgsa\\eclipse-workspace\\Demo_Batch_10A\\TestData\\Data_3.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();     //Automatic throw return exception when we add string
		
		
	}
public static String getExcelData_Numeric(String sheetname,int row,int cell) throws IOException {//Return type is string that's why void remove add string
	String filepath="C:\\Users\\rpgsa\\eclipse-workspace\\Demo_Batch_10A\\TestData\\Data_3.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	double data= wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();     //Automatic throw return exception when we add string
	return String.valueOf(data).replace(".", "").replace("E8", "");      //convert data into string (987654321)
}
}