package K12PaymentCenter.pages;

import K12PaymentCenter.utils.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.Yaml;

import java.security.PrivateKey;
import java.util.Map;

public class ForgotPassword {
    protected AndroidDriver driver;

    private MobileElement usernameTextbox;
    private MobileElement passwordTextbox;
    private MobileElement signInButton;
    private Map<String, String> xpaths;

    public ForgotPassword(AndroidDriver driver) {
        this.driver = driver;
        Yaml loginDataYaml = new Yaml();
        this.xpaths = (Map) loginDataYaml.load(this.getClass().getClassLoader().getResourceAsStream("locators/loginPage.yml"));
    }

    public MobileElement getUsernameTextbox() {
        usernameTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_USERNAME_TEXTBOX"), this.driver);
        return usernameTextbox;
    }


}
