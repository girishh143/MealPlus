package K12PaymentCenter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private final static Logger logger = Logger.getLogger(BaseTest.class);
    protected AndroidDriver driver;

    @BeforeClass(alwaysRun = true)
    public AndroidDriver setDriver() throws MalformedURLException {
        File appDirAndroid = new File("src/main/resources/app/");
        File appAndroid = new File(appDirAndroid, "K12PaymentCenter.apk");

        DesiredCapabilities androidCapabilities = new DesiredCapabilities();
        androidCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        androidCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        androidCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        androidCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        androidCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "8.0");
        androidCapabilities.setCapability("appWaitActivity", "*");
        androidCapabilities.setCapability(MobileCapabilityType.APP, appAndroid.getAbsolutePath());

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), androidCapabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        return driver;
    }


    /**
     * Shut down the instance of the web driver and the login factory,
     * also log out from IQ. The AfterClass Annotation and it has a property
     * that activate a flag to run always.
     *
     * @throws Exception TODO: Change the type of Exception to a more specific
     */
    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        // Destroy the browser instance at the end of each test. (Recommended)
        logger.info("************TEAR DOWN*************");

        if (driver != null) {
            driver.quit();
            driver = null;
            logger.info("Driver was closed successfully");
        } else {
            logger.info("Driver is already null");
        }
    }
}
