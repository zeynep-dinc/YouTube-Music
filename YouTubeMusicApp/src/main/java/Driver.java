import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    AppiumDriver<MobileElement> appiumDriver;


    public void driverSettings(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "SM-A505F");
        capabilities.setCapability("udid", "R58M73372GY");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("appPackage", "com.google.android.apps.youtube.music");
        capabilities.setCapability("appActivity", "com.google.android.apps.youtube.music.activities.MusicActivity");


        URL url = null;
        try {
            url = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        appiumDriver = new AppiumDriver(url, capabilities);
        System.out.println("Application started!!!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
