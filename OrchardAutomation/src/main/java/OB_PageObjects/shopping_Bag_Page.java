package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class shopping_Bag_Page {
	WebDriver driver;
	By shoppingBagLink=By.linkText("Shopping Bag");
	By editLink=By.linkText("Edit Item");
	By removeLink=By.linkText("Remove Item");
	By moveToWishListLink=By.linkText("Move to Wish List");
	By CheckoutButton=By.xpath("//input[@value='Checkout']");
	By myAccountlink=By.linkText("My Account");
	By shoppingBagHooverOver=By.id("widget-but-ucart");
	
	public shopping_Bag_Page(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void SelectshoppingBag_link(){
		driver.findElement(shoppingBagLink).click();
	}
	
	public void editLink(){
		driver.findElement(editLink).click();
		
	}
	public void removeItemlink(){
		driver.findElement(removeLink).click();
		
	}
	public void moveToWishListLink(){
		driver.findElement(moveToWishListLink).click();
		
	}
	public void checkoutButton(){
		driver.findElements(CheckoutButton).get(1).click();
		
	}
	
	public void CheckItemMovedtoWishListMessagePresent(){
		
		if(driver.findElements(By.className("common-message-blue")).size() != 0){
				 System.out.println("Item is added to WishList\n");
				 }else{
				 System.out.println("Item is not added to WishList message\n");
				 }
	}
		
	public void myAccountlink(){
		driver.findElement(myAccountlink).click();
	}
	public void shoppingBagHooverOver(){
		 
			Actions action = new Actions(this.driver);
			 WebElement miniCart = driver.findElement(shoppingBagHooverOver);
	         action.moveToElement(miniCart).build().perform();
	        
			
		}
	}



