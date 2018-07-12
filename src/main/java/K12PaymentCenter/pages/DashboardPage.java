package K12PaymentCenter.pages;

import K12PaymentCenter.utils.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class DashboardPage {
    protected Map<String, String> xpaths;
    protected AndroidDriver driver;
    public MobileElement settingsButton;
    private MobileElement addPaymentSuccessMessage;
    private MobileElement addPaymentOkButton;
    public MobileElement backButton;
    private WebDriverWait wait;

    public DashboardPage(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 90);
        Yaml dashboardDataYaml = new Yaml();
        this.xpaths = (Map) dashboardDataYaml.load(this.getClass().getClassLoader().getResourceAsStream("locators/dashboardPage.yml"));
    }

    /**
     * Gets the Settings button
     *
     * @return MobileElement representing Settings button
     */
    public MobileElement getSettingsButton() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_SETTINGS_BUTTON"), this.driver)));
//        settingsButton = DriverHelper.getMobileElement(this.locators.get("BY_XPATH_SETTINGS_BUTTON"), this.driver);
        settingsButton = (MobileElement) (driver.findElements(By.className("android.widget.ImageView"))).get(2);
        return settingsButton;
    }
    public MobileElement getBackButton() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENT_BUTTON"), this.driver)));
        backButton = (MobileElement) (driver.findElements(By.className("android.widget.ImageView"))).get(0);
        return backButton;
    }
}

