package OB_Regression;

//import org.junit.After;



//import static org.junit.Assert.*;

//import org.junit.After;
import org.junit.Before;

import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OB_PageObjects.Billing_Checkout;
import OB_PageObjects.OrderSummary_Checkout_page;
import OB_PageObjects.Payment_Checkout_Page;
import OB_PageObjects.Shipping_Checkout_page;
import OB_PageObjects.SignIn_page;
import OB_PageObjects.product_page_dress;

public class add_Gift_MessageTest {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(7000);
	}



	@Test
	public void Gift_Message() throws InterruptedException {
		driver.get("http://obc-apl-stg2.ms.frymulti.com/");
		driver.manage().window().maximize();
    
		OB_PageObjects.HomePage home=new OB_PageObjects.HomePage(driver);
		
		// calling the method signInlink form Homepage class 
		home.signInLink();
		Thread.sleep(2000);
		
		// instantiating SignIn_page
		SignIn_page signIn=new SignIn_page(driver);
		signIn.userName();
		Thread.sleep(500);
		signIn.password();
		Thread.sleep(500);
		signIn.signInButton();
		Thread.sleep(3000);
		
		//Checking if user is sign in successfully add
		signIn.verifyUserSignedIn();
		Thread.sleep(4000);
		
	
	
		home.searchdress();
		Thread.sleep(2000);
		
		
		//instantiating product_page_dress
		product_page_dress Item=new product_page_dress(driver);
		 Item.SelectsizeS();
		 Thread.sleep(1000);
		 Item.SelectcolorBlackCherry();
		 Thread.sleep(1000);
		 Item.AddToShoppingBag();
		 Thread.sleep(10000);
		 Item.Select_Shopping_Bag();
		 Thread.sleep(5000);
		 Item.CheckOut_header();
		 Thread.sleep(10000);
		 
		//instantiating Billing_Checkout class
		 Billing_Checkout checkout1=new Billing_Checkout(driver);
		 checkout1.continueButton();
		 Thread.sleep(20000);
		 
		 //instantiating Shipping class
		 Shipping_Checkout_page checkout2=new Shipping_Checkout_page(driver);
		 checkout2.addGiftMessage();
		 Thread.sleep(10000);
		
		 // checking the gift message is present in the shipping page
		 checkout2.checkgiftMessagePresent();
		 Thread.sleep(8000);
		 
		 checkout2.ContinueButton();
		 Thread.sleep(8000);
		 
		 //instantiating  Payment_Checkout_Page class
		 Payment_Checkout_Page checkout3=new Payment_Checkout_Page(driver);
		 checkout3.inputSecurityCode();
		 Thread.sleep(1000);
		 checkout3.ContinueButton();
		 Thread.sleep(4000);
		 
		 //instantiating  OrderSummary_Checkout_page class
		 OrderSummary_Checkout_page orderSummary=new OrderSummary_Checkout_page(driver);
		 orderSummary.select_place_Order();
		 Thread.sleep(4000);
		 orderSummary.orderPlacedSucessfully();
		 Thread.sleep(4000);
}
	

	//@After
	//public void tearDown(){
		
		// taking screenshot using try and catch exception handling 
	/* try{
		 File Src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(Src, new File("Q:\\Screenshots\\login.png"));
		System.out.println("Screenshot taken");
		} 
		
	 catch (Exception e) {
			System.out.println("Exception while taking Screenshot");
		}*/
		
	 //finally{
		//driver.quit();
	 // }
}		



