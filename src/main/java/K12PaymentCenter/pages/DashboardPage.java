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
    private MobileElement settingsButton;


    public DashboardPage(AndroidDriver driver) {
        this.driver = driver;
        Yaml dashboardDataYaml = new Yaml();
        this.xpaths = (Map) dashboardDataYaml.load(this.getClass().getClassLoader().getResourceAsStream("locators/dashboardPage.yml"));
    }

    /**
     * Gets the Settings button
     *
     * @return MobileElement representing Settings button
     */
    public MobileElement getSettingsButton() {
        WebDriverWait wait = new WebDriverWait(this.driver, 90);
        MobileElement mealsLink = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_MEALS_LINK"), this.driver);
        wait.until(ExpectedConditions.visibilityOf(mealsLink));
        MobileElement addButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADD_BUTTON"), this.driver);
        wait.until(ExpectedConditions.visibilityOf(addButton));
        wait.until(ExpectedConditions.visibilityOf((MobileElement) (driver.findElement(By.className("android.widget.ImageView")))));
//        settingsButton = DriverHelper.getMobileElement(this.locators.get("BY_XPATH_SETTINGS_BUTTON"), this.driver);
        settingsButton = (MobileElement) (driver.findElements(By.className("android.widget.ImageView"))).get(2);
        return settingsButton;
    }

}
