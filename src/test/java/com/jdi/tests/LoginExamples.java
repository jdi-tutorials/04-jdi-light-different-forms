package com.jdi.tests;

import com.jdi.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.jdi.states.State.loggedOut;
import static com.jdi.test.data.DefaultDataProvider.*;
import static jdisite.JDISite.*;

public class LoginExamples implements TestsInit {
    @BeforeMethod
    public void before() {
        loggedOut();
        if (loginForm.isHidden())
            userIcon.click();
    }

    // Login Form in Selenium
    @Test
    public void seleniumNameTest() {
        seleniumLoginForm.name.clear();
        seleniumLoginForm.name.sendKeys("Alex");
        seleniumLoginForm.loginButton.click();
        userName.is().disappear();
    }
    @Test
    public void seleniumTest() {
        seleniumLoginForm.loginAs(ROMAN);
        userName.is().displayed();
    }
    @Test
    public void failSeleniumTest() {
        seleniumLoginForm.login(ALEX_SELENIDE);
        userName.is().disappear();
    }

    // Login Form in Selenide
    @Test
    public void selenideTest() {
        selenideLoginForm.loginAs(ROMAN);
        userName.is().displayed();
    }
    @Test
    public void selenideNameTest() {
        selenideLoginForm.loginAs(ALEX_SELENIDE);
        userName.is().disappear();
    }
    // Login Form in JDI Light
    @Test
    public void loginTest() {
        loginForm.loginAs(ROMAN);
        userName.is().displayed();
    }

    // Smart Login Form in JDI Light
    @Test
    public void login2Test() {
        loginFormSmart.loginAs(ROMAN);
        userName.is().displayed();
    }
    @Test
    public void login2NameTest() {
        loginFormSmart.loginAs(ALEX);
        userName.is().disappear();
    }

    // Login Form without Page Object in JDI Light
    @Test
    public void lightLogin1Test() {
        lightLoginForm.loginAs(ROMAN);
        userName.is().displayed();
    }
}
