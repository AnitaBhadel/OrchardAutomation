package OB_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Shipping_Checkout_page {
	WebDriver driver;
	By addGCBoxAndMessageLink=By.className("jsAddGifting");
	By pontedressGiftbox=By.xpath("//div[@id='productList']/div/input");
	By inputGiftMessage=By.name("giftMessage1");
	By doNotDisplayPriceCheckBox=By.id("excludePricesInPackingSlip");
	By saveButton=By.xpath("//input[@value='Save']");
	By continueButton=By.xpath("//input[@value='Continue']");
	By shipItemToMultipleAddressRadio=By.id("multiple_addresses");
	By shippingOptionsDropdown=By.id("selectCarrierCode");
	By editShippingAddress=By.linkText("edit");
	By differentAddress_radio=By.id("different_address");
	By GiftMessage=By.className("giftMessageData");
		
	
	public Shipping_Checkout_page(WebDriver driver){
		this.driver=driver;
	}
	public void addGiftMessage() throws InterruptedException{
		driver.findElement(addGCBoxAndMessageLink).click();
		Thread.sleep(3000);
        driver.findElement(pontedressGiftbox).click();
        Thread.sleep(3000);
       
        WebElement inputGiftMessageElement=driver.findElement(inputGiftMessage);
        inputGiftMessageElement.clear();
        Thread.sleep(3000);
        inputGiftMessageElement.sendKeys("You are the best");
        Thread.sleep(3000);
        driver.findElement(doNotDisplayPriceCheckBox).click();
        Thread.sleep(3000);
        driver.findElement(saveButton).click();
	}
	
	public void ContinueButton(){
		driver.findElement(continueButton).click();
	}
	
	public void shipItemToMultipleAddress(){
		driver.findElement(shipItemToMultipleAddressRadio).click();
	}
	
	public void shipItemTodifferntAddress(){
	driver.findElement(differentAddress_radio).click();
	}
	
	public void standardShipping(){
		Select standard=new Select(driver.findElement(shippingOptionsDropdown));
		standard.selectByValue("70");
	}
	public void threeDaysShipping(){
		Select standard=new Select(driver.findElement(shippingOptionsDropdown));
		standard.selectByValue("74");
	}
	public void twoDaysShipping(){
		Select standard=new Select(driver.findElement(shippingOptionsDropdown));
		standard.selectByValue("77");
	}
	public void nextBusinessDay(){
		Select standard=new Select(driver.findElement(shippingOptionsDropdown));
		standard.selectByValue("72");
		
	}
	public void editShippingAddress(){
		driver.findElement(editShippingAddress).click();
	}
	public void checkgiftMessagePresent(){
		
		 if(driver.findElements(GiftMessage).size() != 0){
			 System.out.println("\n gift message is added");
			 }else{
			 System.out.println("\n gift message is not added");
			 }
	}
		
		
	public void verifyShippingOptions_HI_AK() throws InterruptedException{
		
		Select EstimateShipping=new Select(driver.findElement(shippingOptionsDropdown));
		
		// verify HI and AK Shipping option is enabled and selected 
		 System.out.println("AK and HI Standard Shipping selected\t" + EstimateShipping.getOptions().get(4).isSelected());
		 Thread.sleep(6000);
		
		 //verify Next day shipping is disabled for HI and AK
		 System.out.println("Next dayshiiping is disabled?\t"+EstimateShipping.getOptions().get(3).getAttribute("disabled"));
		 Thread.sleep(6000);
		
		 //validate 2 days shipping is disabled 
		 System.out.println("2Dayshipping is disabled?\t" + EstimateShipping.getOptions().get(2).getAttribute("disabled"));
		 Thread.sleep(6000);
		 
		 //verify 3 day shipping is disabled for HI and AK
		 System.out.println("3Dayshipping is disabled?\t" +EstimateShipping.getOptions().get(1).getAttribute("disabled"));
		 Thread.sleep(6000);
		 
		 //verify Standard shipping is disabled for HI and AK
		 System.out.println("Standard Shipping disabled?\t"+ EstimateShipping.getOptions().get(0).getAttribute("disabled"));
		 Thread.sleep(6000);
			 
	}
	

	

}
