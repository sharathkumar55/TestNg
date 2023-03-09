package com.example.TestNgDemo.parallelTetsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTest2 {

    WebDriver driver;

    @Test
    void testLogin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/sharkt/Downloads/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("Username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
        String title = driver.getTitle();
        Assert.assertEquals(title,"OrangeHRM");
        Thread.sleep(5000);

    }
    @AfterClass
    void tearDown() {
        driver.quit();
    }
}
