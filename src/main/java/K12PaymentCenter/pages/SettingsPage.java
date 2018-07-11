package K12PaymentCenter.pages;

import K12PaymentCenter.utils.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class SettingsPage {
    protected Map<String, String> xpaths;
    protected AndroidDriver driver;
    public MobileElement logoutButton;
    public MobileElement StudentsButton;
    private WebDriverWait wait;

    public SettingsPage(AndroidDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 90);
        Yaml dashboardDataYaml = new Yaml();
        this.xpaths = (Map) dashboardDataYaml.load(this.getClass().getClassLoader().getResourceAsStream("locators/settingsPage.yml"));
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

    public MobileElement getStudentsButton() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_STUDENTS_BUTTON"), this.driver)));
        StudentsButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_STUDENTS_BUTTON"), this.driver);
        return StudentsButton;
    }

}
