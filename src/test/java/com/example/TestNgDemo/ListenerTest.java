package com.example.TestNgDemo;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(CustomListeners.class)
public class ListenerTest {

    @Test()
    void TestOne(){
        System.out.println("test 1");

    }
    @Test
    void TestTwo(){
        Assert.assertEquals(1,2);
    }

    @Test
    void TestThree(){
        throw new SkipException("this test is skipped");
    }
}
