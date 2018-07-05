package TestCases;

import K12PaymentCenter.BaseTest;
import K12PaymentCenter.pages.DashboardPage;
import K12PaymentCenter.pages.SettingsPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.Map;

public class MealPaymentTest extends BaseTest{
    public Map<String, String> xpaths;
    public MobileElement settingsButton;

    @Test(description = "Verify the User can add Payment to the cart", groups = {"MealPayment"}, priority = 0)
    public void testAddPaymentToCart() throws InterruptedException {
        Login();
        DashboardPage dashboardPage = new DashboardPage(driver);
        WebDriverWait wait = new WebDriverWait(this.driver, 90);
        wait.until(ExpectedConditions.visibilityOf(dashboardPage.getAddButton()));
        dashboardPage.getAddButton().click();

        dashboardPage.getAddAmountTextbox().sendKeys("10");
        driver.hideKeyboard();
        Thread.sleep(5000);

        dashboardPage.getAddToCartButton().click();

    }
}
