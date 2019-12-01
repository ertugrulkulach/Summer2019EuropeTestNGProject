package com.cybertek.tests.day5_xptahTest;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpathtest {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement homeLink=driver.findElement(By.xpath("//li/a"));
        homeLink.click();
        /// /*[@onclick ='button1()']

    }
}
