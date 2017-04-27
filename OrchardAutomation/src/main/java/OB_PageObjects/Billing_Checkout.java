package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Billing_Checkout {
	WebDriver driver;
	By FirstName=By.id("firstName");
	By Lastname=By.id("lastName");
	By StreetAddress=By.id("address1");
	By City=By.id("city");
	By State=By.id("state");
	By Zip=By.id("zipCode");
	By Phone=By.id("phone");
	By Email=By.id("emailAddress");
	By ReenterEmail=By.id("reEnterEmailAddress");
	By continueButton=By.xpath("//input[@value='Continue']");
	By SuiteNumber=By.id("QAS_RefineText");
	By UpdateButton=By.xpath("//input[@value='Update']");
	By Edit_Item=By.linkText("Edit");
	By Remove_Item=By.linkText("Remove");
	By createAccountPassword=By.id("actualPassword");
	By createAccountVerifyPassword=By.id("verifyPassword");
	By signInUserName=By.id("userName");
	By signInUserpassword=By.id("password");
	By signInButton=By.id("jsAjaxSignIn");
	By useAddressAsEntered=By.xpath("//input[@value='Use Address As Entered']");
	
	public Billing_Checkout(WebDriver driver){
		this.driver=driver;
	}
	public void inputRegAddress() throws InterruptedException{
		WebElement firstNameElement=driver.findElement(FirstName);
		firstNameElement.clear();
		firstNameElement.sendKeys("Anita");
		Thread.sleep(6000);
		WebElement lastNameElement=driver.findElement(Lastname);
		lastNameElement.clear();
		lastNameElement.sendKeys("Acharya");
		Thread.sleep(6000);
		WebElement streetAddress_HawaiiElement=driver.findElement(StreetAddress);
		streetAddress_HawaiiElement.clear();
		streetAddress_HawaiiElement.sendKeys("740 south main st");
		Thread.sleep(6000);
		WebElement city_HawaiiElement=driver.findElement(City);
		city_HawaiiElement.clear();
		city_HawaiiElement.sendKeys("hinsville");
		Thread.sleep(6000);
		
		Select dropDownState=new Select(driver.findElement(State));
		dropDownState.selectByValue("GA");
		Thread.sleep(6000);
		
		WebElement zip_HawaiiElement=driver.findElement(Zip);
		zip_HawaiiElement.clear();
		zip_HawaiiElement.sendKeys("31313");
		Thread.sleep(6000);
		
		
		WebElement phoneElement=driver.findElement(Phone);
		phoneElement.clear();
		phoneElement.sendKeys("6464706680");
		Thread.sleep(6000);
		
		WebElement EmailElement=driver.findElement(Email);
		EmailElement.clear();
		EmailElement.sendKeys("anitaacharya123@yahoo.com");
		Thread.sleep(6000);
		
		WebElement reenterEmailElement=driver.findElement(ReenterEmail);
		reenterEmailElement.clear();
		reenterEmailElement.sendKeys("anitaacharya123@yahoo.com");
		Thread.sleep(6000);
	}
	
	
	
	public void signIn(){
		WebElement signInUserNameElement=driver.findElement(signInUserName);
		 signInUserNameElement.clear();
		 signInUserNameElement.sendKeys("anitaacharya123@yahoo.com");
		 WebElement signInUserpasswordElement=driver.findElement(signInUserpassword);
		 signInUserpasswordElement.clear();
		 signInUserpasswordElement.sendKeys("apple123");
		driver.findElement(signInButton).click();
	}
	
	public void inputHawaiiAddress() throws InterruptedException{
		WebElement firstNameElement=driver.findElement(FirstName);
		firstNameElement.clear();
		firstNameElement.sendKeys("Numesh");
		Thread.sleep(6000);
		WebElement lastNameElement=driver.findElement(Lastname);
		lastNameElement.clear();
		lastNameElement.sendKeys("Acharya");
		Thread.sleep(6000);
		WebElement streetAddress_HawaiiElement=driver.findElement(StreetAddress);
		streetAddress_HawaiiElement.clear();
		streetAddress_HawaiiElement.sendKeys("249 Lunalilo Home Rd");
		Thread.sleep(6000);
		WebElement city_HawaiiElement=driver.findElement(City);
		city_HawaiiElement.clear();
		city_HawaiiElement.sendKeys("Honolulu");
		Thread.sleep(6000);
		
		Select dropDownState=new Select(driver.findElement(State));
		dropDownState.selectByValue("HI");
		Thread.sleep(6000);
		
		WebElement zip_HawaiiElement=driver.findElement(Zip);
		zip_HawaiiElement.clear();
		zip_HawaiiElement.sendKeys("96825");
		Thread.sleep(6000);
		
		
		WebElement phoneElement=driver.findElement(Phone);
		phoneElement.clear();
		phoneElement.sendKeys("6464706680");
		Thread.sleep(6000);
		
		WebElement EmailElement=driver.findElement(Email);
		EmailElement.clear();
		EmailElement.sendKeys("anitaacharya123@yahoo.com");
		Thread.sleep(6000);
		
		WebElement reenterEmailElement=driver.findElement(ReenterEmail);
		reenterEmailElement.clear();
		reenterEmailElement.sendKeys("anitaacharya123@yahoo.com");
		Thread.sleep(6000);
		
		
	}
	
	public void inputAlaskaAddress() throws InterruptedException{
		WebElement firstNameElement=driver.findElement(FirstName);
		firstNameElement.clear();
		firstNameElement.sendKeys("Kalu");
		Thread.sleep(6000);
		WebElement lastNameElement=driver.findElement(Lastname);
		lastNameElement.clear();
		lastNameElement.sendKeys("Acharya");
		Thread.sleep(6000);
		WebElement streetAddress_HawaiiElement=driver.findElement(StreetAddress);
		streetAddress_HawaiiElement.clear();
		streetAddress_HawaiiElement.sendKeys("5530 East Northern Lights Boulevard");
		Thread.sleep(6000);
		WebElement city_HawaiiElement=driver.findElement(City);
		city_HawaiiElement.clear();
		city_HawaiiElement.sendKeys("Anchorage");
		Thread.sleep(6000);
		
		Select dropDownState=new Select(driver.findElement(State));
		dropDownState.selectByValue("AK");
		Thread.sleep(6000);
		
		WebElement zip_HawaiiElement=driver.findElement(Zip);
		zip_HawaiiElement.clear();
		zip_HawaiiElement.sendKeys("99504");
		Thread.sleep(6000);
		
		
		WebElement phoneElement=driver.findElement(Phone);
		phoneElement.clear();
		phoneElement.sendKeys("6464706680");
		Thread.sleep(6000);
		
		WebElement EmailElement=driver.findElement(Email);
		EmailElement.clear();
		EmailElement.sendKeys("anitaacharya123@yahoo.com");
		Thread.sleep(6000);
		
		WebElement reenterEmailElement=driver.findElement(ReenterEmail);
		reenterEmailElement.clear();
		reenterEmailElement.sendKeys("anitaacharya123@yahoo.com");
		Thread.sleep(6000);
		
		
		
	}
	
	public void shipItemTodifAdd_Hawaii() throws InterruptedException{
		WebElement firstNameElement=driver.findElement(FirstName);
		firstNameElement.clear();
		firstNameElement.sendKeys("Numesh");
		Thread.sleep(6000);
		WebElement lastNameElement=driver.findElement(Lastname);
		lastNameElement.clear();
		lastNameElement.sendKeys("Acharya");
		Thread.sleep(6000);
		WebElement streetAddress_HawaiiElement=driver.findElement(StreetAddress);
		streetAddress_HawaiiElement.clear();
		streetAddress_HawaiiElement.sendKeys("249 Lunalilo Home Rd");
		Thread.sleep(6000);
		WebElement city_HawaiiElement=driver.findElement(City);
		city_HawaiiElement.clear();
		city_HawaiiElement.sendKeys("Honolulu");
		Thread.sleep(6000);
		
		Select dropDownState=new Select(driver.findElement(State));
		dropDownState.selectByValue("HI");
		Thread.sleep(6000);
		
		WebElement zip_HawaiiElement=driver.findElement(Zip);
		zip_HawaiiElement.clear();
		zip_HawaiiElement.sendKeys("96825");
		Thread.sleep(6000);
		
		WebElement phoneElement=driver.findElement(Phone);
		phoneElement.clear();
		phoneElement.sendKeys("6464706680");
		Thread.sleep(6000);
	}

	public void editAddress_Hawaii() throws InterruptedException{
		WebElement firstNameElement=driver.findElement(FirstName);
		firstNameElement.clear();
		firstNameElement.sendKeys("Numesh");
		Thread.sleep(6000);
		WebElement lastNameElement=driver.findElement(Lastname);
		lastNameElement.clear();
		lastNameElement.sendKeys("Acharya");
		Thread.sleep(6000);
		WebElement streetAddress_HawaiiElement=driver.findElement(StreetAddress);
		streetAddress_HawaiiElement.clear();
		streetAddress_HawaiiElement.sendKeys("249 Lunalilo Home Rd");
		Thread.sleep(6000);
		WebElement city_HawaiiElement=driver.findElement(City);
		city_HawaiiElement.clear();
		city_HawaiiElement.sendKeys("Honolulu");
		Thread.sleep(6000);
		
		Select dropDownState=new Select(driver.findElement(State));
		dropDownState.selectByValue("HI");
		Thread.sleep(6000);
		
		WebElement zip_HawaiiElement=driver.findElement(Zip);
		zip_HawaiiElement.clear();
		zip_HawaiiElement.sendKeys("96825");
		Thread.sleep(6000);
		
		WebElement phoneElement=driver.findElement(Phone);
		phoneElement.clear();
		phoneElement.sendKeys("6464706680");
		Thread.sleep(6000);
	}
	public void editAddress_Alaska() throws InterruptedException{
		WebElement firstNameElement=driver.findElement(FirstName);
		firstNameElement.clear();
		firstNameElement.sendKeys("Kalu");
		Thread.sleep(6000);
		WebElement lastNameElement=driver.findElement(Lastname);
		lastNameElement.clear();
		lastNameElement.sendKeys("Acharya");
		Thread.sleep(6000);
		WebElement streetAddress_HawaiiElement=driver.findElement(StreetAddress);
		streetAddress_HawaiiElement.clear();
		streetAddress_HawaiiElement.sendKeys("5530 East Northern Lights Boulevard");
		Thread.sleep(6000);
		WebElement city_HawaiiElement=driver.findElement(City);
		city_HawaiiElement.clear();
		city_HawaiiElement.sendKeys("Anchorage");
		Thread.sleep(6000);
		
		Select dropDownState=new Select(driver.findElement(State));
		dropDownState.selectByValue("AK");
		Thread.sleep(6000);
		
		WebElement zip_HawaiiElement=driver.findElement(Zip);
		zip_HawaiiElement.clear();
		zip_HawaiiElement.sendKeys("99504");
		Thread.sleep(6000);
	}
		



	
	public void continueButton(){
		driver.findElement(continueButton).click();
	}
	
	public void inputSuiteNumber(){
		driver.findElement(SuiteNumber).sendKeys("2F");
	}
	
	public void selectUpdate(){
		driver.findElement(UpdateButton).click();
	}
	public void click_Edit_Item(){
		driver.findElement(Edit_Item).click();
	}
	
	public void click_Remove_Item(){
		driver.findElement(Remove_Item).click();
		
	}
	public void createAccount(){
		driver.findElement(createAccountPassword).sendKeys("apple123");
		driver.findElement(createAccountVerifyPassword).sendKeys("apple123");
	}
	public void useAddressAsEntered(){
		driver.findElement(useAddressAsEntered).click();
		 
	}
	public void inputGAAddress() throws InterruptedException{
		WebElement firstNameElement=driver.findElement(FirstName);
		firstNameElement.clear();
		firstNameElement.sendKeys("Kalu");
		Thread.sleep(6000);
		WebElement lastNameElement=driver.findElement(Lastname);
		lastNameElement.clear();
		lastNameElement.sendKeys("Acharya");
		Thread.sleep(6000);
		WebElement streetAddress_HawaiiElement=driver.findElement(StreetAddress);
		streetAddress_HawaiiElement.clear();
		streetAddress_HawaiiElement.sendKeys("740 south main St");
		Thread.sleep(6000);
		WebElement city_HawaiiElement=driver.findElement(City);
		city_HawaiiElement.clear();
		city_HawaiiElement.sendKeys("Hinesville");
		Thread.sleep(6000);
		
		Select dropDownState=new Select(driver.findElement(State));
		dropDownState.selectByValue("GA");
		Thread.sleep(6000);
		
		WebElement zip_HawaiiElement=driver.findElement(Zip);
		zip_HawaiiElement.clear();
		zip_HawaiiElement.sendKeys("31313");
		Thread.sleep(6000);
		
		
		WebElement phoneElement=driver.findElement(Phone);
		phoneElement.clear();
		phoneElement.sendKeys("6464706680");
		Thread.sleep(6000);
		
		WebElement EmailElement=driver.findElement(Email);
		EmailElement.clear();
		EmailElement.sendKeys("anitaacharya123@yahoo.com");
		Thread.sleep(6000);
		
		WebElement reenterEmailElement=driver.findElement(ReenterEmail);
		reenterEmailElement.clear();
		reenterEmailElement.sendKeys("anitaacharya123@yahoo.com");
		Thread.sleep(6000);
		
		
		
	}
	
	}
	


