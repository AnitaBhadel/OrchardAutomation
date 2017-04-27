package OB_PageObjects;

import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	
	By signInLink=By.linkText("Sign In");
	By myAccountLink=By.linkText("My Account");
	By searchItem=By.id("keyword");
	
	public HomePage (WebDriver driver){
		this.driver=driver;
	}
	
	public void signInLink(){
		driver.findElement(signInLink).click();
		
	}

	public void MyAccount(){
		driver.findElement( myAccountLink).click();;
		
	}
	
        
    
	public void searchShoe(){
		driver.findElement(searchItem).sendKeys("shoes" + Keys.RETURN);
	}
	
	public void searchdress(){
		driver.findElement(searchItem).sendKeys("Ponte Long Sleeve Mockneck Dress" + Keys.RETURN);
        
	}
	
	
}

