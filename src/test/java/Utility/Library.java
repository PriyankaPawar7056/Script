package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class Library {

	      //Suppose i want to use this methods any class that's why we create new package and under this library class we add all methods 
	      //and we call it Anywhere because its public
		
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

	//Send Keys method we check isEnabled or not then send values 
	//because when he get any exception at a particular line then it is abnormally terminate from that particular line  
	public static void custom_sendkeys(WebElement element , String values) {
		
		
	//	try {
	//		element.sendKeys(values);            {    WE CAN DO THIS WAY ALSO TRY AND CATCH   }
			
		//}catch (Exception e){
			
	//	}
       
		if(element.isEnabled())  {
		
		element.sendKeys(values);
		
		}else {
		
		System.out.println("element is disabled");
		
		}
		
		
		
}
}