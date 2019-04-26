package com.jdi.tests;

import com.jdi.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.jdi.states.State.loggedOut;
import static com.jdi.test.data.DefaultDataProvider.ALEX;
import static com.jdi.test.data.DefaultDataProvider.ROMAN;
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
    public void seleniumTest() {
        seleniumloginForm.loginAs(ROMAN);
        userName.is().displayed();
    }
    @Test
    public void seleniumNameTest() {
        seleniumloginForm.name.clear();
        seleniumloginForm.name.sendKeys("Alex");
        seleniumloginForm.loginButton.click();
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
