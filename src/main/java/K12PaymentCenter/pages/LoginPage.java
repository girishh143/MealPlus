package K12PaymentCenter.pages;

import K12PaymentCenter.utils.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class LoginPage {
    protected Map<String, String> xpaths;
    protected AndroidDriver driver;
    private MobileElement usernameTextbox;
    private MobileElement passwordTextbox;
    private MobileElement signInButton;
    private MobileElement getHelpLink;
    private MobileElement findAccountButton;
    private MobileElement getInstructionsLink;
    private MobileElement emailAddressTextbox;
    private MobileElement sendInstructionsButton;
    private MobileElement signUpLink;

    public LoginPage(AndroidDriver driver) {
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

    public MobileElement getGetHelpLink() {
        getHelpLink = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_GETHELP_LINK"), this.driver);
        return getHelpLink;
    }

    public MobileElement getFindAccountButton() {
        findAccountButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_FINDACCOUNT_BUTTON"), this.driver);
        return findAccountButton;
    }

    public MobileElement getGetInstructionsLink() {
        getInstructionsLink = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_GETINSTRUCTIONSTORESET_LINK"), this.driver);
        return getInstructionsLink;
    }

    public MobileElement getEmailAddressTextbox() {
        emailAddressTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_EMAILADDRESS_TEXTBOX"), this.driver);
        return emailAddressTextbox;
    }

    public MobileElement getSendInstructionsButton() {
        sendInstructionsButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_SENDINSTRUCTIONS_BUTTON"), this.driver);
        return sendInstructionsButton;
    }

    public MobileElement getConnectWithFacebookButton() {
        sendInstructionsButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_CONNECTWITHFACEBOOK_BUTTON"), this.driver);
        return sendInstructionsButton;
    }

    public MobileElement getSignUpLink() {
        signUpLink = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_SIGNUP_LINK"), this.driver);
        return signUpLink;
    }
}