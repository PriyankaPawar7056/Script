package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUp_POM {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Username']")
	private WebElement txt_firstName;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastname']")
	private WebElement txt_lastName;
	
	public WebElement gettxt_firstName() {
		return txt_firstName;
	}
	
	public WebElement gettxt_lastName() {
		return txt_lastName;
	}
	

}
