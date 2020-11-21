package com.service;

import com.Utils.Operate;
import com.Utils.DriverUtils;
import com.pages.LoginPage;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class LoginService {

    private static String testUrl = "https://mail.163.com/";
//  创建 driver 对象
    private WebDriver driver = new DriverUtils().driverFirefox();
//  导入该功能的页面库
    private LoginPage loginPage = new LoginPage();

    @Test
    public void loginTest(){
        driver.get(testUrl);
        // 进入 登录 frame
        Operate.toFrame(driver, loginPage.LoginFrame(driver));
//        driver.switchTo().frame(loginPage.LoginFrame(driver));
        // 输入 账号
        Operate.clearAndSetText(loginPage.EmailInput(driver), "13535558357");
//        loginPage.EmailInput(driver).sendKeys("13535558357");
        // 输入 密码
        loginPage.PwdInput(driver).sendKeys("Amwitfkitfk998");
        // 点击 登录 按钮
        loginPage.LoginButton(driver).click();
    }
}
