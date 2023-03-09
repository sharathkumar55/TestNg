package com.example.TestNgDemo;

import org.testng.annotations.Test;

public class GroupingTestExample {

    @Test(groups = {"sanity"})
    void TestOne(){
        System.out.println("test 1");

    }
    @Test(groups = {"sanity"})
    void TestTwo(){
        System.out.println("test 2");
    }

    @Test(groups = {"regression"})
    void TestThree(){
        System.out.println("test 3");
    }
    @Test(groups = {"regression"})
    void TestFour(){
        System.out.println("test 4");
    }

    @Test(groups = {"regression","sanity"})
    void TestFive(){
        System.out.println("test 5");
    }
}
