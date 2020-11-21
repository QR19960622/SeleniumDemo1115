package com.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ElementUtils {

    public WebElement findElement(WebDriver driver, By by) {
        try {
//            在查找元素前, 先检查是否已经能定位到元素
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (Exception e) {
            System.out.println("元素" + by + "查找超时!!!");
            e.printStackTrace();
        }
//      确认能定位后再定位并查找元素
        return driver.findElement(by);
    }

    public List<WebElement> findElements(WebDriver driver, By by) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
//            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        } catch (Exception e) {
            System.out.println("元素" + by + "查找超时!!!");
            e.printStackTrace();
        }
        return driver.findElements(by);
    }

}
