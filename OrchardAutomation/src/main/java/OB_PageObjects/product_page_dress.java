package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class product_page_dress {
WebDriver driver;
By dressSizeS=By.id("sizeS");
By dressSizeM=By.id("sizeM");
By dressSizeL=By.id("sizeL");
By dressColorBlack=By.xpath("//img[@alt='Black']");
By dressColorDarkMallard=By.xpath("//img[@alt='Dark Mallard']");
By dressColorBlackCherry=By.xpath("//img[@alt='Black Cherry']");
By addToShoppingBag=By.cssSelector("input.obutton.pie");
By selectShoppingBag=By.linkText("Shopping Bag");
By checkoutHeader=By.xpath("//input[@value='Checkout']");

public  product_page_dress(WebDriver driver){
	this.driver=driver;
}
public void SelectsizeS(){
	driver.findElement(dressSizeS).click();
	
}

public void SelectsizeM(){
	driver.findElement(dressSizeM).click();
	
}

public void SelectsizeL(){
	driver.findElement(dressSizeL).click();
	
}
public void SelectcolorBlack(){
	 driver.findElement(dressColorBlack).click();

}

public void SelectcolorDarkMallard(){
	 driver.findElement(dressColorDarkMallard).click();

}
public void SelectcolorBlackCherry(){
	 driver.findElement(dressColorBlackCherry).click();

}
public void AddToShoppingBag(){
	 driver.findElement(addToShoppingBag).click();
}

public void Select_Shopping_Bag(){
	 driver.findElement(selectShoppingBag).click();
}

public void CheckOut_header(){
	 driver.findElement(checkoutHeader).click();
	 
	 
}
}
