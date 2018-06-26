package K12PaymentCenter;

import K12PaymentCenter.pages.DashboardPage;
import K12PaymentCenter.pages.LoginPage;
import K12PaymentCenter.pages.SettingsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {

    @Test(description = "Forgot Password form", groups = {"login"}, priority = 1)
    public void testForgotPassword() throws InterruptedException {
       
        Thread.sleep(5000);

        // Login();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getGetHelpLink().click();
        Thread.sleep(5000);
        loginPage.getUsernameTextbox().sendKeys("judd1234");
        driver.hideKeyboard();
        Thread.sleep(10000);
        loginPage.getFindAccountButton().click();

        loginPage.getFindAccountButton().click();



    }
}
