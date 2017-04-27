package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product_catalog_page {
	WebDriver driver;
	By ProductName_comfortKnitShoe=By.linkText("Comfort Knit Shoe by The The Tog Shop");

	public Product_catalog_page(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void SelectProductName_comfortKnitShoe(){
		driver.findElement(ProductName_comfortKnitShoe).click();
	}

}
