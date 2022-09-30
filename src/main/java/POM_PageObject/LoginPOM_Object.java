package POM_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPOM_Object {
	
	
	//Store All WebElement Here

WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement txt_email;
	
	
	@FindBy(how=How.XPATH,using="//input[@type='password']")	
	private WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//button[@id='loginbutton']")
	private WebElement btn_login;
	
	
	public WebElement getTxt_email() {     //Generate getter and setter method but we dont used setter method because we don't want to send value
		return txt_email;                   //that's why remove setter value      
		
	
	}

    public WebElement getTxt_password() {
		return txt_password;
	}

	public WebElement getBtn_login() {
		return btn_login;
	}

	


	
	
                                                        
	
	
	
	
}
