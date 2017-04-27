package OB_Regression;

import org.junit.After;



//import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OB_PageObjects.HomePage;
import OB_PageObjects.SignIn_page;

public class Sign_InTest {
	WebDriver driver;

	
	@Before 
	public void setup(){
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
}
	
	@Test
	public void sign_In() throws InterruptedException {
		driver.get("http://obc-apl-stg2.ms.frymulti.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		HomePage home=new HomePage(driver);
		home.signInLink();
		Thread.sleep(4000);
		
		// instantiating SignIn_page
		SignIn_page signIn=new SignIn_page(driver);
		signIn.userName();
		Thread.sleep(4000);
		signIn.password();
		Thread.sleep(4000);
		signIn.signInButton();
		Thread.sleep(4000);
	}
	
	 
	 @After
		public void tearDown(){
			
			// taking screenshot using try and catch exception handling 
		/* try{
			 File Src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(Src, new File("Q:\\Screenshots\\login.png"));
			System.out.println("Screenshot taken");
			} 
			
		 catch (Exception e) {
				System.out.println("Exception while taking Screenshot");
			}
			
		 finally{*/	
			driver.quit();
		 // }
	

}
}
