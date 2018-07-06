package K12PaymentCenter.pages;

import K12PaymentCenter.utils.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class StudentsPage {

    protected Map<String, String> xpaths;
    protected AndroidDriver driver;
    private MobileElement addStudentButton;

    public StudentsPage(AndroidDriver driver){
        this.driver = driver;
        Yaml dashboardDataYaml = new Yaml();
        this.xpaths = (Map) dashboardDataYaml.load(this.getClass().getClassLoader().getResourceAsStream("locators/StudentsPage.yml"));
    }

    public MobileElement getAddStudentButton() {
        WebDriverWait wait = new WebDriverWait(this.driver, 60);
        addStudentButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDSTUDENTS_BUTTON"), this.driver);
        wait.until(ExpectedConditions.visibilityOf(addStudentButton));
        return addStudentButton;


    }

}
