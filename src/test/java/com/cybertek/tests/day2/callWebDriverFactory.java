package com.cybertek.tests.day2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class callWebDriverFactory {


    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.get("https://www.google.com");
    }
}
