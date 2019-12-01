package com.cybertek.tests.day2;


import org.openqa.selenium.WebDriver;

import static com.cybertek.utilities.WebDriverFactory.getDriver;

public class navigationDemo {
    public static void main(String[] args) throws InterruptedException {


       WebDriver driver = getDriver("chrome");
        driver.get("https://www.hotmail.com");
        Thread.sleep(5000);

        WebDriver driver2 = getDriver("chrome");
        driver2.navigate().to("https://www.yahoo.com");
        Thread.sleep(6000);

        driver2.quit();





    }

}