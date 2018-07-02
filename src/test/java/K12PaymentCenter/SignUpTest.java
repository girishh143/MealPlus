package K12PaymentCenter;

import K12PaymentCenter.pages.LoginPage;
import K12PaymentCenter.pages.SignUpPage;
import org.apache.http.util.Asserts;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SignUpTest extends BaseTest {

    @Test(description = "Verify Sign Up", groups = {"signUp"})
    public void testSignUp() throws InterruptedException, IOException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        System.out.println("app launched");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getSignUpLink().click();
        System.out.println("on sign up page");

        SignUpPage signUpPage = new SignUpPage(driver);
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getStateDropdown()));
        signUpPage.getStateDropdown().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getStateName(2)));
        signUpPage.getStateName(2).click();
        signUpPage.getDoneButton().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getDistrictDropdown()));
        signUpPage.getDistrictDropdown().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getDistrictName(2)));
        signUpPage.getDistrictName(2).click();
        signUpPage.getDoneButton().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getNextButton()));

        signUpPage.getNextButton().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getFirstNameTextbox()));
        System.out.println("user details page");

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        signUpPage.getFirstNameTextbox().clear();
//        signUpPage.getFirstNameTextbox().sendKeys("Foo");
//        driver.hideKeyboard();
//
//        signUpPage.getLastNameTextbox().clear();
//        signUpPage.getLastNameTextbox().sendKeys("Bar");
//        driver.hideKeyboard();
//
//        signUpPage.getPhoneNumberTextbox().clear();
//        signUpPage.getPhoneNumberTextbox().sendKeys("9876543210");
//        driver.hideKeyboard();
//
//        signUpPage.getEmailTextbox().clear();
//        signUpPage.getEmailTextbox().sendKeys("foo@bar.com");
//        driver.hideKeyboard();
//
//        signUpPage.getNextButton().click();
//        System.out.println("username page");
//
//        wait.until(ExpectedConditions.visibilityOf(signUpPage.getUsernameTextbox()));
//
//        signUpPage.getUsernameTextbox().clear();
//        signUpPage.getUsernameTextbox().sendKeys("automation");
//        driver.hideKeyboard();
//
//        signUpPage.getPasswordTextbox().clear();
//        signUpPage.getPasswordTextbox().sendKeys("123456");
//        driver.hideKeyboard();
//
//        signUpPage.getConfirmPasswordTextbox().clear();
//        signUpPage.getConfirmPasswordTextbox().sendKeys("123456");
//        driver.hideKeyboard();
//
//        signUpPage.getSecurityQuestionDropDown().click();
//        wait.until(ExpectedConditions.visibilityOf(signUpPage.getSecurityQuestion()));
//        signUpPage.getSecurityQuestion().click();
//        signUpPage.getSecurityQuestion().click();
//        signUpPage.getDoneButton().click();
//        wait.until(ExpectedConditions.visibilityOf(signUpPage.getFinishButton()));
//
//        signUpPage.getAnswerTextbox().clear();
//        signUpPage.getAnswerTextbox().sendKeys("123456");
//        driver.hideKeyboard();
//
//        signUpPage.getAcceptTermsAndConditionsButton().click();
//        signUpPage.getFinishButton().click();
//// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        signUpPage.getFirstNameTextbox().sendKeys("Foo");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.hideKeyboard();
        driver.pressKeyCode(66);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        signUpPage.getLastNameTextbox().click();
//        Thread.sleep(3000);
        signUpPage.getLastNameTextbox().sendKeys("Bar");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Thread.sleep(3000);
//        signUpPage.getPhoneNumberTextbox().click();
        signUpPage.getPhoneNumberTextbox().sendKeys("9876543210");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Thread.sleep(3000);
//        driver.hideKeyboard();
        driver.pressKeyCode(66);
//        Thread.sleep(3000);
//        signUpPage.getEmailTextbox().click();
        signUpPage.getEmailTextbox().sendKeys("foo@bar.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        Thread.sleep(3000);
        driver.hideKeyboard();
//        driver.pressKeyCode(66);
//        Thread.sleep(3000);
        signUpPage.getNextButton().click();
//        Thread.sleep(10000);
        System.out.println("username page");

        wait.until(ExpectedConditions.visibilityOf(signUpPage.getUsernameTextbox()));
        signUpPage.getUsernameTextbox().sendKeys("automation");
//        Thread.sleep(3000);
//        driver.hideKeyboard();
        driver.pressKeyCode(66);
//        Thread.sleep(3000);
//        signUpPage.getPasswordTextbox().click();
        signUpPage.getPasswordTextbox().sendKeys("123456");
//        Thread.sleep(3000);
//        driver.hideKeyboard();
        driver.pressKeyCode(66);
//        Thread.sleep(3000);
//        signUpPage.getConfirmPasswordTextbox().click();
        signUpPage.getConfirmPasswordTextbox().sendKeys("123456");
//        Thread.sleep(3000);
        driver.hideKeyboard();
//        driver.pressKeyCode(66);
//        Thread.sleep(3000);
        signUpPage.getSecurityQuestionDropDown().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getSecurityQuestion()));
//        Thread.sleep(10000);
        signUpPage.getSecurityQuestion().click();
        signUpPage.getSecurityQuestion().click();
//        Thread.sleep(3000);
        signUpPage.getDoneButton().click();
//        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getFinishButton()));
//        signUpPage.getAnswerTextbox().click();
        signUpPage.getAnswerTextbox().sendKeys("123456");
        driver.hideKeyboard();
        signUpPage.getAcceptTermsAndConditionsButton().click();
//        Thread.sleep(3000);
        signUpPage.getFinishButton().click();
//        Thread.sleep(3000);
    }

    @Test(description = "Verify State and District selection", groups = {"signUp"})
    public void testStateDistrict() throws InterruptedException, IOException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        System.out.println("app launched");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getSignUpLink().click();
        System.out.println("on sign up page");

        SignUpPage signUpPage = new SignUpPage(driver);
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getStateDropdown()));
        signUpPage.getStateDropdown().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getStateName()));
        signUpPage.getStateName().click();
        signUpPage.getDoneButton().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getDistrictDropdown()));
        System.out.println("State is Selected");
        signUpPage.getDistrictDropdown().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getDistrictName()));
        signUpPage.getDistrictName().click();
        signUpPage.getDoneButton().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getNextButton()));
        Assert.assertNotEquals(signUpPage.districtDropdown.getText(), "District");
        System.out.println("District is selected");
    }

    @Test(description = "Verify Meals Account Features and the School Fee Features", groups = {"signUp"})
    public void testMealsAccountAndSchoolFeeFeatures() throws InterruptedException, IOException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        System.out.println("app launched");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getSignUpLink().click();
        System.out.println("on sign up page");

        SignUpPage signUpPage = new SignUpPage(driver);
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getStateDropdown()));
        signUpPage.getStateDropdown().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getStateName()));
        signUpPage.getStateName().click();
        signUpPage.getDoneButton().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getDistrictDropdown()));
        signUpPage.getDistrictDropdown().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getDistrictName()));
        signUpPage.getDistrictName().click();
        signUpPage.getDoneButton().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getNextButton()));
        Assert.assertNotEquals(signUpPage.districtDropdown.getText(), "District");

        String warningText = signUpPage.getFeeWarning().getText();
        String actualWarning = " School Fee Features are not enabled for Anson LZDB.  This district only accepts cafeteria payments through K12PaymentCenter at this time. ";
        Assert.assertEquals(actualWarning, warningText,"text should match");
    }
}