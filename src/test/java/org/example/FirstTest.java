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
            driver.findElement(AppiumBy.accessibilityId("Preference")).click();
            driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
            driver.findElement(By.id("android:id/checkbox")).click();
            String wifisettingsText= driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")).getText();
        Assert.assertEquals(wifisettingsText,"WiFi settings");
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"android:id/edit\"]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"android:id/edit\"]")).sendKeys("krithiWifi");
        driver.findElement(By.id("android:id/button1")).click();
    }
    }

