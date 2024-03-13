package com.testSelenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Selenium10 {
    @Test(groups = "QA")
    @Description("To Verify the current URL, title of VWO App")
    public void VWOLogin() throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.navigate().to(new URL("https://vwo.com/product-updates/introducing-vwo-web-insights-dashboard/"));
        driver.navigate().back();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }
}
