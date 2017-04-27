using System;
using OpenQA.Selenium;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Chrome;
using System.Threading.Tasks;
using System.Threading;
using OpenQA.Selenium.Support.UI;


namespace DemoProject
{
    [TestClass]
    public class UnitTest1
    {

        private IWebDriver driver;



        [TestInitialize]
        public void SetupTest()
        {

            string path = Environment.GetEnvironmentVariable("chromedriver");
            driver = new ChromeDriver(path);




        }
        [TestMethod]
        public void Demo()
        {
            driver.Navigate().GoToUrl("http://demoqa.com/registration/");
            //driver.Manage().Window.Maximize();
          

            Thread.Sleep(3000);
            driver.FindElement(By.Id("name_3_firstname")).SendKeys("Anita");
            Thread.Sleep(3000);
            driver.FindElement(By.Id("name_3_lastname")).SendKeys("Bhadel");
            Thread.Sleep(3000);
            driver.FindElement(By.XPath("//input[@value='married']")).Click();
            Thread.Sleep(3000);
            driver.FindElement(By.XPath("//input[@value='dance']")).Click();
            Thread.Sleep(3000);
            SelectElement dropdown = new SelectElement(driver.FindElement(By.Id("dropdown_7")));
            dropdown.SelectByText("Nepal");
            Thread.Sleep(1000);

            SelectElement month = new SelectElement(driver.FindElement(By.Id("mm_date_8")));
            month.SelectByIndex(10);
            SelectElement day = new SelectElement(driver.FindElement(By.Id("dd_date_8")));
            day.SelectByIndex(10);
            SelectElement year = new SelectElement(driver.FindElement(By.Id("yy_date_8")));
            year.SelectByValue("2013");
            driver.FindElement(By.Id("phone_9")).SendKeys("6464706680");
            Thread.Sleep(3000);
            driver.FindElement(By.Id("username")).SendKeys("abhade26");
            Thread.Sleep(3000);
            driver.FindElement(By.Id("email_1")).SendKeys("anitaacharya26@yahoo.com");
            Thread.Sleep(3000);


            driver.FindElement(By.Id("description")).SendKeys("description");
            Thread.Sleep(3000);
            driver.FindElement(By.Id("password_2")).SendKeys("description");
            Thread.Sleep(3000);
            driver.FindElement(By.Id("confirm_password_password_2")).SendKeys("description");
            Thread.Sleep(3000);
            driver.FindElement(By.XPath("//input[@value='Submit']")).Click();
            Thread.Sleep(3000);

           //positive Assertion
            try
            {
                Assert.IsTrue(driver.FindElement(By.ClassName("piereg_message")).Displayed);
                Console.Write("Registration completed: className present");
            }
            catch (Exception e)
            {
                Console.Write(e);
            }
            //positive Assertion
            String text = "Thank you for your registration";
            Assert.IsTrue(driver.FindElement(By.ClassName("piereg_message")).Text.Equals(text));
                 Console.Write("Thank you for your registration is displayed") ;

            

            //negative Assertion
            string a = driver.FindElement(By.Id("name_3_firstname")).Text;
            string b = "Heather";
            Assert.IsTrue(a == b);






        }
    }
}

        

    
