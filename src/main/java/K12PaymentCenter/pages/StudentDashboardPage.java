package K12PaymentCenter.pages;

import K12PaymentCenter.utils.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class StudentDashboardPage {
    protected Map<String, String> xpaths;
    protected AndroidDriver driver;
    private MobileElement editStudentButton;
    private MobileElement deleteStudentButton;
    private MobileElement addphotoicon;
    private MobileElement studentDashboardSettingsButton;
    public MobileElement studentDashboardBackButton;
    private WebDriverWait wait;
    private MobileElement editNumberTextbox;
    private MobileElement editNameTextbox;
    private MobileElement saveButton;
    private MobileElement addStudentButton;
    private MobileElement studentStatusText;
    private MobileElement studentStatusTextParent;

    public StudentDashboardPage(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 90);
        Yaml dashboardDataYaml = new Yaml();
        this.xpaths = (Map) dashboardDataYaml.load(this.getClass().getClassLoader().getResourceAsStream("locators/AddStudentPage.yml"));
    }

    public MobileElement getStudentDashboardSettingsButton() {
      //  studentDashboardSettingsButton = studentStatusTextParent.findElements(By.xpath("//*[@class='android.widget.ImageView']")).get(0);
       wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENT_BUTTON"), this.driver)));
    //   settingsButton = DriverHelper.getMobileElement(this.locators.get("BY_XPATH_SETTINGS_BUTTON"), this.driver);
       studentDashboardSettingsButton = (MobileElement) (driver.findElements(By.className("android.widget.ImageView"))).get(2);
        return studentDashboardSettingsButton;
    }
    public MobileElement getStudentDashboardBackButton() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENT_BUTTON"), this.driver)));
        studentDashboardBackButton = (MobileElement) (driver.findElements(By.className("android.widget.ImageView"))).get(0);
        return studentDashboardBackButton;
    }

    public MobileElement getStudentStatusTextParent() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_STUDENTSTATUS_TEXT"), this.driver)));
        // studentStatusText = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_STUDENTSTATUS_TEXT"), this.driver);
        studentStatusTextParent = (MobileElement) driver.findElement(By.xpath("//*[@text='Status']/.."));
        return studentStatusTextParent;
    }

    public MobileElement getEditStudentButton() {
        getStudentStatusTextParent();
        editStudentButton = studentStatusTextParent.findElements(By.xpath("//*[@class='android.widget.ImageView']")).get(0);
      //  wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENT_BUTTON"), this.driver)));
       // editStudentButton = (MobileElement) (driver.findElements(By.className("android.widget.ImageView"))).get(8);
        return editStudentButton;
    }
    public MobileElement getDeleteStudentButton() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENT_BUTTON"), this.driver)));
        deleteStudentButton = (MobileElement) (driver.findElements(By.className("android.widget.ImageView"))).get(9);
        return deleteStudentButton;
    }
    public MobileElement getAddphotoicon() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENT_BUTTON"), this.driver)));
        addphotoicon = (MobileElement) (driver.findElements(By.className("android.widget.ImageView"))).get(10);
        return addphotoicon;
    }
    public MobileElement getEditNameTextbox() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENT_BUTTON"), this.driver)));
        editNameTextbox = (MobileElement) (driver.findElements(By.className("android.widget.EditText"))).get(0);
        return editNameTextbox;
    }
    public MobileElement getEditNumberTextbox() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENT_BUTTON"), this.driver)));
        editNumberTextbox = (MobileElement) (driver.findElements(By.className("android.widget.EditText"))).get(1);
        return editNumberTextbox;
    }
    public MobileElement getSaveButton() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENT_BUTTON"), this.driver)));
        saveButton = (MobileElement) (driver.findElements(By.className("android.widget.TextView"))).get(9);
        return saveButton;
    }
    public MobileElement getAddStudentButton() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENT_BUTTON"), this.driver)));
        addStudentButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENT_BUTTON"), this.driver);
        return addStudentButton;
    }



}
