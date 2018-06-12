package K12PaymentCenter.pageobject;

import K12PaymentCenter.pageelement.loginPagePE;
import io.appium.java_client.android.AndroidDriver;

public class loginPagePO {
    private loginPagePE loginPagePE;
    protected AndroidDriver driver;

    public loginPagePO(AndroidDriver driver){
        this.driver=driver;
        this.loginPagePE = new loginPagePE(this.driver);
    }
}
