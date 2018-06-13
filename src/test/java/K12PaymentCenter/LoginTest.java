package K12PaymentCenter;

import K12PaymentCenter.pages.DashboardPage;
import K12PaymentCenter.pages.LoginPage;
import K12PaymentCenter.pages.SettingsPage;
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

    public void Login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUsernameTextbox().sendKeys("judd_p1");
        loginPage.getPasswordTextbox().sendKeys("p1");
        loginPage.getSignInButton().click();
    }
}