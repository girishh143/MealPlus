package K12PaymentCenter.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class DashboardPage {
    protected Map<String, String> xpaths;
    protected AndroidDriver driver;
    private MobileElement settingsButton;

    public DashboardPage(AndroidDriver driver){
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
//        settingsButton = DriverHelper.getMobileElement(this.locators.get("BY_XPATH_SETTINGS_BUTTON"), this.driver);
        MobileElement settingsButton = (MobileElement) (driver.findElements(By.className("android.widget.ImageView"))).get(2);
        return settingsButton;
    }
}
