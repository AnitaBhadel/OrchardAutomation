package OB_Regression;

//import static org.junit.Assert.*;

import org.junit.Before;


import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import OB_PageObjects.Billing_Checkout;
import OB_PageObjects.HomePage;
import OB_PageObjects.OrderSummary_Checkout_page;
import OB_PageObjects.Payment_Checkout_Page;
import OB_PageObjects.Product_catalog_page;
import OB_PageObjects.Shipping_Checkout_page;
import OB_PageObjects.SignIn_page;
import OB_PageObjects.edit_Shoes_Page;

import OB_PageObjects.product_Page_shoe;
import OB_PageObjects.shopping_Bag_Page;

public class shoppingBagEdit_Order{
	
	WebDriver driver;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
		driver  = new ChromeDriver();
	}
	
	@Test
	public void shoppingBagEdit() throws InterruptedException {
		driver.get("http://obc-apl-stg2.ms.frymulti.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);	
		
		//Instantiating  class 	HomePage
		HomePage home=new HomePage(driver);
		home.signInLink();
		Thread.sleep(4000);
		
		
		
			// instantiating SignIn_page
				SignIn_page signIn=new SignIn_page(driver);
				signIn.userName();
				Thread.sleep(4000);
				signIn.password();
				Thread.sleep(4000);
				signIn.signInButton();
				Thread.sleep(4000);
				
				
				//search shoes 
				home.searchShoe();
				Thread.sleep(4000);
				
				//product catalog for shoes 
				Product_catalog_page product =new Product_catalog_page(driver);
				product.SelectProductName_comfortKnitShoe();
				Thread.sleep(4000);
				
				//product page for shoes 
				product_Page_shoe Item=new product_Page_shoe(driver);
				 Item.Selectsize();
				 Thread.sleep(4000);
				 Item.Selectcolor();
				 Thread.sleep(6000);
				 Item.AddToShoppingBag();
				 Thread.sleep(4000);
				 
				//instantiating Shopping_Bag_page 
				 shopping_Bag_Page shopping=new shopping_Bag_Page(driver);
				 shopping.shoppingBagHooverOver();
				 Thread.sleep(3000);
				 shopping.SelectshoppingBag_link();
				 Thread.sleep(7000);
				 shopping.editLink();
				 Thread.sleep(7000);
				 
				 //edit shoes from Shopping bag 
				 edit_Shoes_Page Edit=new  edit_Shoes_Page(driver);
				 Edit.editShoes();
				 Thread.sleep(4000);
				
				 shopping.checkoutButton();
				 Thread.sleep(5000);
				 
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
	

}
