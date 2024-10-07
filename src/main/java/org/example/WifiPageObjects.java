package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WifiPageObjects {

    AppiumDriver driver;


    public WifiPageObjects(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


 @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Preference\"]")
  public WebElement preference;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")
    public WebElement preferencesDependenciesTab;

    @FindBy(id = "android:id/checkbox")
    public WebElement checkbox;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")
    public WebElement wifiSettings;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"android:id/edit\"]")
    public WebElement wifiName;

    @FindBy(id = "android:id/button1")
    public WebElement ok;


    public String wifiFlow() {
        System.out.println("working");
        preference.click();
        System.out.println("after prefrencestab");
        preferencesDependenciesTab.click();
        checkbox.click();
        String wifiText = wifiSettings.getText();
        wifiSettings.click();
        wifiName.click();
        wifiName.sendKeys("krithiWifi");
        ok.click();
        return wifiText;
    }
}


