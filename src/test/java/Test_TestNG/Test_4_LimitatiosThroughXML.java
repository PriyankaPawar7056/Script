package Test_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_4_LimitatiosThroughXML {
	
	@BeforeMethod
	public void BM () {
		System.out.println("Browser Open");
	}
	@Test
	public void Test_001() {
		System.out.println("Test_1");
	}
	@Test
	public void Test_002() {
		System.out.println("Test_2");
	}
	@Test
	public void Test_003() {
		System.out.println("Test_3");
	}
	@Test
	public void Test_004() {
		System.out.println("Test_4");
	}
	
	@AfterMethod
	public void AM () {
		System.out.println("Close Browser");
	}
	
	
	
	
	
	
	
	
	

}
