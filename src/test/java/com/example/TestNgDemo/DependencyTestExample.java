package com.example.TestNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestExample {

    @Test
    void startCar(){
        System.out.println("Car started");
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("Car driving");
        Assert.assertEquals(1,2);
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("Car stopped");
    }

    @Test(dependsOnMethods = {"driveCar","stopCar"},alwaysRun = true)
    void parkCar(){
        System.out.println("Car parked");
    }


}
