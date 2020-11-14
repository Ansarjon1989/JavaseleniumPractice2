package com.peoplntech.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) throws InterruptedException {


        // set up data as chrome driver needs
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        //create object for chrome driver
        WebDriver driver = new ChromeDriver();

        //tell chrome driver to go to url....
        driver.get("https://www.chrome.com");

        //wait 5 sec
        Thread.sleep(5000);

        //close the chrome
        driver.close();


    }

}
