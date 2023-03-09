package com.example.TestNgDemo;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "loginDataProvider")
    public Object[][] getdata(){
        Object[][] data = {{"abc@gmail.com","password"},{"mno@gmail.com","pass2"}};
        return data;
    }

}
