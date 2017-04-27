package OB_Regression;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import OB_PageObjects.Billing_Information_page;
import OB_PageObjects.HomePage;
import OB_PageObjects.SignIn_page;
import OB_PageObjects.my_Account_page;

public class CreditCard_AddEditremove {
	WebDriver driver;
	
	
	@Before 
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void CCAddEditRemove() throws InterruptedException{
		driver.get("http://obc-apl-stg2.ms.frymulti.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		HomePage home=new HomePage(driver);
		home.signInLink();
		Thread.sleep(4000);
		
		// instantiating SignIn_page
		SignIn_page signIn=new SignIn_page(driver);
		signIn.userName();
		Thread.sleep(1000);
		signIn.password();
		Thread.sleep(1000);
		signIn.signInButton();
		Thread.sleep(4000);
		
	
		my_Account_page Account=new my_Account_page(driver);
		Account.BillingInformationLink();
		Thread.sleep(4000);
		
		//adding CC
		Billing_Information_page billing=new Billing_Information_page(driver);
		billing.inputCCName();
		Thread.sleep(1000);
		billing.inputCC();
		Thread.sleep(1000);
		billing.dropdownMonth();
		Thread.sleep(1000);
		billing.dropdownYear();
		Thread.sleep(1000);
		billing.saveCCButton();
		billing.saveCCButton();
		Thread.sleep(1000);
		veriifyCCaddedmessage();
		Thread.sleep(4000);
		
		billing.updateCC();
		veriifyCCupdatededmessage();
		Thread.sleep(4000);
		
		billing.DeleteCC();
		Thread.sleep(4000);
		billing.dialogBox();
		Thread.sleep(4000);
		veriifyCCDeletedmessage();
		Thread.sleep(4000);
		
		
	}
	public void veriifyCCaddedmessage(){
		if(driver.getPageSource().contains("Your credit card was saved.")){
			System.out.print("credit card is added");
			}
			else {
				System.out.print("credit card is not added");
			}
		}
	public void veriifyCCupdatededmessage(){
		if(driver.getPageSource().contains("You successfully updated your credit card.")){
			System.out.print("\n credit card is updated");
			}
			else {
				System.out.print("\n credit card is not updated");
			}
		}
		
	public void veriifyCCDeletedmessage(){
		if(driver.getPageSource().contains("Your credit card was deleted.")){
			System.out.print("\n credit card is deleted");
			}
			else {
				System.out.print("\n credit card is not deleted");
			}
		}
		

}
