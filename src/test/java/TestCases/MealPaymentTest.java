package TestCases;
//package com.test;
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

import java.time.Duration;
import java.util.Map;

public class MealPaymentTest extends BaseTest {
    public Map<String, String> xpaths;
    public MobileElement settingsButton;

    @Test(description = "Verify the User can add Payment to the cart", groups = {"MealPayment"}, priority = 0)
    public void testAddPaymentToCart() throws InterruptedException {

        Login();

        MealPayment mealPayment = new MealPayment(driver);
       // WebDriverWait wait = new WebDriverWait(this.driver, 90);
        mealPayment.getAddButton().click();

        mealPayment.getAddAmountTextbox().sendKeys("10");
        driver.hideKeyboard();

        mealPayment.getAddToCartButton().click();
        mealPayment.getAddToCartButton().click();

        String warningText = mealPayment.getAddPaymentSuccessMessage().getText();
        String actualWarning = "Shopping cart has been updated";
        Assert.assertEquals(actualWarning, warningText, "text should match");

        mealPayment.getAddPaymentOkButton().click();

        driver.runAppInBackground(Duration.ofMillis(2));
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getSettingsButton().click();

        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.getLogoutButton().click();
    }

    @Test(description = "Verify the User can add d Payment which is in decimal to the cart", groups = {"MealPayment"}, priority = 1)
   public void testAddPaymentToCartDecimalValue() throws InterruptedException {
        Login();

        MealPayment mealPayment = new MealPayment(driver);
        mealPayment.getAddButton().click();
        mealPayment.getAddButton().click();

        mealPayment.getAddAmountTextbox().sendKeys("20.5");
        driver.hideKeyboard();

        mealPayment.getUpdateCartButton().click();
        mealPayment.getUpdateCartButton().click();

        String warningText = mealPayment.getAddPaymentSuccessMessage().getText();
        String actualWarning = "Shopping cart has been updated";
        Assert.assertEquals(actualWarning, warningText, "text should match");

        mealPayment.getAddPaymentOkButton().click();

        driver.runAppInBackground(Duration.ofMillis(2));
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getSettingsButton().click();

        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.getLogoutButton().click();
    }

    @Test(description = "Verify the User can add +$5 and +$10 to the amount using the options.", groups = {"MealPayment"}, priority = 2)
    public void testAddPaymentToCartUsingOptions() throws InterruptedException {
        Login();
        WebDriverWait wait = new WebDriverWait(this.driver, 90);
        MealPayment mealPayment = new MealPayment(driver);
        mealPayment.getAddButton().click();

        mealPayment.getAddAmountTextbox().sendKeys("30");
        driver.hideKeyboard();

        mealPayment.getAddAmount$5Button().click();
        mealPayment.getAddAmount$5Button().click();
        mealPayment.getAddAmount$10Button().click();
        mealPayment.getUpdateCartButton().click();

        String warningText = mealPayment.getAddPaymentSuccessMessage().getText();
        String actualWarning = "Shopping cart has been updated";
        Assert.assertEquals(actualWarning, warningText, "text should match");

        mealPayment.getAddPaymentOkButton().click();

        driver.runAppInBackground(Duration.ofMillis(2));
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getSettingsButton().click();

        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.getLogoutButton().click();
    }
}
