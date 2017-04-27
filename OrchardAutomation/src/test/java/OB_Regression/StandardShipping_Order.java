package OB_Regression;

//import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import OB_PageObjects.Billing_Checkout;
import OB_PageObjects.HomePage;
import OB_PageObjects.OrderSummary_Checkout_page;
import OB_PageObjects.Payment_Checkout_Page;
import OB_PageObjects.Shipping_Checkout_page;
import OB_PageObjects.product_page_dress;

public class StandardShipping_Order {
 WebDriver driver;
 
 @Before
 public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
		driver  = new ChromeDriver();
	}
	
 	@Test
	public void standardShipping_Order() throws InterruptedException {
 		driver.get("http://obc-apl-stg2.ms.frymulti.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
				//Instantiating  class 	HomePage
				HomePage home=new HomePage(driver);
				
				home.searchdress();
				Thread.sleep(4000);
				
				//instantiating product_page_dress
				product_page_dress Item=new product_page_dress(driver);
				 Item.SelectsizeL();
				 Thread.sleep(4000);
				 Item.SelectcolorBlack();
				 Thread.sleep(6000);
				 Item.AddToShoppingBag();
				 Thread.sleep(4000);
				 Item.Select_Shopping_Bag();
				 Thread.sleep(4000);
				 Item.CheckOut_header();
				 Thread.sleep(4000);
				  
				 
				 //instantiating Billing_Checkout class
				 Billing_Checkout checkout1=new Billing_Checkout(driver);
				 checkout1.signIn();
				 Thread.sleep(6000);
				 checkout1.continueButton();
				 Thread.sleep(6000);
				 
				//instantiating Shipping class
				 Shipping_Checkout_page checkout2=new Shipping_Checkout_page(driver);
				 checkout2.standardShipping();
				 Thread.sleep(8000);
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


