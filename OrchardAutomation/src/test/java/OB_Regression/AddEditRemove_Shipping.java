package OB_Regression;

//import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OB_PageObjects.Billing_Checkout;
import OB_PageObjects.HomePage;
import OB_PageObjects.Shipping_Checkout_page;
import OB_PageObjects.SignIn_page;
import OB_PageObjects.product_page_dress;

public class AddEditRemove_Shipping{
	WebDriver driver;

	@Before 
	public void setup(){
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
}


	@Test
	public void AddEditRemove_shipping() throws InterruptedException {
		driver.get("http://obc-apl-stg2.ms.frymulti.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		HomePage home=new HomePage(driver);
		home.signInLink();
		Thread.sleep(4000);
		
		// instantiating SignIn_page
		SignIn_page signIn=new SignIn_page(driver);
		signIn.userName();
		Thread.sleep(1000);
		signIn.password();
		Thread.sleep(1000);
		signIn.signInButton();
		Thread.sleep(4000);
	
		 
		
	}

}
