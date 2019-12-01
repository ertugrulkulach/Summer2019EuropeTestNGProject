package com.cybertek.tests.day4_basicLocators;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {
    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Ertugrul Tugrul");

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("ert2020@gmail.com");
        WebElement button= driver.findElement(By.tagName("button"));
        button.click();

        WebElement message= driver.findElement(By.tagName("h3"));
        String expectedmessage= "Thank you for signing up. Click the button below to return to the home page.";
        String actualmessage=message.getText();
        System.out.println(expectedmessage);
        if(expectedmessage.equals(actualmessage)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

            System.out.println("actualmessage = " + actualmessage);
            System.out.println("expectedmessage = " + expectedmessage);

        }
        driver.quit();







    }

}
