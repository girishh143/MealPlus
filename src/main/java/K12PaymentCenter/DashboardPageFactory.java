package K12PaymentCenter;

import K12PaymentCenter.pages.DashboardPage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a dashboard page factory to create new dashboard page instance.
 */
public class DashboardPageFactory {

    // Store unique instances of pages and driver
    private static final Map<Map<String, Object>, DashboardPage> pages = new HashMap<>();

    // Added a private constructor to hide the implicit public one.
    private DashboardPageFactory() {
    }

    /**
     * Gets a dashboard page instance
     *
     * @param driver            WebDriver to be used for automation
     * @return An instance of
     */
    public static DashboardPage getDashboardPage(AndroidDriver driver) {


        MobileDriver remoteDriver = (MobileDriver) driver;
        Map<String, Object> uniqueID = remoteDriver.getSessionDetails();

        if (!pages.containsKey(remoteDriver.getSessionDetails()))
            pages.put(remoteDriver.getSessionDetails(), new DashboardPage(driver));

        return pages.get(remoteDriver.getSessionDetails());
    }
}
