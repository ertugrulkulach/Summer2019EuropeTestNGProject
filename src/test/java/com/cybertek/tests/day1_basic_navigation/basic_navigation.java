package com.cybertek.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class basic_navigation {
    public static void main(String[] args) throws InterruptedException {

       // WebDriverManager.chromedriver().setup();
        //WebDriver driver= new ChromeDriver();
        //driver.get("https://google.com");
        //Thread.sleep(10000);
        //driver.quit();
////////////////////////
       // WebDriverManager.chromedriver().setup();
       // WebDriver driver= new ChromeDriver();
     //   driver.get("https://ebay.com");
       // Thread.sleep(10000);
        //driver.quit();

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://cybertekschool.com");
        Thread.sleep(90000);
        driver.quit();




    }
}

