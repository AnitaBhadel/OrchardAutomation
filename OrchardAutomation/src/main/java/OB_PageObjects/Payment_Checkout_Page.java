package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Payment_Checkout_Page {
	WebDriver driver;
	By ccRadioButton=By.id("creditCardRadio");
	By ccNameInput=By.id("ccName");
	By ccNumberInput=By.id("ccNumber");
	By ccMonth=By.id("ccMonth");
	By ccYear=By.id("ccYear");
	By continueButton=By.xpath("//input[@value='Continue']");
	By inputSecurityCode=By.id("ccSecurityCode");
	
	
	
	public Payment_Checkout_Page(WebDriver driver){
		this.driver=driver;
		
	}
	public void visa_radio_button(){
		driver.findElement(ccRadioButton).click();
	}
	public void inputNameInCard(){
		WebElement ccNameInputElement=driver.findElement(ccNameInput);
		ccNameInputElement.clear();
		ccNameInputElement.sendKeys("Anita");
	}
	public void inputCreditCard(){
		WebElement ccNumberInputElement=driver.findElement(ccNumberInput);
		 ccNumberInputElement.sendKeys("4444333322221111");
		 }
	public void selectMonth(){
		Select monthDropdown=new Select(driver.findElement(ccMonth));
		monthDropdown.selectByValue("12");
		}
	public void selectYear(){
		Select yearDropdown=new Select(driver.findElement(ccYear));
		yearDropdown.selectByValue("2018");
	}
	public void ContinueButton(){
		driver.findElement(continueButton).click();
	}
	public void inputSecurityCode(){
		driver.findElement(inputSecurityCode).sendKeys("321");
	}
}
