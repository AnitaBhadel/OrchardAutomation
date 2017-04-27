package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Billing_Information_page {
	WebDriver driver;
	
	By firstName=By.id("firstName");
	By lastName=By.id("lastName");
	By streetAddess=By.id("address1");
	By city=By.id("city");
	By State=By.id("state");
	By phone=By.id("phone");
	By updateBillingAddressBtn=By.xpath("//input[@value='Update Billing Address']");
	By ccName=By.id("ccName");
	By ccNumber =By.id("ccNumber");
	By ccExpMonth=By.id("creditCardExpiration");
	By ccExpYear= By.name("ccYear");
	By saveCCButton=By.xpath("//input[@value='Save Credit Card']");
	By updateCC_Name=By.id("ccName1");
	By updateCC_Number=By.id("ccNumber1");
	By updateCC_ExpMonth=By.id("creditCardExpiration1");
	By updateCC_ExpYear=By.name("ccYear");
	By updateCC_Button=By.xpath("//input[@value='Update Credit Card']");
	By deleteCC=By.xpath("//*[@id='use-per-saved-cc-wrap']/form[2]/div/p/a");
	By deleteCC_dialogBox=By.xpath("//input[@value='Yes, Delete Card']");

	
	public Billing_Information_page(WebDriver driver){
		this.driver=driver;
	}
	
	public void inpuFirstName(){
		WebElement firstNameElement=driver.findElement(firstName);
		firstNameElement.clear();
		firstNameElement.sendKeys("Anita");
	}
	public void inputLastName(){
		WebElement lastNameElement= driver.findElement(lastName);
		lastNameElement.clear();
		lastNameElement.sendKeys("Acharya");
	}
	public void inputStreetAddess(){
		WebElement streetAddessElement= driver.findElement(streetAddess);
		streetAddessElement.clear();
		streetAddessElement.sendKeys("750 South main Street");
    }
	
	public void inputCity(){
		WebElement cityElement= driver.findElement(city);
		cityElement.clear();
		cityElement.sendKeys("Savannah");
	}
	public void StateDropDown(){
		Select state_dropdown=new Select(driver.findElement(State));
		state_dropdown.selectByValue("GA");
	}
	
	public void inputPhone(){
		WebElement phoneElement=driver.findElement(phone);
		phoneElement.clear();
		phoneElement.sendKeys("6464706689");
	}
	
	public void updateBillingAddressBtn(){
		driver.findElement(updateBillingAddressBtn).click();
	}
	
	public void verifyBillingUpdatedMessage(){
		 
			 if(driver.getPageSource().contains("You successfully updated your billing address.")){
					System.out.print("billing updated");
					}
					else {
						System.out.print("billing is not updated");
					} 
			 
		 }
	
	public void inputCCName(){
	 WebElement ccNameElement=driver.findElement(ccName);
	 ccNameElement.clear();
	 ccNameElement.sendKeys("Anita");
	}
	 public void inputCC(){
		WebElement ccNumberElement=driver.findElement(ccNumber);
		ccNumberElement.clear();
		ccNumberElement.sendKeys("4111111111111111");
	 }
	 
	 public void dropdownMonth(){
	 Select month=new Select(driver.findElement(ccExpMonth));
	 month.selectByValue("12");
	 }
	 
	 public void dropdownYear(){
	WebElement year=driver.findElements(ccExpYear).get(1);
	 Select YO=new Select(year);
	 YO.selectByValue("2018");
	 }
	 
	 public void saveCCButton(){
	driver.findElement(saveCCButton).click();
	}
	 
	 public void updateCC() throws InterruptedException{
		WebElement updateCC_NameElement= driver.findElement(updateCC_Name);
		updateCC_NameElement.clear();
		updateCC_NameElement.sendKeys("Anita");
		 Thread.sleep(4000);
		 
		 WebElement updateCC_NumberElement=driver.findElement(updateCC_Number);
		 updateCC_NumberElement.clear();
		 updateCC_NumberElement.sendKeys("4444333322221111");
		 Thread.sleep(4000);
		 
		 Select month=new Select(driver.findElement(updateCC_ExpMonth));
		 month.selectByValue("10");
		 Thread.sleep(4000);
		 
		 WebElement year=driver.findElements(updateCC_ExpYear).get(0);
		 Select YO=new Select(year);
		 YO.selectByValue("2019");
		 Thread.sleep(4000);
		
		 driver.findElements(updateCC_Button).get(0).click();
		 Thread.sleep(4000);
		   
	 }
	 
	 public void DeleteCC(){
	
		 driver.findElement(deleteCC).click();
	 }
	 
	 public void dialogBox(){
		 
		 driver.findElement(deleteCC_dialogBox).click();
	 }
	
	 
}







