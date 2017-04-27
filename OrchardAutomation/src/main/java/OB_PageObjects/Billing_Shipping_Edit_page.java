package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class Billing_Shipping_Edit_page {
	WebDriver driver;

	public Billing_Shipping_Edit_page(WebDriver driver){
		this.driver=driver;
	}
	public void  City(){
	driver.findElement(By.id("address1"));
		
	}
		

}
