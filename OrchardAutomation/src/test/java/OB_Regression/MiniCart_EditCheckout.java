package OB_Regression;
import java.util.Iterator;



import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OB_PageObjects.HomePage;
import OB_PageObjects.Product_catalog_page;
import OB_PageObjects.SignIn_page;
import OB_PageObjects.edit_Shoes_Page;

import OB_PageObjects.mini_Cart_page;

import OB_PageObjects.product_Page_shoe;
import OB_PageObjects.shopping_Bag_Page;

public class MiniCart_EditCheckout {
WebDriver driver;

	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
		driver  = new ChromeDriver();
	}

	@Test
	public void miniCart_EditCheckout() throws InterruptedException {
		driver.get("http://obc-apl-stg2.ms.frymulti.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);	
		
		HomePage home=new HomePage(driver);
		home.signInLink();
		Thread.sleep(4000);
		
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
		 
		 shopping_Bag_Page shopping=new shopping_Bag_Page(driver);
		 //shopping.shoppingBagHooverOver();
		 
		 mini_Cart_page mini=new mini_Cart_page(driver);
		 //mini.closeLink();
		 //Thread.sleep(2000);
		 
		 shopping.shoppingBagHooverOver();
		 Thread.sleep(4000);
		 
		 mini.selectEdit();
		 Thread.sleep(8000);
		 
		 //String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		 String subWindowHandler = null;

		 Set<String> handles = driver.getWindowHandles(); // get all window handles
		 Iterator<String> iterator = handles.iterator();
		 while (iterator.hasNext()){
		     subWindowHandler = iterator.next();
		 }
		 driver.switchTo().window(subWindowHandler);
		 Thread.sleep(7000);
		 
		
		 edit_Shoes_Page edit=new edit_Shoes_Page(driver);
		 edit.editShoes();
		 Thread.sleep(4000);
		 
		 mini.MiniCartCheckout();
		 Thread.sleep(4000);
	}
	
		 
		 
		 
          

	
		
		 
		
	}


