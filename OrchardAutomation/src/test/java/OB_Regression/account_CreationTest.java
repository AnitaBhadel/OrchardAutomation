package OB_Regression;

import java.io.File;


//import org.apache.commons.io.FileUtils;

//import static org.junit.Assert.*;

import org.junit.After;


import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OB_PageObjects.HomePage;
import OB_PageObjects.account_creation_page;

public class account_CreationTest {
	WebDriver driver;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}

	@Test
	public void Create_Account() throws InterruptedException {
		driver.get("https://orchard.blair.com/");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		
		HomePage home=new HomePage(driver);
		home.MyAccount();
		Thread.sleep(7000);
		
		account_creation_page createAccount=new account_creation_page(driver);
		createAccount.inputEmail();
		Thread.sleep(1000);
		createAccount.reEnteremail();
		Thread.sleep(1000);
		createAccount.inputPassword();
		Thread.sleep(1000);
		createAccount.reEnterPassword();
		Thread.sleep(1000);
		createAccount.inputZip();
		Thread.sleep(1000);
		createAccount.createAccountbutton();
		Thread.sleep(3000);
		createAccount.verifyUserCreatedAccount();
		Thread.sleep(3000);
	}
		
	

	
	 @After
		public void tearDown(){
			
			// taking screenshot using try and catch exception handling 
		//try{
			// File Src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			//FileUtils.copyFile(Src, new File("Q:\\Screenshots\\login.png"));
		//	System.out.println("Screenshot taken");
			//} 
			
		 //catch (Exception e) {
				//System.out.println("Exception while taking Screenshot");
			//}
			
		 //finally{
			driver.quit();
		 

}
}
//}
