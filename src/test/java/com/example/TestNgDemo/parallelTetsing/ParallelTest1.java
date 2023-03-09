package com.example.TestNgDemo.parallelTetsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ParallelTest1 {

    WebDriver driver;


    @Test()
    void testHomePageTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/sharkt/Downloads/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = driver.getTitle();
        Assert.assertEquals(title,"OrangeHRM");
        Thread.sleep(5000);

    }

    @Test
    void testLogo() throws InterruptedException {
        System.out.println("Testing logo....");
        Thread.sleep(5000);

    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }
}
