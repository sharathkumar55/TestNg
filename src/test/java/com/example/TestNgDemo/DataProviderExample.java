package com.example.TestNgDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

//    @DataProvider(name = "loginDataProvider")
//    public Object[][] getdata(){
//        Object[][] data = {{"abc@gmail.com","password"},{"mno@gmail.com","pass2"}};
//        return data;
//    }


    // it will Run based on number of data is provided i.e it will run for 2 times
    @Test(dataProvider = "loginDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testLogin(String email,String password){
        System.out.println(email+" "+password);
    }
}
