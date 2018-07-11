package K12PaymentCenter.pages;

import K12PaymentCenter.utils.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class StudentsPage {

    private WebDriverWait wait;
    protected Map<String, String> xpaths;
    protected AndroidDriver driver;
    private MobileElement addStudentButton;
    private MobileElement backButton;

    public StudentsPage(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 90);
        Yaml dashboardDataYaml = new Yaml();
        this.xpaths = (Map) dashboardDataYaml.load(this.getClass().getClassLoader().getResourceAsStream("locators/StudentsPage.yml"));
    }

    public MobileElement getAddStudentButton() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENT_BUTTON"), this.driver)));
        addStudentButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENT_BUTTON"), this.driver);
        return addStudentButton;
    }

    public MobileElement getBackButton() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENT_BUTTON"), this.driver)));
        backButton = (MobileElement) (driver.findElements(By.className("android.widget.ImageView"))).get(0);
        return backButton;
    }

}
