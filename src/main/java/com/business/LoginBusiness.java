package com.business;

import com.service.LoginService;
import org.testng.annotations.Test;

public class LoginBusiness {
    @Test
    public void loginCase() throws InterruptedException{
        LoginService loginService = new LoginService();
        loginService.loginTest();
    }
}
