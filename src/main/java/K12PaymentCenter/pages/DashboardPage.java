package K12PaymentCenter.pages;

import K12PaymentCenter.BasePage;
import K12PaymentCenter.pageelement.dashboardPagePE;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DashboardPage implements BasePage {
    AndroidDriver driver;
    protected static Logger logger;
    private dashboardPagePE dashboardPagePE;

    public DashboardPage(AndroidDriver driver) {
        this.driver=driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Driver implicit waits set to 10 seconds Dashboard");
        this.dashboardPagePE = new dashboardPagePE(this.driver);
    }


    @Override
    public boolean isLoaded() throws IOException, InterruptedException {
        return false;
    }
}
