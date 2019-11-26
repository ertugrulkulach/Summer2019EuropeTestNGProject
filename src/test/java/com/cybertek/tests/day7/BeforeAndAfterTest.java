package com.cybertek.tests.day7;

import org.testng.annotations.*;

public class BeforeAndAfterTest {
    @Test
    public void test1() {
        System.out.println("This is my test One");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method");
        System.out.println("Opening the browser");
}
    @Test
    public void test2() {
        System.out.println("This is my test second");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Close the browser");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class CODE");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("T");
        System.out.println("Close browser");

}
}











