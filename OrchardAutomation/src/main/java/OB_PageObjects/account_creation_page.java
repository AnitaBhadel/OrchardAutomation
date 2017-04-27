package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class account_creation_page {
	WebDriver driver;

	By enterEmail=By.id("emailAddress");
	By reinputEmail=By.id("reEnterEmailAddress");
	By enterPassword=By.id("passwordNewMember");
	By confirmPassword=By.id("verifyPassword");
	By zip=By.id("zipCode");
	By createAccountbutton=By.xpath("//input[@value='Create An Account']");
	By logoutLink=By.linkText("Sign Out");
	
	public account_creation_page(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void inputEmail(){
		
	WebElement enterEmailElement= driver.findElement(enterEmail);
	enterEmailElement.clear();
	enterEmailElement.sendKeys("musa254@yahoo.com");
	}
	
	public void reEnteremail(){
		WebElement reinputEmailElement =driver.findElement(reinputEmail);
		reinputEmailElement.clear();
		reinputEmailElement.sendKeys("musa254@yahoo.com");
		
	}
	public void inputPassword(){
		WebElement enterPasswordElement=driver.findElement(enterPassword);
		enterPasswordElement.clear();
		enterPasswordElement.sendKeys("Apple123");
	}
	public void reEnterPassword(){
		WebElement confirmPasswordElement= driver.findElement(confirmPassword);
		confirmPasswordElement.clear();
		confirmPasswordElement.sendKeys("Apple123");
		
	}
	public void inputZip(){
		WebElement zipElement= driver.findElement(zip);
		zipElement.clear();
		zipElement.sendKeys("31313");
		
	}
	
	public void createAccountbutton(){
		WebElement createAccountbuttonElement=  driver.findElement(createAccountbutton);
		createAccountbuttonElement.click();
		
		//if(driver.getPageSource().contains("Sign Out")){
			//System.out.print("user signed up successfully");
			//}
			//else {
			//System.out.print("user is unable to sign up");
		
	}
	public void verifyUserCreatedAccount(){
		if(driver.findElement(logoutLink).getText().equalsIgnoreCase("Sign Out")) {
			System.out.print("user signed up successfully");
		}
		else {
			System.out.print("user is unable to sign up");
	}
	}
}



