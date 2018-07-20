package K12PaymentCenter.pages;

import K12PaymentCenter.utils.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.Yaml;

import java.util.Collections;
import java.util.Map;

public class MealPayment {
    protected Map<String, String> xpaths;
    protected AndroidDriver driver;
    private MobileElement addButton;
    private MobileElement addAmountTextbox;
    private MobileElement addToCartButton;
    private MobileElement addPaymentSuccessMessage;
    private MobileElement addPaymentOkButton;
    private WebDriverWait wait;
    private MobileElement addAmount$5Button;
    private MobileElement addAmount$10Button;
    private MobileElement settingsButton;
    private MobileElement updateCartButton;

    public MealPayment(AndroidDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(this.driver, 90);
        Yaml mealPaymentYML = new Yaml();
        this.xpaths = (Map) mealPaymentYML.load(this.getClass().getClassLoader().getResourceAsStream("locators/MealPayment.yml"));

    }

    public MobileElement getAddButton(){
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADD_BUTTON"), this.driver)));
        addButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADD_BUTTON"), this.driver);
        return addButton;
    }

    public MobileElement getAddAmountTextbox(){
        addAmountTextbox=DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDAMOUNT_TEXTBOX"),this.driver);
        return addAmountTextbox;

    }

    public MobileElement getAddToCartButton(){
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDTOCART_BUTTON"),this.driver)));
        addToCartButton=DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDTOCART_BUTTON"),this.driver);
        return addToCartButton;
    }

    public MobileElement getAddPaymentSuccessMessage(){
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDPAYMENT_SUCCESSMESSAGE"),this.driver)));
        addPaymentSuccessMessage=DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDPAYMENT_SUCCESSMESSAGE"),this.driver);
        return addPaymentSuccessMessage;
    }

    public MobileElement getAddPaymentOkButton(){
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDPAYMENT_SUCCESSOKBUTTON"),this.driver)));
        addPaymentOkButton=DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDPAYMENT_SUCCESSOKBUTTON"),this.driver);
        return addPaymentOkButton;
    }

    public MobileElement getAddAmount$5Button(){
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDAMOUNT_$5BUTTON"),this.driver)));
        addAmount$5Button=DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDAMOUNT_$5BUTTON"),this.driver);
        return addAmount$5Button;
    }

    public MobileElement getAddAmount$10Button(){
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDAMOUNT_$10BUTTON"),this.driver)));
        addAmount$10Button=DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDAMOUNT_$10BUTTON"),this.driver);
        return addAmount$10Button;
    }

    public MobileElement getSettingsButton() {
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADD_BUTTON"), this.driver)));
//        settingsButton = DriverHelper.getMobileElement(this.locators.get("BY_XPATH_SETTINGS_BUTTON"), this.driver);
        settingsButton = (MobileElement) (driver.findElements(By.className("android.widget.ImageView"))).get(2);
        return settingsButton;
    }

    public MobileElement getUpdateCartButton(){
        wait.until(ExpectedConditions.visibilityOf(DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_UPDATECART_BUTTON"),this.driver)));
        updateCartButton=DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_UPDATECART_BUTTON"),this.driver);
        return updateCartButton;
    }
}
