package com.example.TestNgDemo;

import org.junit.jupiter.api.Disabled;
import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1,enabled = false)
    void TestOne(){
        System.out.println("test 1");

    }
    @Test(priority = 2)
    void TestTwo(){
        System.out.println("test 2");
    }

    @Test(priority = 3)
    void TestThree(){
        System.out.println("test 3");
    }
}
