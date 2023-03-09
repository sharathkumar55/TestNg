package com.example.TestNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExample {

    WebDriver driver;

    @BeforeClass
    void setUp(){
        System.setProperty("webdriver.chrome.driver","/home/sharkt/Downloads/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @Test
    void testHomePageTitle()
    {
      String title = driver.getTitle();
      Assert.assertEquals(title,"OrangeHRM");
    }

    @AfterClass
    void tearDown() {
    driver.quit();
    }
}
