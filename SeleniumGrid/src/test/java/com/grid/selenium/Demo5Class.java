package com.grid.selenium;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Demo5Class {
    public static void main(String []args){
        String hubURL = "http://192.168.2.215:4444";
        Capabilities capabilities = new ChromeOptions();

        try {
            WebDriver driver = new RemoteWebDriver(new URL(hubURL), capabilities);
            driver.get("https://www.facebook.com");
            Thread.sleep(8000);
            System.out.println("Page Title is: " + driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
