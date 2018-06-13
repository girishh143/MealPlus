package K12PaymentCenter;

import K12PaymentCenter.pages.DashboardPage;
import K12PaymentCenter.pages.LoginPage;
import K12PaymentCenter.pages.SettingsPage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


  @Test
    public void test() throws InterruptedException {
        Thread.sleep(5000);

        Login();

        Thread.sleep(10000);

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getSettingsButton().click();

        Thread.sleep(3000);

        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.getLogoutButton().click();
    }

    @Test(description = "Verify Login with Invalid Credentials", groups = {"login"})
    public void testLoginWithInvalidCredentials() throws InterruptedException {
        Thread.sleep(5000);

        // Login();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUsernameTextbox().sendKeys("ABCD");
        loginPage.getPasswordTextbox().sendKeys("123");
        loginPage.getSignInButton().click();

        loginPage.getInvalidUserNamePasswordButton().click();

    }

    @Test(description = "Verify Login with Blank Credentials", groups = {"login"})
    public void testLoginWithBlankCredentials() throws InterruptedException {
        Thread.sleep(5000);

        // Login();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUsernameTextbox().sendKeys("");
        loginPage.getPasswordTextbox().sendKeys("");
        loginPage.getSignInButton().click();

        loginPage.getInvalidUserNamePasswordButton().click();

    }


}