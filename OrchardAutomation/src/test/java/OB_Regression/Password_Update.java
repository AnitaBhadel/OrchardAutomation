package OB_Regression;

//import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OB_PageObjects.HomePage;
import OB_PageObjects.change_Email_Password_page;
import OB_PageObjects.my_Account_page;

public class Password_Update {
	WebDriver driver;

	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PaneraRoom\\Desktop\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Test
	public void password_update() throws InterruptedException {
		driver.get("http://obc-apl-stg2.ms.frymulti.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		HomePage home=new HomePage(driver);
		home.signInLink();
		Thread.sleep(4000);
		
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("test@yahoo.com");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("apple123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		Thread.sleep(4000);
		
		my_Account_page accountPage= new my_Account_page(driver);
		accountPage.changeEmailPasswordLink();
		Thread.sleep(4000);
		
		change_Email_Password_page Password=new change_Email_Password_page(driver);
		Password.inputCurrerntPassword();
		Thread.sleep(5000);
		Password.inputNewpassword();
		Thread.sleep(5000);
		Password.reEnterNewPassword();
		Thread.sleep(5000);
		Password.updateMypasswordButton();
		Thread.sleep(5000);
		Password.verifypasswordUpdateMessagedisplayed();
		Thread.sleep(5000);
		
	}

}
