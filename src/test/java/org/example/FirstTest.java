package org.example;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class FirstTest extends BaseTest{
    @Test
        public void WifiSettingsName() throws MalformedURLException, URISyntaxException {
       System.out.println("App launched");
        WifiPageObjects wifi = new WifiPageObjects(driver);
        String verifyText= wifi.wifiFlow();
        Assert.assertEquals(verifyText, "WiFi settings");

    }


    }

