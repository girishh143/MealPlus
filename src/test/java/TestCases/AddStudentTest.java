package TestCases;

import K12PaymentCenter.BaseTest;
import K12PaymentCenter.pages.AddStudentPage;
import K12PaymentCenter.pages.DashboardPage;
import K12PaymentCenter.pages.SettingsPage;
import K12PaymentCenter.pages.StudentsPage;
import org.testng.annotations.Test;

public class AddStudentTest extends BaseTest {

    @Test(description = "Verify the User can add a verified Student.", groups = {"AddStudentGroup"}, priority = 0)
    public void testAddVerifiedStudent() throws InterruptedException {
        Login();

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getSettingsButton().click();

        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.getStudentsButton().click();

        StudentsPage studentsPage = new StudentsPage(driver);
        studentsPage.getAddStudentButton().click();

        AddStudentPage addStudentPage = new AddStudentPage(driver);
        addStudentPage.getLastNameTextbox().click();
        addStudentPage.getLastNameTextbox().sendKeys("AKIN");
        driver.hideKeyboard();

        addStudentPage.getStudentNumberTextbox().click();
        addStudentPage.getStudentNumberTextbox().sendKeys("605212");
        driver.hideKeyboard();

        addStudentPage.getSaveButton().click();
        addStudentPage.getAddStudentSuccessOkButton().click();


        dashboardPage.getSettingsButton().click();

//        SettingsPage settingsPage1 = new SettingsPage(driver);
//        settingsPage1.getLogoutButton().click();

        //studentsPage = new StudentsPage(driver);
        //studentsPage.getBackButton().click();

    }
}
