package OB_Regression;

//import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import OB_PageObjects.Billing_Information_page;
import OB_PageObjects.HomePage;
import OB_PageObjects.SignIn_page;
import OB_PageObjects.my_Account_page;

public class UpdateBillingAddress {
WebDriver driver;

	
	@Before 
	public void setup(){
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
}

	@Test
	public void updateBillingAddress() throws InterruptedException {
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
		
		
		my_Account_page Account=new my_Account_page(driver);
		Account.BillingInformationLink();
		Thread.sleep(4000);
		
		Billing_Information_page billing=new Billing_Information_page(driver);
		billing.inpuFirstName();
		Thread.sleep(1000);
		billing.inputLastName();
		Thread.sleep(1000);
		billing.inputStreetAddess();
		Thread.sleep(1000);
		billing.inputCity();
		Thread.sleep(1000);
		billing.StateDropDown();
		Thread.sleep(1000);
		billing.inputPhone();
		Thread.sleep(1000);
		billing.updateBillingAddressBtn();
		Thread.sleep(4000);
		billing.verifyBillingUpdatedMessage();
		Thread.sleep(1000);
		
	}

}
