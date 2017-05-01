using System;
using OpenQA.Selenium;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Chrome;
using System.Threading.Tasks;
using System.Threading;
using OpenQA.Selenium.Support.UI;
namespace DemoProject.Pages
{
    class RegistrationPage
    {
        IWebDriver driver;

        By firstName = By.Id("name_3_firstname");
        By LastName = By.Id("name_3_lastname");
        By martialStatus = By.XPath("//input[@value='married']");
        By hobby = By.XPath("//input[@value='dance']");
        By country = By.Id("dropdown_7");
        By month = By.Id("mm_date_8");
        By Day = By.Id("dd_date_8");
        By year = By.Id("yy_date_8");
        By phone = By.Id("phone_9");
        By username = By.Id("username");
        By email = By.Id("email_1");
        By description = By.Id("description");
        By password = By.Id("password_2");
        By confirmPassword=By.Id("confirm_password_password_2");
        By submitButton= By.XPath("//input[@value='Submit']");


        public RegistrationPage(IWebDriver driver)
        {
            this.driver = driver;
        }

        public void registerQAdemo()
        {
            driver.FindElement(firstName).SendKeys("Anita");
            driver.FindElement(LastName).SendKeys("Acharya");
            driver.FindElement(martialStatus).Click();
            driver.FindElement(hobby).Click();
            SelectElement countryDropdown = new SelectElement(driver.FindElement(country));
            countryDropdown.SelectByText("Nepal");
            SelectElement monthDropdown = new SelectElement(driver.FindElement(month));
            monthDropdown.SelectByIndex(10);

            SelectElement DayDropdown = new SelectElement(driver.FindElement(Day));
            DayDropdown.SelectByIndex(10);


            SelectElement yearDropdown = new SelectElement(driver.FindElement(year));
            yearDropdown.SelectByValue("2013");
            driver.FindElement(phone).SendKeys("6464706680");
            driver.FindElement(username).SendKeys("abhade1990");
            driver.FindElement(email).SendKeys("aacharya889@yahoo.com");
            driver.FindElement(description).SendKeys("hello");
            driver.FindElement(password).SendKeys("description");
            driver.FindElement(confirmPassword).SendKeys("description");

            driver.FindElement(submitButton).Click();
            Thread.Sleep(1000);
}
        public void verifySucessMessage()
        {
            try
            {
                String text = "Thank you for your registration";
                Assert.IsTrue(driver.FindElement(By.ClassName("piereg_message")).Text.Equals(text));
                Console.Write("Thank you for your registration is displayed");
            }
            catch (Exception e)
            {
                Console.Write(e);
            }
        }


        public void verifyErrorMessageIsNotDisplayed()// to verify error message is not showing when valid username and email is entered
        {
            string errortext1 = " Username already exists";
            string errortext2 = " Email already exists";

            if ((driver.PageSource.Contains(errortext1)) || (driver.PageSource.Contains(errortext2)))
            {
                Console.Write("error message displayed when registration");

            }
            else
            {
                Console.Write("error message is not displayed when registration");
            }


        }
    }
    }

