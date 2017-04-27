package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class edit_Shoes_Page {
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
By updateShoppingBagButton=By.xpath("//input[@value='Update Shopping Bag']");

public edit_Shoes_Page(WebDriver driver){
	this.driver=driver;
}
public void editShoes() throws InterruptedException{
	driver.findElement(shoeSize36).click();
	 Thread.sleep(7000);
	 driver.findElement(shoeColorTan).click();
	 Thread.sleep(7000);
	 driver.findElement(updateShoppingBagButton).click();
	 Thread.sleep(7000);
	 
}
}
