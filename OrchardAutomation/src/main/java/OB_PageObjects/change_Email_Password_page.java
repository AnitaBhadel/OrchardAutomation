package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class change_Email_Password_page {
	WebDriver driver;
	By currentPassword=By.id("currentPassword");
	By newPassword=By.id("newPassword");
	By verifyPassword= By.id("verifyPassword");
	By UpdatePasswordButton=By.xpath("//input[@value='Update My Password']");
	
	public change_Email_Password_page(WebDriver driver){
		this.driver=driver;
	}
	public void inputCurrerntPassword(){
		WebElement currentPasswordElement=driver.findElement(currentPassword);
		currentPasswordElement.clear();
		currentPasswordElement.sendKeys("apple123");
	}
	public void inputNewpassword(){
		WebElement newPasswordElement=driver.findElement(newPassword);
		 newPasswordElement.clear();
		 newPasswordElement.sendKeys("apple1234");
	}
	public void reEnterNewPassword(){
		WebElement verifyPasswordElement=driver.findElement( verifyPassword);
		verifyPasswordElement.clear();
		verifyPasswordElement.sendKeys("apple1234");
		
	}
	public void updateMypasswordButton(){
		WebElement UpdatePasswordButtonElement= driver.findElement(UpdatePasswordButton);
		UpdatePasswordButtonElement.click();
	}
	
	public void verifypasswordUpdateMessagedisplayed(){
		 if(driver.getPageSource().contains("You successfully updated your password")){
				System.out.print("password updated");
				}
				else {
					System.out.print("password is not updated");
				} 
}
}
