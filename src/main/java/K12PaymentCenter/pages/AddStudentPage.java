package K12PaymentCenter.pages;

import K12PaymentCenter.utils.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class AddStudentPage {

    protected Map<String, String> xpaths;
    protected AndroidDriver driver;
    private MobileElement getSaveButton;
    private MobileElement getLastNameTextbox;
    private MobileElement getStudentNumberTextbox;
    private MobileElement getAddStudentInfoMessage;
    private MobileElement getAddPictureIcon;
    private MobileElement addStudentSuccessMessage;
    private MobileElement addStudentSuccessOkButton;
    private WebDriverWait wait;


    public AddStudentPage(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 90);
        Yaml dashboardDataYaml = new Yaml();
        this.xpaths = (Map) dashboardDataYaml.load(this.getClass().getClassLoader().getResourceAsStream("locators/AddStudentPage.yml"));
    }

    public MobileElement getSaveButton() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_SAVE_BUTTON"), this.driver)));
        getSaveButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_SAVE_BUTTON"), this.driver);
        return getSaveButton;
    }

    public MobileElement getLastNameTextbox() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_STUDENTLASTNAME_TEXTBOX"), this.driver)));
        getLastNameTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_STUDENTLASTNAME_TEXTBOX"), this.driver);
        return getLastNameTextbox;
    }

    public MobileElement getStudentNumberTextbox() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_STUDENTNUMBER_TEXTBOX"), this.driver)));
        getStudentNumberTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_STUDENTNUMBER_TEXTBOX"), this.driver);
        return getStudentNumberTextbox;
    }

    public MobileElement getAddStudentInfoMessage() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENTINFO_MESSAGE"), this.driver)));
        getAddStudentInfoMessage = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENTINFO_MESSAGE"), this.driver);
        return getAddStudentInfoMessage;
    }

    public MobileElement getAddPictureIcon() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDPICTURE_ICON"), this.driver)));
        getAddPictureIcon = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDPICTURE_ICON"), this.driver);
        return getAddPictureIcon;
    }

    public MobileElement getAddStudentSuccessMessage() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENTSUCCESS_MESSAGE"), this.driver)));
        addStudentSuccessMessage = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENTSUCCESS_MESSAGE"), this.driver);
        return addStudentSuccessMessage;
    }

    public MobileElement getAddStudentSuccessOkButton() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENTSUCCESSOK_BUTTON"), this.driver)));
        addStudentSuccessOkButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENTSUCCESSOK_BUTTON"), this.driver);
        return addStudentSuccessOkButton;
    }



}
