package com.example.TestNgDemo;

import org.testng.annotations.*;

public class AnnotationsDemo1 {

    @BeforeSuite
    void beforeSuite(){
        System.out.println("before suite 1 AnnotationsDemo1....");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("after suite 1 AnnotationsDemo1....");
    }

    @AfterTest
    void afterTest(){
        System.out.println("after test 1.....");
    }

    @BeforeClass
    void beforeSetupClass(){
        System.out.println("Before class");
    }

    @AfterClass
    void afterSetupClass(){
        System.out.println("after class");
    }

    @BeforeMethod
    void beforeSetup(){
        System.out.println("Before setup");
    }

    @AfterMethod
    void afterSetup(){
        System.out.println("after setup");
    }


    @Test
    void test1(){
        System.out.println("test1");
    }

    @Test
    void test2(){
        System.out.println("test2");
    }
}
