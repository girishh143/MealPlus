package K12PaymentCenter;

import K12PaymentCenter.pages.LoginMainPage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import java.util.HashMap;
import java.util.Map;

public class LoginPageFactory {

    // Store unique instances of pages and driver
    private static final Map<Map<String, Object>, LoginMainPage> pages = new HashMap<>();

    // Added a private constructor to hide the implicit public one.
    private LoginPageFactory() {
    }

    /**
     * Gets a login page instance
     *
     * @param driver MobileDriver instance to be use for automation
     * @return An instance of LoginMainPage
     */
    public static LoginMainPage getLoginPage(AndroidDriver driver) {
        MobileDriver remoteDriver = (MobileDriver) driver;

        if (!pages.containsKey(remoteDriver.getSessionDetails()))
            pages.put(remoteDriver.getSessionDetails(), new LoginMainPage(driver));

        return pages.get(remoteDriver.getSessionDetails());
    }
}
