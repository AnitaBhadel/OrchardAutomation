package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddressBook_Page {
	WebDriver driver;
	
	By FirstName=By.id("firstName");
	By Lastname=By.id("lastName");
	By StreetAddress=By.id("address1");
	By City=By.id("city");
	By State=By.id("state");
	By Zip=By.id("zipCode");
	By Phone=By.id("phone");
	By saveAddressButton=By.xpath("//input[@value='Save Address to My Address Book']");
	By inputApartmentno=By.id("QAS_RefineText");
	By clickUpdatedButton=By.id("QAS_RefineBtn");
	By EditButton=By.cssSelector("#use-add-wrap > div.use-add-item-list > div:nth-child(2) > div > a.obutton.pie");
	By saveAddressToMyAddressBookButton=By.xpath("//input[@value='Save Address to My Address Book']");
	By useAddressAsEntered=By.id("QAS_AcceptOriginal");
	By deleteButton=By.cssSelector("#use-add-wrap > div.use-add-item-list > div > div > a.linkButton.osecButton.pie.openAjaxLayer");
	By deletediologBox=By.xpath("//input[@value='Yes, Delete Address']");
	
	public AddressBook_Page(WebDriver driver){
		this.driver=driver;
	}
	public void inputFirstName(){
		driver.findElement(FirstName).sendKeys("Anita");
	}
	public void inputLastName(){
		driver.findElement(Lastname).sendKeys("bhqadel");
		
	}
	public void inputStreet(){
		 driver.findElement(StreetAddress).sendKeys("740 south main st, 2F ");
	}
	public void inputCity(){
		driver.findElement(City).sendKeys("Hinesville");
		
	}
	public void stateDropdown(){
		WebElement mySelectState = driver.findElement(State);
		Select dropdown = new Select(mySelectState);
		dropdown.selectByValue("GA");
		}
	public void selectZip(){
		driver.findElement(Zip).sendKeys("31313");
	}
	public void inputPhone(){
		driver.findElement(Phone).sendKeys("6464706680");
	}
	public void saveAddressButton(){
		driver.findElement(saveAddressButton).click();
		
	}
	public void inputApartmentno(){
		driver.findElement(inputApartmentno).sendKeys("2F");
	}
	public void clickUpdatedButton(){
		driver.findElement(clickUpdatedButton).click();
	}
	
	public void updateShippingAddress() throws InterruptedException{
		driver.findElement(EditButton).click();
		Thread.sleep(5000);
		driver.findElement(StreetAddress).clear();
		Thread.sleep(5000);
		driver.findElement(StreetAddress).sendKeys("790 south main St");
		Thread.sleep(5000);
		driver.findElement(saveAddressToMyAddressBookButton).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("QAS_RefineText")).sendKeys("2G");
		
		driver.findElement(useAddressAsEntered).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("QAS_RefineBtn")).click();
		//Thread.sleep(5000);
		
	}
	
	public void deleteShippingAddress() throws InterruptedException{
		driver.findElement(deleteButton).click();
		Thread.sleep(5000);
		driver.findElement(deletediologBox).click();
		Thread.sleep(5000);
	}
	
}













