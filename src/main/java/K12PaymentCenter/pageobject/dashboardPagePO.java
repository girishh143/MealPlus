package K12PaymentCenter.pageobject;

import K12PaymentCenter.pageelement.*;
import io.appium.java_client.android.AndroidDriver;

public class dashboardPagePO {
    private dashboardPagePE dashboardPagePE;
    protected AndroidDriver driver;

    public dashboardPagePO(AndroidDriver driver){
        this.driver=driver;
        this.dashboardPagePE = new dashboardPagePE(this.driver);
    }
}
