package K12PaymentCenter;

import K12PaymentCenter.pages.LoginPage;
import K12PaymentCenter.pages.SignUpPage;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    @Test(description = "Verify Sign Up", groups = {"signUp"})
    public void testSignUp() throws InterruptedException {
        System.out.println("app launched");
        Thread.sleep(5000);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getSignUpLink().click();
        System.out.println("on sign up page");

        Thread.sleep(3000);

        SignUpPage signUpPage=new SignUpPage(driver);
        signUpPage.getStateDropdown().click();
        Thread.sleep(10000);
        signUpPage.getStateName().click();
        Thread.sleep(3000);
        signUpPage.getDoneButton().click();
        Thread.sleep(3000);

        signUpPage.getDistrictDropdown().click();
        Thread.sleep(10000);
        signUpPage.getDistrictName().click();
        Thread.sleep(3000);
        signUpPage.getDoneButton().click();
        Thread.sleep(3000);

        signUpPage.getNextButton().click();
        Thread.sleep(10000);
        System.out.println("user details page");

        signUpPage.getFirstNameTextbox().sendKeys("Foo");
        driver.hideKeyboard();
        Thread.sleep(3000);
        signUpPage.getLastNameTextbox().sendKeys("Bar");
        driver.hideKeyboard();
        Thread.sleep(3000);
        signUpPage.getPhoneNumberTextbox().sendKeys("9876543210");
        Thread.sleep(3000);
        driver.hideKeyboard();
        Thread.sleep(3000);
        signUpPage.getEmailTextbox().sendKeys("foo@bar.com");
        Thread.sleep(3000);
        driver.hideKeyboard();
        Thread.sleep(3000);
        signUpPage.getNextButton().click();
        Thread.sleep(10000);
        System.out.println("username page");

        signUpPage.getUsernameTextbox().sendKeys("automation");
        Thread.sleep(3000);
        driver.hideKeyboard();
        Thread.sleep(3000);
        signUpPage.getPasswordTextbox().sendKeys("p1");
        Thread.sleep(3000);
        driver.hideKeyboard();
        Thread.sleep(3000);
        signUpPage.getConfirmPasswordTextbox().sendKeys("p1");
        Thread.sleep(3000);
        driver.hideKeyboard();
        Thread.sleep(3000);
        signUpPage.getSecurityQuestionDropDown().click();
        Thread.sleep(10000);
        signUpPage.getSecurityQuestion().click();
        Thread.sleep(3000);
        signUpPage.getDoneButton().click();
        Thread.sleep(3000);
        signUpPage.getAnswerTextbox().sendKeys("p1");
        driver.hideKeyboard();
        signUpPage.getAcceptTermsAndConditionsButton().click();
        Thread.sleep(3000);
        signUpPage.getFinishButton().click();
        Thread.sleep(3000);



    }
}