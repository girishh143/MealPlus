package K12PaymentCenter;

import K12PaymentCenter.pages.DashboardPage;
import K12PaymentCenter.pages.LoginMainPage;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class LoginTest extends BaseTest {
    private static AndroidDriver driver;
//    public AndroidDriver driver;

    @Test(description = "Test Login", groups = {"login"})
    public void testLogin() throws Exception {
        LoginMainPage loginPage = LoginPageFactory.getLoginPage(this.driver);
        DashboardPage dashboardPage = loginPage.loginAs("judd_p1", "p1");
        Assert.assertTrue(dashboardPage.isLoaded(), "Not able to Login with proper credentials");


    }

    public static void main(String[] args) throws Exception {
//        LoginMainPage loginPage = LoginPageFactory.getLoginPage(driver);
        DashboardPage dashboardPage = LoginMainPage.loginAs("judd_p1", "p1");
        Assert.assertTrue(dashboardPage.isLoaded(), "Not able to Login with proper credentials");
    }
}
