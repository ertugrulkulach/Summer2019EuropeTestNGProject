package com.cybertek.tests.day7;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class disabledElement {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenButton=driver.findElement(By.id("green"));

        System.out.println(greenButton.isEnabled());

        Assert.assertFalse(greenButton.isEnabled(),"Verify that green button not enabled ");

    }

         @Test
         public void test2(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

        System.out.println("is input enabled: "+ inputBox.isEnabled());



       // inputBox.sendKeys("Mike Smith");  bu kismi eklersen hata veriyor enable disable meseleli

    }






}
