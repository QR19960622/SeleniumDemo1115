package com.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Operate {

    public static void clearAndSetText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    public static void toFrame(WebDriver webDriver, WebElement element){
        webDriver.switchTo().frame(element);
    }

}
