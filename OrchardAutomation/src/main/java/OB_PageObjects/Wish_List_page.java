package OB_PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Wish_List_page {
	WebDriver driver;
	
	By removeButton=By.xpath("//input[@value='Remove']");
	By addToBagButton=By.xpath("//input[@value='Add To Bag']");
	
	
	public Wish_List_page(WebDriver driver){
		this.driver=driver;
		
	}
	public void addTobag(){
		
			driver.findElement(addToBagButton).click();
	}
	
	//verify the no item left text is present 
	public void checkNoitemleftmessage(){
		if(driver.findElements(By.id("use-wis-no-items-txt")).size() != 0){
			 System.out.println("No item is present in wishlist\n");
			 }else{
			 System.out.println("item is present in wishlist\n");
			 }
}
	public void removeButton(){	
		driver.findElement(removeButton).click();
		
	}
	


}
