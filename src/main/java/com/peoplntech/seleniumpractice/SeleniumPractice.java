package com.peoplntech.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class SeleniumPractice {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.chrome.com/");

        Thread.sleep(5000);

        webDriver.close();
    }
}
