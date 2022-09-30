package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class WebElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20com%20login%7C&placement=&creative=589460569900&keyword=facebook%20com%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409283615%26loc_physical_ms%3D9300107%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwlemWBhDUARIsAFp1rLXxRGQyp_5rsDMRLMTGR199pAUj-_TAfxTbs1Uo7x-pkdBrXF-dTWYaAjXSEALw_wcB");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		//Find WebElement
	   WebElement txt_firstname=(WebElement) driver.findElement(By.id("email"));
		txt_firstname.sendKeys("priyanka");
		
		Thread.sleep(3000);
		//driver.findElement(By.className(""));
		
		//driver.close();
		

	}

	private void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

}
