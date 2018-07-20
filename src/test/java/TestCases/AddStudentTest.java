package TestCases;

import K12PaymentCenter.BaseTest;
import K12PaymentCenter.pages.*;
import org.testng.annotations.Test;

public class AddStudentTest extends BaseTest {

    @Test(description = "Verify the User can Add a verified Student.", groups = {"AddStudentGroup"}, priority = 0)
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

        dashboardPage = new DashboardPage(driver);
        dashboardPage.getSettingsButton().click();

        Thread.sleep(10000);
        settingsPage = new SettingsPage(driver);
        settingsPage.getLogoutButton().click();
    }

    @Test(description = "Verify the User can Edit a verified Student.", groups = {"AddStudentGroup"}, priority = 0)
    public void testEditVerifiedStudent() throws InterruptedException {
        Login();

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getSettingsButton().click();

        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.getStudentsButton().click();

        StudentDashboardPage studentDashboardPage = new StudentDashboardPage(driver);
        studentDashboardPage.getEditStudentButton().click();


        String name = studentDashboardPage.getEditNameTextbox().getText();
        studentDashboardPage.getEditNameTextbox().click();
        studentDashboardPage.getEditNameTextbox().sendKeys(name);
        driver.hideKeyboard();

        String  number = studentDashboardPage.getEditNumberTextbox().getText();
        studentDashboardPage.getEditNumberTextbox().click();
        studentDashboardPage.getEditNumberTextbox().sendKeys(number);
        driver.hideKeyboard();

        studentDashboardPage.getSaveButton().click();

        AddStudentPage addStudentPage = new AddStudentPage(driver);
        addStudentPage.getSaveButton().click();
        addStudentPage.getAddStudentSuccessOkButton().click();

        dashboardPage = new DashboardPage(driver);
        dashboardPage.getSettingsButton().click();

        Thread.sleep(10000);
        settingsPage = new SettingsPage(driver);
        settingsPage.getLogoutButton().click();
    }
}
