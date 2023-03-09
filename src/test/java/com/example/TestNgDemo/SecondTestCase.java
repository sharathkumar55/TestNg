package com.example.TestNgDemo;

import org.testng.annotations.Test;

public class SecondTestCase {
    @Test(priority = 1)
    void setUp()
    {
        System.out.println("this is second setup test");
    }

    @Test(priority = 2)
    void searchCustomer(){
        System.out.println("searchCustomer test");
    }

    @Test(priority = 3)
    void addCustomer(){
        System.out.println("addCustomer test");
    }

    @Test(priority = 4)
    void tearDown()
    {
        System.out.println("second closing the browser");
    }
}
