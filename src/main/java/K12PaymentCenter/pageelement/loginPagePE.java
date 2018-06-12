package K12PaymentCenter.pageelement;

import K12PaymentCenter.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class loginPagePE {
    protected Map<String, String> xpaths;
    protected AndroidDriver driver;
    private MobileElement usernameTextbox;
    private MobileElement passwordTextbox;
    private MobileElement signInButton;

    public loginPagePE(AndroidDriver driver){
        this.driver = driver;
        Yaml loginDataYaml = new Yaml();
        this.xpaths = (Map) loginDataYaml.load(this.getClass().getClassLoader().getResourceAsStream("loginPage.yml"));
    }

    /**
     * Gets the Username textbox to enter values
     *
     * @return MobileElement representing Username textbox
     */
    public MobileElement getUsernameTextbox() {
        usernameTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_USERNAME_TEXTBOX"), this.driver);
        return usernameTextbox;
    }

    /**
     * Gets the Password textbox to enter values
     *
     * @return MobileElement representing Password textbox
     */
    public MobileElement getPasswordTextbox() {
        passwordTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_PASSWORD_TEXTBOX"), this.driver);
        return passwordTextbox;
    }

    /**
     * Gets sign in buttom MobileElement
     *
     * @return Sig in button MobileElement
     */
    public MobileElement getSignInButton() {
        signInButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_SIGNIN_BUTTON"), this.driver);
        return signInButton;
    }
}
