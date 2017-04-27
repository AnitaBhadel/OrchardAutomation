package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class my_Account_page {
	WebDriver driver;
	By wishListLink=By.linkText("Wish List");
	By changeEmailPasswordLink=By.linkText("Change My Email Address Or Password");
	By BillingInformationLink=By.linkText("Billing Address & Credit Card Info");
	By addressBookLink =By.linkText("Address Book");
	
	
	
	public my_Account_page(WebDriver driver){
		this.driver=driver;
	}
	public void WishListlink(){
		driver.findElement(wishListLink).click();
	}
	public void changeEmailPasswordLink(){
		driver.findElement(changeEmailPasswordLink).click();
	}
	public void BillingInformationLink(){
		driver.findElement(BillingInformationLink).click();
	}
	public void addressBookLink(){
		driver.findElement(addressBookLink).click();
	}

}
