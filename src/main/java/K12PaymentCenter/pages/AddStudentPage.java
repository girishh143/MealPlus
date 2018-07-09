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
    public MobileElement getSaveButton;
    public MobileElement getLastNameTextbox;
    public MobileElement getStudentNumberTextbox;
    public MobileElement getAddStudentInfoMessage;
    public MobileElement getAddPictureIcon;
    private MobileElement addStudentSuccessMessage;
    private MobileElement addStudentSuccessOkButton;

    public AddStudentPage(AndroidDriver driver){
        this.driver = driver;
        Yaml dashboardDataYaml = new Yaml();
        this.xpaths = (Map) dashboardDataYaml.load(this.getClass().getClassLoader().getResourceAsStream("locators/AddStudentPage.yml"));
    }

    public MobileElement getSaveButton() {
        WebDriverWait wait = new WebDriverWait(this.driver, 60);
        getSaveButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_SAVE_BUTTON"), this.driver);
        wait.until(ExpectedConditions.visibilityOf(getSaveButton));
        return getSaveButton;
    }

    public MobileElement getLastNameTextbox() {
        WebDriverWait wait = new WebDriverWait(this.driver, 60);
        getLastNameTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_STUDENTLASTNAME_TEXTBOX"), this.driver);
        wait.until(ExpectedConditions.visibilityOf(getLastNameTextbox));
        return getLastNameTextbox;
    }

    public MobileElement getStudentNumberTextbox() {
        WebDriverWait wait = new WebDriverWait(this.driver, 60);
        getStudentNumberTextbox = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_STUDENTNUMBER_TEXTBOX"), this.driver);
        wait.until(ExpectedConditions.visibilityOf(getStudentNumberTextbox));
        return getStudentNumberTextbox;
    }

    public MobileElement getAddStudentInfoMessage() {
        WebDriverWait wait = new WebDriverWait(this.driver, 60);
        getAddStudentInfoMessage = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENTINFO_MESSAGE"), this.driver);
        wait.until(ExpectedConditions.visibilityOf(getAddStudentInfoMessage));
        return getAddStudentInfoMessage;
    }

    public MobileElement getAddPictureIcon() {
        WebDriverWait wait = new WebDriverWait(this.driver, 60);
        getAddPictureIcon = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDPICTURE_ICON"), this.driver);
        wait.until(ExpectedConditions.visibilityOf(getAddPictureIcon));
        return getAddPictureIcon;
    }

    public MobileElement getAddStudentSuccessMessage() {
        WebDriverWait wait = new WebDriverWait(this.driver, 60);
        addStudentSuccessMessage = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENTSUCCESS_MESSAGE"), this.driver);
        wait.until(ExpectedConditions.visibilityOf(addStudentSuccessMessage));
        return addStudentSuccessMessage;
    }

    public MobileElement getAddStudentSuccessOkButton() {
        WebDriverWait wait = new WebDriverWait(this.driver, 60);
        addStudentSuccessOkButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENTSUCCESSOK_BUTTON"), this.driver);
        wait.until(ExpectedConditions.visibilityOf(addStudentSuccessOkButton));
        return addStudentSuccessOkButton;
    }

}
