package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FileUploadTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/upload");


        String projectPath = System.getProperty("user.dir");

        String relativePath = "src/test/resources/testFile.txt";

        String filePath= projectPath+"/"+relativePath;


        driver.findElement(By.name("file")).sendKeys(filePath);
       // src/test/resources/testFile.txt

        driver.findElement(By.id("file-submit")).click();

        String actualFilename= driver.findElement(By.id("uploaded-files")).getText();

        Assert.assertEquals(actualFilename, "testFile.txt", "Verify the file name");



    }


}
