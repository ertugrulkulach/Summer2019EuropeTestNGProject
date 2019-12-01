package com.cybertek.tests.day7;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void radioButton(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton=driver.findElement(By.id("blue"));
        WebElement redRadioButton=driver.findElement(By.id("red"));

        System.out.println("Is blue selected: "+blueRadioButton.isSelected());
        System.out.println("Is red selected: "+redRadioButton.isSelected());

        Assert.assertTrue(blueRadioButton.isSelected(),"Verify that blue button is selected");
        Assert.assertFalse(redRadioButton.isSelected(),"Verify that red button not selected");

        redRadioButton.click();

        Assert.assertTrue(redRadioButton.isSelected());
        Assert.assertFalse(blueRadioButton.isSelected());

        driver.quit();






    }
}
