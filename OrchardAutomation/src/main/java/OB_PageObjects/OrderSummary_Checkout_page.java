package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummary_Checkout_page {
	WebDriver driver;
	
	By place_OrderButton=By.xpath("//input[@value='Place Order']");
	By chekoutMessage=By.id("thanksMessage");
	
	public  OrderSummary_Checkout_page(WebDriver driver){
		this.driver=driver;
	}
	public void select_place_Order(){
		
		driver.findElement(place_OrderButton).click();
	}
	public void orderPlacedSucessfully(){
		if(driver.findElement(chekoutMessage).getText().equalsIgnoreCase("Thank You for placing your Order. You should receive a confirmation email from us shortly.")) {
			System.out.print("Order placed sucessfully");
		}
		else{
			System.out.print("Order is not placed sucessfully");
		}
	}

}
