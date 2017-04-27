package OB_Regression;

//import java.awt.List;

//import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import OB_PageObjects.Billing_Checkout;
import OB_PageObjects.HomePage;
import OB_PageObjects.OrderSummary_Checkout_page;
import OB_PageObjects.Payment_Checkout_Page;
import OB_PageObjects.Product_catalog_page;
import OB_PageObjects.Shipping_Checkout_page;

import OB_PageObjects.product_Page_shoe;
//import junit.framework.Assert;

public class Hawaii_Order{
WebDriver driver;
	
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void hawaiiAnonymousOrder() throws InterruptedException {
		driver.get("http://obc-apl-stg2.ms.frymulti.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		HomePage home=new HomePage(driver);
		home.searchShoe();
		Thread.sleep(4000);
		
		Product_catalog_page product =new Product_catalog_page(driver);
		product.SelectProductName_comfortKnitShoe();
		Thread.sleep(4000);
		
		product_Page_shoe Item=new product_Page_shoe(driver);
		 Item.Selectsize();
		 Thread.sleep(1000);
		 Item.Selectcolor();
		 Thread.sleep(1000);
		 Item.AddToShoppingBag();
		 Thread.sleep(5000);
		 Item.Select_Shopping_Bag();
		 Thread.sleep(1000);
		 Item.CheckOut_header();
		 Thread.sleep(4000);
		 
		 
		 //Billing checkout page-inputs billing address and proceed to checkout 2
		 Billing_Checkout checkout1=new Billing_Checkout(driver);
		 checkout1.inputHawaiiAddress();
		 checkout1.continueButton();
		 Thread.sleep(6000);
		 
			 
		 Shipping_Checkout_page Shipping=new Shipping_Checkout_page(driver);
		
		 //Verify all the shipping options are Disabled expect STD:AK and HI
		 Shipping.verifyShippingOptions_HI_AK();
		 Shipping.editShippingAddress();
		 Thread.sleep(6000);
			 
		 //Editing the billing address from checkout to AK
		 checkout1.inputAlaskaAddress();
		 checkout1.continueButton();
		 Thread.sleep(6000);
		 checkout1.useAddressAsEntered();
		 Thread.sleep(6000);
		 
		//Verify all the shipping options are Disabled expect STD:AK and HI
		 Shipping.verifyShippingOptions_HI_AK();
		
		
		 //ship item to different address (HI)
		 	Shipping.shipItemTodifferntAddress();
		 	Thread.sleep(6000);
		 	checkout1.shipItemTodifAdd_Hawaii();
		 	Thread.sleep(10000);
		 	
		 	Shipping_Checkout_page checkout2=new Shipping_Checkout_page(driver);
			 checkout2.ContinueButton();
			 Thread.sleep(8000);
			 
			 Payment_Checkout_Page checkout3=new Payment_Checkout_Page(driver);
			 checkout3.visa_radio_button();
			 Thread.sleep(1000);
			 checkout3.inputNameInCard();
			 Thread.sleep(1000);
			 checkout3.inputCreditCard();
			 Thread.sleep(8000);
			 checkout3.selectMonth();
			 Thread.sleep(8000);
			 checkout3.selectYear();
			 Thread.sleep(8000);
			 
			 
			 checkout3.inputSecurityCode();
			 Thread.sleep(1000);
			 checkout3.ContinueButton();
			 Thread.sleep(4000);
			 
			 
			 OrderSummary_Checkout_page orderSummary=new OrderSummary_Checkout_page(driver);
			 orderSummary.select_place_Order();
			 Thread.sleep(3000);
		
	
			 
		
	}
}
	

			 
			 
	


