package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class product_Page_shoe {
	WebDriver driver;
	By shoeSize42=By.id("size42");
	By shoeSize41=By.id("size41");
	By shoeSize40=By.id("size40");
	By shoeSize36=By.id("size36");
	By shoeSize37=By.id("size37");
	By shoeSize38=By.id("size38");
	By shoeSize39=By.id("size39");
	By shoeColorBlack=By.xpath("//img[@alt='Black']");
	By shoeColorTan=By.xpath("//img[@alt='Tan']");
	By shoeColorNavy=By.xpath("//img[@alt='Navy']");
	By addToShoppingBagButton=By.cssSelector("input.obutton.pie");
	By shoppingBagLink=By.linkText("Shopping Bag");
	By checkoutHeader=By.xpath("//input[@value='Checkout']");

	
	public product_Page_shoe(WebDriver driver){
		this.driver=driver;
	}
	
	public void Selectsize(){
		driver.findElement(shoeSize42).click();
	}
	 public void Selectcolor(){
		 driver.findElement(shoeColorNavy).click();
	 }
	 
	 public void Select_Quantity(){
		Select QtyDropdown=new Select(driver.findElement(By.className("qty_number")));
		QtyDropdown.selectByValue("5");
		 
	 }
	 
	 public void AddToShoppingBag(){
		 driver.findElement(addToShoppingBagButton).click();
	 }
	 
	 public void Select_Shopping_Bag(){
		 driver.findElement(shoppingBagLink).click();
	 }
	 
	 public void CheckOut_header(){
		 driver.findElement(checkoutHeader).click();
		 
		 
	 }

}
