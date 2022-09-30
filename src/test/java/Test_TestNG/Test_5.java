package Test_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_5 {
	
	//If We Have 25 sanity test cases and 75 regression test cases 
	//and suppose team lead says i want only sanity 25 test case (OR regression test cases) execution then we provide GROUPS to test cases
	
	@BeforeMethod
	public void BM () {
		System.out.println("Browser Open");
	}
	@Test(groups= {"Sanity"})
	public void Test_001() {
		System.out.println("Test_1");
	}
	@Test(groups= {"Regression"})
	public void Test_002() {
		System.out.println("Test_2");
	}
	@Test(groups= {"Sanity"})
	public void Test_003() {
		System.out.println("Test_3");
	}
	@Test(groups= {"Regression"})
	public void Test_004() {
		System.out.println("Test_4");
	}
	
	@AfterMethod
	public void AM () {
		System.out.println("Close Browser");
	}
	
	
	
	
	
	
	
	
}
