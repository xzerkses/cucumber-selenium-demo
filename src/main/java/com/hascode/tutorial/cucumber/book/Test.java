package com.hascode.tutorial.cucumber.book;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
    public static void main(String[] args) {
        try{
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("http:www.yahoo.com");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}