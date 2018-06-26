package K12PaymentCenter.pages;

import K12PaymentCenter.utils.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class SignUpPage {
    protected Map<String, String> xpaths;
    protected AndroidDriver driver;
    private MobileElement stateDropdown;
    private MobileElement stateName;
    public MobileElement districtDropdown;
    private MobileElement districtName;
    private MobileElement doneButton;
    private MobileElement nextButton;
    private MobileElement connectWithFacebookButton;
    private MobileElement firstNameTextbox;
    private MobileElement lastNameTextbox;
    private MobileElement phoneNumberTextbox;
    private MobileElement emailTextbox;
    private MobileElement usernameTextbox;
    private MobileElement passwordTextbox;
    private MobileElement confirmPasswordTextbox;
    private MobileElement securityQuestionDropDown;
    private MobileElement answerTextbox;
    private MobileElement finishButton;
    private MobileElement securityQuestion;
    private MobileElement acceptTermsAndConditionsButton;
    private MobileElement answerTextboxParent;
    private MobileElement feeWarningTitle;
    private MobileElement feeWarningText;

    public SignUpPage(AndroidDriver driver) {
        this.driver = driver;
        Yaml dashboardDataYaml = new Yaml();
        this.xpaths = (Map) dashboardDataYaml.load(this.getClass().getClassLoader().getResourceAsStream("locators/signUpPage.yml"));
    }

    public MobileElement getStateDropdown() {
        stateDropdown = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_STATE_TEXTBOX"), this.driver);
        return stateDropdown;
    }

    public MobileElement getStateName() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf((MobileElement) (driver.findElement(By.xpath(("//*[@text='Alabama']"))))));
        stateName = (MobileElement) (driver.findElements(By.className("android.widget.TextView"))).get(2);
//        stateName = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_STATENAME"), this.driver);
        return stateName;
    }

    public MobileElement getDistrictDropdown() {
        districtDropdown = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_DISTRICT_TEXTBOX"), this.driver);
        return districtDropdown;
    }

    public MobileElement getDistrictName() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf((MobileElement) (driver.findElement(By.xpath(("//*[@text='Anson LZDB']"))))));
        districtName = (MobileElement) (driver.findElements(By.className("android.widget.TextView"))).get(2);
//        districtName = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_DISTRICT"), this.driver);
        return districtName;
    }

    public MobileElement getDoneButton() {
        doneButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_DONE_BUTTON"), this.driver);
        return doneButton;
    }

    public MobileElement getNextButton() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_NEXT_BUTTON"), this.driver)));
        nextButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_NEXT_BUTTON"), this.driver);
        return nextButton;
    }

    public MobileElement getConnectWithFacebookButton() {
        connectWithFacebookButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_CONNECTWITHFACEBOOK_BUTTON"), this.driver);
        return connectWithFacebookButton;
    }

    public MobileElement getFirstNameTextbox() {
        firstNameTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_FIRSTNAME_TEXTBOX"), this.driver);
        return firstNameTextbox;
    }

    public MobileElement getLastNameTextbox() {
        lastNameTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_LASTNAME_TEXTBOX"), this.driver);
        return lastNameTextbox;
    }

    public MobileElement getPhoneNumberTextbox() {
        phoneNumberTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_PHONENUMBER_TEXTBOX"), this.driver);
        return phoneNumberTextbox;
    }

    public MobileElement getEmailTextbox() {
        emailTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_EMAIL_TEXTBOX"), this.driver);
        return emailTextbox;
    }

    public MobileElement getUsernameTextbox() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_USERNAME_TEXTBOX"), this.driver)));
        usernameTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_USERNAME_TEXTBOX"), this.driver);
        return usernameTextbox;
    }

    public MobileElement getPasswordTextbox() {
        passwordTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_PASSWORD_TEXTBOX"), this.driver);
        return passwordTextbox;
    }

    public MobileElement getConfirmPasswordTextbox() {
        confirmPasswordTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_CONFIRMPASSWORD_TEXTBOX"), this.driver);
        return confirmPasswordTextbox;
    }

    public MobileElement getSecurityQuestionDropDown() {
        securityQuestionDropDown = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_SECURITYQUESTION_TEXTBOX"), this.driver);
        return securityQuestionDropDown;
    }

    public MobileElement getSecurityQuestion() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf((MobileElement) (driver.findElement(By.xpath(("//*[@text='What is the name of your best friend from Childhood']"))))));
        securityQuestion = (MobileElement) (driver.findElements(By.className("android.widget.TextView"))).get(3);
//        securityQuestion = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_DISTRICT"), this.driver);
        return securityQuestion;
    }

    public MobileElement getAnswerTextbox() {
        answerTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ANSWER_TEXTBOX"), this.driver);
        answerTextboxParent = (MobileElement) driver.findElement(By.xpath("//*[@text='Answer']/.."));
        return answerTextbox;
    }

    public MobileElement getAcceptTermsAndConditionsButton() {
        acceptTermsAndConditionsButton = answerTextboxParent.findElements(By.xpath("//*[@class='android.view.ViewGroup']")).get(2).findElement(By.xpath("//*[@class='android.widget.TextView']"));
//        acceptTermsAndConditionsButton = (MobileElement) driver.findElements(By.xpath("//*[@class='android.widget.TextView']")).get(2);
//        acceptTermsAndConditionsButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ACCEPT_BUTTON"), this.driver);
        return acceptTermsAndConditionsButton;
    }

    public MobileElement getFinishButton() {
        finishButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_FINISH_BUTTON"), this.driver);
        return finishButton;
    }

    public MobileElement getFeeWarning() {
        feeWarningTitle = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_FEEWARNINGTITLE"), this.driver);
        feeWarningText = feeWarningTitle.findElements(By.xpath("//*[@class='android.view.ViewGroup']")).get(1).findElements(By.xpath("//*[@class='android.widget.TextView']")).get(1);
        return feeWarningText;
    }
}
