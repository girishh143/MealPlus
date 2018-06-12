package K12PaymentCenter.pages;

import K12PaymentCenter.utils.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class SettingsPage {
    protected Map<String, String> xpaths;
    protected AndroidDriver driver;
    private MobileElement logoutButton;

    public SettingsPage(AndroidDriver driver){
        this.driver = driver;
        Yaml dashboardDataYaml = new Yaml();
        this.xpaths = (Map) dashboardDataYaml.load(this.getClass().getClassLoader().getResourceAsStream("settingsPage.yml"));
    }

    /**
     * Gets the Settings button
     *
     * @return MobileElement representing Settings button
     */
    public MobileElement getLogoutButton() {
        logoutButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_LOGOUT_BUTTON"), this.driver);
        return logoutButton;
    }
}