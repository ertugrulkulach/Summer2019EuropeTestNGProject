package com.cybertek.tests.day4_basicLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calssLocator {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement home= driver.findElement(By.className("nav-link"));
        home.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement mbutton = driver.findElement(By.className("h3"));
        String multi= mbutton.getText();
        System.out.println(multi);
        driver.quit();
    }
}
