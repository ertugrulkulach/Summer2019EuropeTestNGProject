package com.cybertek.tests.day7_types_of_elements;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @Test
    public void test1() {

        System.out.println("First Assertion");
        Assert.assertEquals("one", "one", "verifying one is equal one");

        System.out.println("Second Assertion");
        Assert.assertEquals(1, 1);

    }

    @Test
    public void test2() {
        //verify that title starts with C
        String actualTitle = "Cybertek";
        String expecTitleBeginning = "C";

        System.out.println("First Assertion");
        Assert.assertTrue(actualTitle.startsWith(expecTitleBeginning), "Verify title starts with C");
        //TASK
        //verify that email includes @ sign
        Assert.assertTrue("yasin@mail".contains("@"), "Verify @ in email");
    }

    @Test
    public void test3() {
        Assert.assertNotEquals("one", "two");
    }

        @Test
        public void test4 () {
            Assert.assertFalse(1 < 0);


        }
    }





