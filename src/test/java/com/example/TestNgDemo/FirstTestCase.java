package com.example.TestNgDemo;


import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest
public class FirstTestCase {

    @Test(priority = 1)
    void setUp()
    {
        System.out.println("this is setup test");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 2)
    void login(){
        System.out.println("login test");
    }

    @Test(priority = 3)
    void tearDown()
    {
        System.out.println("closing the browser");
    }
}
