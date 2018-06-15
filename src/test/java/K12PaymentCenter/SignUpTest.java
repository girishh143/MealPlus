package K12PaymentCenter;

import K12PaymentCenter.pages.LoginPage;
import K12PaymentCenter.pages.SignUpPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;

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
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getStateName()));
        signUpPage.getStateName().click();
        signUpPage.getDoneButton().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getDistrictDropdown()));
        signUpPage.getDistrictDropdown().click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.getDistrictName()));
        signUpPage.getDistrictName().click();
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
//        driver.hideKeyboard();
        driver.pressKeyCode(66);
//        signUpPage.getLastNameTextbox().click();
//        Thread.sleep(3000);
        signUpPage.getLastNameTextbox().sendKeys("Bar");
//        driver.hideKeyboard();
        driver.pressKeyCode(66);
//        Thread.sleep(3000);
//        signUpPage.getPhoneNumberTextbox().click();
        signUpPage.getPhoneNumberTextbox().sendKeys("9876543210");
//        Thread.sleep(3000);
//        driver.hideKeyboard();
        driver.pressKeyCode(66);
//        Thread.sleep(3000);
//        signUpPage.getEmailTextbox().click();
        signUpPage.getEmailTextbox().sendKeys("foo@bar.com");
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
}