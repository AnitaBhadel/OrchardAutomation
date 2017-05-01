
using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System.Threading.Tasks;
using System.Threading;
using OpenQA.Selenium.Support.UI;
using System.Linq;
using DemoProject.Pages;


namespace DemoProject.Tests
{
    [TestClass]
    public class RegistrationTest
    {
        IWebDriver driver;


        [TestInitialize]
        public void SetupTest()
        {
            driver = new ChromeDriver();
        }


        [TestMethod]
        public void RegistrationTest1()
        {
            driver.Navigate().GoToUrl("http://demoqa.com/registration/");
            RegistrationPage page = new RegistrationPage(driver);
            page.registerQAdemo();
            page.verifyErrorMessageIsNotDisplayed();
            page.verifySucessMessage();
        }

        [TestCleanup]
        public void Post()
        {
            try
            {

                Screenshot ss = ((ITakesScreenshot)driver).GetScreenshot();
                ss.SaveAsFile(@"Q:\\Screenshots\\Image.png", ScreenshotImageFormat.Png);
            }
        catch (Exception)
            {

            }
            finally
            {
                driver.Quit();
            }

        }
    }
}
