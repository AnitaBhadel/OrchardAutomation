package OB_Regression;

//import java.io.File;


//import org.apache.commons.io.FileUtils;
//import org.junit.After;
import org.junit.Before;

import org.junit.Test;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import OB_PageObjects.Billing_Checkout;
import OB_PageObjects.HomePage;
import OB_PageObjects.OrderSummary_Checkout_page;
import OB_PageObjects.Payment_Checkout_Page;
import OB_PageObjects.Shipping_Checkout_page;
import OB_PageObjects.SignIn_page;
import OB_PageObjects.product_page_dress;




public class Appleseeds_SignIn_Order {
	WebDriver driver ;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
		driver  = new ChromeDriver();
	}

	
	
	@Test
	public void Appleseeds_order() throws InterruptedException {
		driver.get("http://obc-apl-stg2.ms.frymulti.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	
		
		
		//Instantiating  class 	HomePage
		HomePage home=new HomePage(driver);
		
		// calling the method signInlink form Homepage class 
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
		
		//Checking if user is sign in successfully 
		if(driver.getPageSource().contains("Sign Out")){
		System.out.print("user signed in successfully");
		}
		else {
			System.out.print("user is unable to sign in");
		}
		
		// OR checking text is present 
		/*WebElement Text=driver.findElement(By.linkText("Sign Out"));
		String gettext=Text.getText();
		System.out.println(gettext);
		Assert.assertEquals("Sign Out", gettext);*/
		
		//Thread.sleep(1000);
		
		home.searchdress();
		Thread.sleep(4000);
		
		
		
		//instantiating product_page_dress
		product_page_dress Item=new product_page_dress(driver);
		 Item.SelectsizeM();
		 Thread.sleep(1000);
		 Item.SelectcolorBlack();
		 Thread.sleep(1000);
		 Item.AddToShoppingBag();
		 Thread.sleep(4000);
		 Item.Select_Shopping_Bag();
		 Thread.sleep(4000);
		 Item.CheckOut_header();
		 Thread.sleep(4000);
		  
		 
		 //instantiating Billing_Checkout class
		 Billing_Checkout checkout1=new Billing_Checkout(driver);
		 checkout1.continueButton();
		 Thread.sleep(6000);
		 
		 //instantiating Shipping class
		 Shipping_Checkout_page checkout2=new Shipping_Checkout_page(driver);
		 checkout2.ContinueButton();
		 Thread.sleep(8000);
		 
		 Payment_Checkout_Page checkout3=new Payment_Checkout_Page(driver);
		 checkout3.inputSecurityCode();
		 Thread.sleep(4000);
		 checkout3.ContinueButton();
		 Thread.sleep(4000);
		 
		 
		 OrderSummary_Checkout_page orderSummary=new OrderSummary_Checkout_page(driver);
		 orderSummary.select_place_Order();
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
				}
				
			 finally{*/	
				//driver.quit();
			 // }
		//}
			
		 
		 
		 
		
	
	

}
