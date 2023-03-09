package com.example.TestNgDemo;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

    //it will execute before starting of Test set/batch
    @Override
    public void onStart(ITestContext context) {
        System.out.println("STarts tst execution...."+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Finish tst execution...."+context.getName());

    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("starts test...."+result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("skipped test...."+result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("failure test...."+result.getName());

    }
}
