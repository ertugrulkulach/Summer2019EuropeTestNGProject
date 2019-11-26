package com.cybertek.tests.day2;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.*;

public class navigationDemo {
    public static void main(String[] args) throws InterruptedException {


       WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hotmail.com");
        Thread.sleep(5000);

        WebDriver driver2 = WebDriverFactory.getDriver("chrome");
        driver2.navigate().to("https://www.yahoo.com");
        Thread.sleep(6000);

        driver2.quit();





    }

}