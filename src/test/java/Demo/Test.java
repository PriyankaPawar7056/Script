package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.close();
		
		//WebDriverManager.chromedriver().setup();
	//	WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.rbi.org.in/");
	//	driver.manage().window().maximize();
	//	Thread.sleep(1000);
	//	driver.close();
		
		
		
		

	}

}
