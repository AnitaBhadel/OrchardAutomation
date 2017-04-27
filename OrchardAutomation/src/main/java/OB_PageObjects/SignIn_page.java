package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn_page {
	WebDriver driver;
	By inputUserName=By.id("userName");
	By inputPassword=By.id("password");
	By signInButton=By.xpath("//input[@value='Sign In']");
	By logoutLink=By.linkText("Sign Out");
	
	public SignIn_page(WebDriver driver){
		this.driver=driver;
	}
	
	
	public void userName(){
		WebElement inputUserNameElement=driver.findElement(By.id("userName"));
		inputUserNameElement.clear();
		inputUserNameElement.sendKeys("anitaacharya123@yahoo.com");
		
	}
	public void password(){
		WebElement inputPasswordElement=driver.findElement(inputPassword);
		inputPasswordElement.clear();
		inputPasswordElement.sendKeys("apple123");
		
	}
	public void signInButton(){
		WebElement signInButtonElement=driver.findElement(signInButton);
		signInButtonElement.click();
	
		
	}
	public void signInWithUser2() throws InterruptedException{
		WebElement inputUserNameElement=driver.findElement(By.id("userName"));
		inputUserNameElement.clear();
		inputUserNameElement.sendKeys("test@yahoo.com");
		 Thread.sleep(4000);
		
		WebElement inputPasswordElement=driver.findElement(inputPassword);
		inputPasswordElement.clear();
		inputPasswordElement.sendKeys("apple123");
		
	
	}
	public void signInWithUser3() throws InterruptedException{
		WebElement inputUserNameElement=driver.findElement(By.id("userName"));
		inputUserNameElement.clear();
		inputUserNameElement.sendKeys("musa250@yahoo.com");
		 Thread.sleep(4000);
		
		WebElement inputPasswordElement=driver.findElement(inputPassword);
		inputPasswordElement.clear();
		inputPasswordElement.sendKeys("apple123");
		
	
	}
	
	
	public void verifyUserSignedIn(){
		if(driver.findElement(logoutLink).getText().equalsIgnoreCase("Sign Out")) {
			System.out.print("user signed in successfully");
		}
		else {
			System.out.print("user is unable to sign sign In");
	}
	
	
}
}
