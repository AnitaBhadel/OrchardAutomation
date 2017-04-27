package OB_Regression;

import org.junit.After;



//import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OB_PageObjects.AddressBook_Page;
import OB_PageObjects.HomePage;

import OB_PageObjects.SignIn_page;
import OB_PageObjects.my_Account_page;

public class ShippingAddress_AddEditDelete {
WebDriver driver;
	
	
	@Before 
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Test
	public void Shipping_AddressAddEditDelete() throws InterruptedException {
		driver.get("http://obc-apl-stg2.ms.frymulti.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
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
		Thread.sleep(5000);
		
		my_Account_page Account=new my_Account_page(driver);
		Account.addressBookLink();
		Thread.sleep(4000);
		
		AddressBook_Page Shipping=new AddressBook_Page(driver);
		Shipping.inputFirstName();
		Thread.sleep(5000);
		Shipping.inputLastName();
		Thread.sleep(5000);
		Shipping.inputStreet();
		Thread.sleep(5000);
		Shipping.inputCity();
		Thread.sleep(5000);
		Shipping.stateDropdown();
		Thread.sleep(5000);
		Shipping.selectZip();
		Thread.sleep(5000);
		Shipping.inputPhone();
		Thread.sleep(5000);
		Shipping.saveAddressButton();
		Thread.sleep(5000);
		Shipping.inputApartmentno();
		Thread.sleep(5000);
		Shipping.clickUpdatedButton();
		Thread.sleep(5000);
		veriifShippingAddressaddedMessage();
		Thread.sleep(5000);
		
		Shipping.updateShippingAddress();
		Thread.sleep(5000);
		veriifyShippingaddressUpdated();
		Thread.sleep(5000);
		
		Shipping.deleteShippingAddress();
		Thread.sleep(5000);
		veriifyShippingAddressDeleted();
		Thread.sleep(5000);
		
		
	}
	public void veriifShippingAddressaddedMessage(){
		if(driver.getPageSource().contains("Successfully added Anita's new address to address book.")){
			System.out.print("Shipping Address is added in the Account");
			}
			else {
				System.out.print("Shipping address is not added");
			}
		}
	public void veriifyShippingaddressUpdated(){
		if(driver.getPageSource().contains("Successfully updated Anita's address in address book.")){
			System.out.print("\n Shipping address is updated");
			}
			else {
				System.out.print("\n Shipping address is not updated");
			}
		}
		
	public void veriifyShippingAddressDeleted(){
		if(driver.getPageSource().contains("You successfully deleted an address.")){
			System.out.print("\n Shipping address is deleted");
			}
			else {
				System.out.print("\n Shipping address is not deleted");
			}
		}

	@After
	public void TearDown(){
		driver.quit();
	}
	
}
