package OB_Regression;

//import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import OB_PageObjects.HomePage;
import OB_PageObjects.Product_catalog_page;
import OB_PageObjects.SignIn_page;
import OB_PageObjects.Wish_List_page;
import OB_PageObjects.my_Account_page;

import OB_PageObjects.product_Page_shoe;
import OB_PageObjects.shopping_Bag_Page;

public class WishList_AddViewRemove {
	WebDriver driver;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
		driver  = new ChromeDriver();
	}


	@Test
	public void wishList_AddViewRemove() throws InterruptedException {
		driver.get("http://obc-apl-stg2.ms.frymulti.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);	
		
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
		 Thread.sleep(4000);
		 shopping.SelectshoppingBag_link();
		 Thread.sleep(7000);
		 shopping.moveToWishListLink();
		 Thread.sleep(4000);
		 shopping.CheckItemMovedtoWishListMessagePresent();
		 Thread.sleep(4000);
		 shopping.myAccountlink();
		 Thread.sleep(7000);
		 
		 //My Account page 
		 my_Account_page account =new  my_Account_page(driver);
		 account.WishListlink();
		 Thread.sleep(7000);
		 
		 // wishList_page 
		 Wish_List_page wish=new Wish_List_page(driver);
		 wish.addTobag();
		 Thread.sleep(7000);
		 wish.checkNoitemleftmessage();
		 Thread.sleep(7000);
		 
		 //Shopping page
		 shopping.shoppingBagHooverOver();
		 Thread.sleep(4000);
		 
		 //Shopping bag page 
          shopping.SelectshoppingBag_link();
		 Thread.sleep(6000);
		 shopping.moveToWishListLink();
		 Thread.sleep(7000);
		
		 //wish list 
		 account.WishListlink();
		 Thread.sleep(7000);
		 
		 //wish list 
		 
		 wish.removeButton();
		 Thread.sleep(10000);
		
		 //Navigates to alert popup
		Alert all=driver.switchTo().alert();
		all.accept();
	}
		
		
		 
		 
		 

}

