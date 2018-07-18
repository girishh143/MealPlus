package TestCases;

import K12PaymentCenter.BaseTest;
import K12PaymentCenter.pages.DashboardPage;
import K12PaymentCenter.pages.MealPayment;
import K12PaymentCenter.pages.SettingsPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class MealPaymentTest extends BaseTest {
    public Map<String, String> xpaths;
    public MobileElement settingsButton;

    @Test(description = "Verify the User can add Payment to the cart", groups = {"MealPayment"}, priority = 0)
    public void testAddPaymentToCart() throws InterruptedException {

        Login();

        MealPayment mealPayment = new MealPayment(driver);
        WebDriverWait wait = new WebDriverWait(this.driver, 90);
        mealPayment.getAddButton().click();

        mealPayment.getAddAmountTextbox().sendKeys("10");
        driver.hideKeyboard();

        mealPayment.getAddToCartButton().click();
        mealPayment.getAddToCartButton().click();

        String warningText = mealPayment.getAddPaymentSuccessMessage().getText();
        String actualWarning = "Shopping cart has been updated";
        Assert.assertEquals(actualWarning, warningText, "text should match");

        mealPayment.getAddPaymentOkButton().click();

        //     wait.until(ExpectedConditions.visibilityOf(mealPayment.getAddButton()));
       // mealPayment.getAddButton().click();


    }

   /* @Test(description = "Verify the User can add d Payment which is in decimal to the cart", groups = {"MealPayment"}, priority = 1)
   public void testAddPaymentToCartDecimalValue() throws InterruptedException {
        Login();
        // DashboardPage dashboardPage = new DashboardPage(driver);
        MealPayment mealPayment = new MealPayment(driver);
        WebDriverWait wait = new WebDriverWait(this.driver, 90);
        wait.until(ExpectedConditions.visibilityOf(mealPayment.getAddButton()));
        mealPayment.getAddButton().click();

        mealPayment.getAddAmountTextbox().sendKeys("20.5");
        driver.hideKeyboard();
        //   Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOf(mealPayment.getAddToCartButton()));

        mealPayment.getAddToCartButton().click();
        mealPayment.getAddToCartButton().click();

        wait.until(ExpectedConditions.visibilityOf(mealPayment.getAddPaymentSuccessMessage()));
        String warningText = mealPayment.getAddPaymentSuccessMessage().getText();
        String actualWarning = "Shopping cart has been updated";
        Assert.assertEquals(actualWarning, warningText, "text should match");

        wait.until(ExpectedConditions.visibilityOf(mealPayment.getAddPaymentOkButton()));
        mealPayment.getAddPaymentOkButton().click();


    }*/
}
