package com.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DriverUtils {

    private WebDriver driver;

    public WebDriver newDriver(String browser){
        String path = System.getProperty("user.dir");
        if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        if (browser.equals("firefox")){
//            System.setProperty("webdriver.firefox.bin", "D:\\firefox\\firefox.exe");
            System.setProperty("webdriver.firefox.driver", path + "\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        if (browser.equals("ie")){
            System.setProperty("webdriver.ie.drive", path + "\\Drivers\\IEDriverSerer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public WebDriver driverChrome(){
        return newDriver("chrome");
    }

    public WebDriver driverFirefox(){
        return newDriver("firefox");
    }

    public WebDriver driverIE(){
        return newDriver("ie");
    }
}
