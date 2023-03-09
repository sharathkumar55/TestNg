package com.example.TestNgDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {


    WebDriver driver;

    @BeforeClass
    @Parameters({"browser","url"})
    void setUp(String browser,String app){

        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","/home/sharkt/Downloads/chromedriver/chromedriver");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.chrome.driver","/home/sharkt/Downloads/chromedriver/chromedriver");
            driver = new FirefoxDriver();
        }
        driver.get(app);



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
