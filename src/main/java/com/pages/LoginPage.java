package com.pages;

import com.Utils.DriverUtils;
import com.Utils.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage extends ElementUtils{

    //	定义 email 文本框的定位方式
    private By emailInput =  By.name("email");

    //	定义 password 文本框的定位方式
    private By pwdInput =  By.name("password");

    //	定义 loginButton 的定位方式
    private By loginButton =  By.id("dologin");

    //	定义 registerButton 的定位方式
    private By registerButton =  By.xpath("//div[@class=\"loginWrap\"]/div[2]/a[1]");

    // 定义 loginFrame 定位方式
    private By loginFrame = By.xpath("//div[@class=\"loginWrap\"]/div[@id=\"loginDiv\"]/iframe");

    public WebElement LoginFrame(WebDriver driver) {
        return findElement(driver, loginFrame);
    }

    public WebElement EmailInput(WebDriver driver) {
        return findElement(driver, emailInput);
    }

    public WebElement PwdInput(WebDriver driver) {
        return findElement(driver, pwdInput);
    }

    public WebElement LoginButton(WebDriver driver) {
        return findElement(driver, loginButton);
    }

    public WebElement RegisterButton(WebDriver driver){
        return findElement(driver, registerButton);
    }

//    测试元素查找是否正确
    @Test
    public void elementTest(){
        WebDriver driver = new DriverUtils().driverFirefox();
        driver.get("https://mail.163.com/");
        driver.switchTo().frame(LoginFrame(driver));
        EmailInput(driver).sendKeys("13535558357");
        PwdInput(driver).sendKeys("Amwitfkitfk998");
        LoginButton(driver);
        driver.switchTo().defaultContent();
        RegisterButton(driver);
    }
}
