package com.example.TestNgDemo;

import org.testng.annotations.*;

public class AnnotationsDemo2 {
    @BeforeTest
    void beforeTest(){
        System.out.println("before test 2 AnnotationsDemo2 ....");
    }

    @AfterTest
    void afterTest(){
        System.out.println("after test 2 AnnotationsDemo2.....");
    }


    @BeforeClass
    void beforeSetupClass(){
        System.out.println("Before class 2");
    }

    @AfterClass
    void afterSetupClass(){
        System.out.println("after class 2");
    }

    @BeforeMethod
    void beforeSetup(){
        System.out.println("Before setup 2");
    }

    @AfterMethod
    void afterSetup(){
        System.out.println("after setup 2");
    }


    @Test
    void test3(){
        System.out.println("test3...");
    }

    @Test
    void test4(){
        System.out.println("test4");
    }
}
