package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mini_Cart_page {

	WebDriver driver;
	By miniCartCheckout=By.xpath("//*[@id='glo-ucart-totals']/input");
	By removeItemLink=By.linkText("remove");
	By selectEditLink=By.linkText("edit");
	By closeLink=By.linkText("close");
	
	public mini_Cart_page(WebDriver driver){
		this.driver=driver;
	}
	public void MiniCartCheckout(){
		driver.findElement( miniCartCheckout).click();
	}
	
	public void removeitemlink(){
		driver.findElement(removeItemLink).click();
	}
	public void selectEdit(){
		driver.findElement(selectEditLink).click();
		
	}
	public void closeLink(){
		driver.findElement(closeLink).click();
	}
}
