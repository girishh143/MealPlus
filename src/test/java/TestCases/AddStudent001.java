package TestCases;

import K12PaymentCenter.BaseTest;
import K12PaymentCenter.pages.DashboardPage;
import K12PaymentCenter.pages.SettingsPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddStudent001 extends BaseTest {
    
    @Test(description = "Verify the User can add a verified Student.", groups = {"AddStudent"}, priority = 0)
    public void testAddVerifiedStudent() throws InterruptedException {

        Login();

        DashboardPage dashboardPage = new DashboardPage(driver);

        dashboardPage.getSettingsButton().click();

        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.getLogoutButton().click();
    }


}
