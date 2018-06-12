package K12PaymentCenter.pages;

import K12PaymentCenter.DashboardPageFactory;
import K12PaymentCenter.pageelement.loginPagePE;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;

public class LoginMainPage {
    public static   AndroidDriver driver;
    protected static Logger logger;

    /**
     * Creates new instance of login main page
     *
     * @param driver Selenium web driver to be used for automation
     */
    public LoginMainPage(AndroidDriver driver) {
        this.driver = driver;
    }

    /**
     * Login to IQ using a user name and password
     *
     * @param user     User email
     * @param password User password
     * @return A new instance of dashboard main page
     * @throws Exception Exception
     */
    public static DashboardPage loginAs(String user, String password) throws Exception {
        try {
            loginPagePE pe = new loginPagePE(driver);
            pe.getUsernameTextbox().clear();
            pe.getUsernameTextbox().sendKeys(user);
            pe.getPasswordTextbox().clear();
            pe.getPasswordTextbox().sendKeys(password);
            pe.getSignInButton().click();
            DashboardPage dashboard = DashboardPageFactory.getDashboardPage(driver);
            return dashboard.isLoaded() ? dashboard : null;
        } catch (Exception exception) {
            logger.error("Cannot login to MealsPlus" + exception);
            return null;
        }
    }

    /**
     * Blank Login to check Sign in button
     *
     * @User email/blank value
     * @User password/blank value
     * @return Status of Sign in button
     * @throws Exception Exception
     */
    public boolean loginAsBlank() {
        loginPagePE pe = new loginPagePE(driver);
        pe.getUsernameTextbox().clear();
        pe.getUsernameTextbox().sendKeys("");
        pe.getPasswordTextbox().clear();
        pe.getPasswordTextbox().sendKeys("");
        return pe.getSignInButton().isEnabled();
    }

//    /**
//     * Clicks forgot password link
//     *
//     * @return new instance of forgot password page if the button was clicked successfully, otherwise null
//     */
//    public ForgotPasswordPage clickForgotPassword() {
//        try {
//            getForgotLink().click();
//            return new ForgotPasswordPage(this.driver);
//        } catch (Exception exception) {
//            logger.error("Cannot click Get Help: " + exception);
//            return null;
//        }
//    }
}

