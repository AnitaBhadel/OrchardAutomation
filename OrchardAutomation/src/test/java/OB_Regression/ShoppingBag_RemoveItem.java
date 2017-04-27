package OB_Regression;

//import static org.junit.Assert.*;

import org.junit.Before;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OB_PageObjects.HomePage;
import OB_PageObjects.Product_catalog_page;
import OB_PageObjects.SignIn_page;
import OB_PageObjects.product_Page_shoe;
import OB_PageObjects.shopping_Bag_Page;

public class ShoppingBag_RemoveItem {
WebDriver driver;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
		driver  = new ChromeDriver();
	}
	
	@Test
	public void shoppingBag_RemoveItem() throws InterruptedException {
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
				 Thread.sleep(10000);
				 shopping.removeItemlink();
	}

}
