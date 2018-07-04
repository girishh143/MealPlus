package TestCases;

import K12PaymentCenter.BaseTest;
import K12PaymentCenter.pages.DashboardPage;
import K12PaymentCenter.pages.SettingsPage;
import org.testng.annotations.Test;

public class AddStudent001 extends BaseTest {
    @Test(description = "Verify the User can add a verified Student.", groups = {"AddStudent"}, priority = 0)
    public void testAddVerifiedStudent() throws InterruptedException {
        Thread.sleep(5000);

        Login();
        Thread.sleep(5000);

        Login();

        Thread.sleep(10000);

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getSettingsButton().click();

        Thread.sleep(3000);






        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.getLogoutButton().click();
    }










}
