package K12PaymentCenter;

import K12PaymentCenter.pages.DashboardPage;
import K12PaymentCenter.pages.LoginPage;
import K12PaymentCenter.pages.SettingsPage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test(description = "Verify Login with Valid Credentials", groups = {"login"}, priority = 0)
    public void testLoginWithValidCredentials() throws InterruptedException {
        Thread.sleep(5000);

        Login();

        Thread.sleep(10000);

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getSettingsButton().click();

        Thread.sleep(3000);

        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.getLogoutButton().click();
    }

    @Test(description = "Verify Login with Invalid Credentials", groups = {"login"}, priority = 1)
    public void testLoginWithInvalidCredentials() throws InterruptedException {
        Thread.sleep(5000);

        // Login();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUsernameTextbox().sendKeys("ABCD");
        loginPage.getPasswordTextbox().sendKeys("123");
        loginPage.getSignInButton().click();

        loginPage.getInvalidUserNamePasswordButton().click();

    }

    @Test(description = "Verify Login with Blank Credentials", groups = {"login"}, priority = 2)
    public void testLoginWithBlankCredentials() throws InterruptedException {
        Thread.sleep(5000);

        // Login();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUsernameTextbox().sendKeys("");
        loginPage.getPasswordTextbox().sendKeys("");
        loginPage.getSignInButton().click();

        loginPage.getInvalidUserNamePasswordButton().click();

    }

    @Test(description = "Verify Login with Invalid Facebook Credentials", groups = {"login"}, priority = 3)
    public void testLoginWithInvalidFacebookCredentials() throws InterruptedException {
        Thread.sleep(5000);

        // Login();
        LoginPage loginPage = new LoginPage(driver);

        loginPage.getConnectWithFacebookButton().click();
        loginPage.getFacebookUserName().sendKeys("abcd");
        loginPage.getFacebookPassword().sendKeys("1234");
        driver.hideKeyboard();

        Thread.sleep(10000);
        loginPage.getFacebookLoginButton().click();

    }

    @Test(description = "Verify Login with Blank Facebook Credentials", groups = {"login"}, priority = 4)
    public void testLoginWithBlankFacebookCredentials() throws InterruptedException {
        Thread.sleep(5000);

        // Login();
        LoginPage loginPage = new LoginPage(driver);

        loginPage.getConnectWithFacebookButton().click();
        loginPage.getFacebookUserName().sendKeys("");
        loginPage.getFacebookPassword().sendKeys("");
        driver.hideKeyboard();

        Thread.sleep(10000);
        loginPage.getFacebookLoginButton().click();

    }


    @Test(description = "Verify Login with Valid Facebook Credentials", groups = {"login"}, priority = 4)
    public void testLoginWithValidFacebookCredentials() throws InterruptedException {
        Thread.sleep(5000);

        // Login();
        LoginPage loginPage = new LoginPage(driver);

        loginPage.getConnectWithFacebookButton().click();
        loginPage.getFacebookUserName().sendKeys("8668456899");
        loginPage.getFacebookPassword().sendKeys("Mealsplus@123");
        driver.hideKeyboard();

        Thread.sleep(10000);
        loginPage.getFacebookLoginButton().click();

    }


}