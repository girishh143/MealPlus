package TestCases;

import K12PaymentCenter.BaseTest;
import K12PaymentCenter.pages.DashboardPage;
import K12PaymentCenter.pages.SettingsPage;
import K12PaymentCenter.pages.StudentsPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.Map;

public class AddStudent001 extends BaseTest {
    public Map<String, String> xpaths;
    public MobileElement settingsButton;

    @Test(description = "Verify the User can add a verified Student.", groups = {"AddStudent"}, priority = 0)
    public void testAddVerifiedStudent() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(this.driver, 60);
        Login();

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getSettingsButton().click();

        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.getStudentsButton().click();

        StudentsPage studentsPage = new StudentsPage(driver);
        wait.until(ExpectedConditions.visibilityOf(studentsPage.getAddStudentButton()));
        studentsPage.getAddStudentButton().click();
        studentsPage.getAddStudentButton().click();


       // settingsPage.getLogoutButton().click();
    }
}
