package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
//import junit.framework.Test;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;


public class BaseTest {

  AppiumDriver driver;
  AppiumDriverLocalService service;

  @BeforeClass
    public void ConfigureAppium() throws URISyntaxException, MalformedURLException {

//starting the appium server from the code
        service= new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();

        //starting ui automator
        UiAutomator2Options options = new UiAutomator2Options();
       options.setDeviceName("RZ8N904W2ZA");
//      options.setDeviceName("psp");

      options.setPlatformName("Android");
        options.setApp("//Users//krithikj//ABCproject//src//main//resources//ApiDemos-debug.apk");
        options.setCapability("appium:uiautomator2ServerLaunchTimeout", 90000); // 60 seconds
//         options.setAppActivity("com.vantivaapp.MainActivity");
//         options.setAppPackage("com.vantivaapp");

       //start the driver
        URL appiumServerUrl = new URL("http://127.0.0.1:4723");
        driver=new AndroidDriver(appiumServerUrl, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

   @AfterClass
   public void StopAppium() {
     if (driver != null) {
         driver.quit();
      }
      service.stop();
    }
}