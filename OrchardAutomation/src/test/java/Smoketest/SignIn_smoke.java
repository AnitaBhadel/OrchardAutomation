package Smoketest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn_smoke{
	WebDriver driver;
	 
	
	@Before 
	public void setup(){
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
}
	
	@Test
	public void sign_In() throws InterruptedException {
		driver.get("http://obc-apl-stg2.ms.frymulti.com/");

}
}
