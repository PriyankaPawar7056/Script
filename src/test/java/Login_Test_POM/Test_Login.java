package Login_Test_POM;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM_PageObject.LoginPOM_Object;
import POM_Utility.BaseClass;
import Utility.Library;

public class Test_Login extends BaseClass{
	
	//Write Test Case here
	
	@Test
	public void ValidDataTest_001() throws IOException {
		                                         
		//To make Browser open code accessible here thats why extends extends BaseClass
		
	//Now to accessible web-element	from LoginPOM_Object class
		
		LoginPOM_Object login=PageFactory.initElements(driver, LoginPOM_Object.class);
		login.getTxt_email().sendKeys("RaniPawar");
		login.getTxt_password().sendKeys("rani123");
		login.getBtn_login().click();
		
		//****************OR directly call from library framework
		
		//Try and Catch 
		Library.custom_sendkeys(login.getTxt_email(), "RaniPawar");
		POM_Utility.Library.custon_SendKeys(login.getTxt_password(), "rani123");
		
		//Capture ScreenShot
		POM_Utility.Library.getScreenShotCapture();
		}
	
	@Test
	public void InvalidDataTest_002() {
		                                         
		//To make Browser open code accessible here thats why extends extends BaseClass
		
	//Now to accessible web-element	from LoginPOM_Object class
		
		LoginPOM_Object login=PageFactory.initElements(driver, LoginPOM_Object.class);
		login.getTxt_email().sendKeys("RaniPawar");
		login.getTxt_password().sendKeys("rani123");
		login.getBtn_login().click();
		
	     Assert.assertTrue(false);       //Fail test case for understanding purpose

}
	
}