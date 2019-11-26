package com.cybertek.tests.day2;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class closeAndQuit {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        Thread.sleep(6000);
        //close()--> closes the current tab
        //quit()->close all open windows and tabs and pop ups etc.


       driver=new ChromeDriver();
        driver.get("https://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(10000);
        driver.close();


    }
}
