package com.cybertek.tests.day3_webElement_Intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifylURLnotChanged {
    /*
     * open chrome browser
         * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
            * click on Retrieve password
         * verify that url did not change
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password ");

        String expectedURL= driver.getCurrentUrl();

        WebElement rp= driver.findElement(By.id("form_submit"));

        rp.click();

        String actualURL=driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

        }
        Thread.sleep(5000);
        driver.quit();






    }
}
