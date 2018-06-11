package amazon;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class StartApplication {

    private static AndroidDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        File appDirAndroid = new File("src/main/resources/app/");
        File appAndroid = new File(appDirAndroid, "K12PaymentCenter.apk");

        DesiredCapabilities androidCapabilities = new DesiredCapabilities();
        androidCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        androidCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
//        androidCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Sony Xperia Z3");
        androidCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        androidCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        androidCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "8.0");
        androidCapabilities.setCapability("appWaitActivity", "*");
        androidCapabilities.setCapability(MobileCapabilityType.APP, appAndroid.getAbsolutePath());

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), androidCapabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
//        Thread.sleep(10000);
//        driver.quit();

//        MobileElement usernameText = (MobileElement) (driver.findElements(By.className("android.widget.EditText"))).get(0);

        MobileElement usernameText = (MobileElement) (driver.findElement(By.xpath("//*[@text='Username']")));
        usernameText.sendKeys("judd_p1");
        driver.hideKeyboard();

        MobileElement passwordText = (MobileElement) (driver.findElement(By.xpath("//*[@text='Password']")));
        passwordText.sendKeys("p1");
        driver.hideKeyboard();

        MobileElement signInButton = (MobileElement) (driver.findElement(By.xpath("//*[@text=' Sign In ']")));
        signInButton.click();
        Thread.sleep(10000);

        MobileElement settingsButton = (MobileElement) (driver.findElements(By.className("android.widget.ImageView"))).get(2);
        settingsButton.click();
        Thread.sleep(3000);

        MobileElement logOutButton = (MobileElement) (driver.findElements(By.className("android.widget.TextView"))).get(6);
//        MobileElement logOutButton = (MobileElement) (driver.findElement(By.xpath("//*[@text=' Logout ']")));
        logOutButton.click();
        Thread.sleep(3000);

        Assert.assertTrue(signInButton.isDisplayed(), "login page should be displayed");


    }
}


