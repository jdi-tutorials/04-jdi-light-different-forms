package com.jdi.tests;

import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.composite.WebPage.openUrl;
import static com.epam.jdi.light.elements.init.UIFactory.$;
import static com.epam.jdi.light.elements.init.UIFactory.loginAs;
import static com.epam.jdi.light.settings.WebSettings.DOMAIN;
import static com.jdi.test.data.DefaultDataProvider.ROMAN;

public class NoPoExample {
    @Test
    public void loginFormTest() {
        DOMAIN = "https://jdi-testing.github.io/jdi-light/";
        openUrl("/");
        $("img#user-icon").click();
        loginAs(ROMAN);
        $("#user-name").is().displayed();
    }

}
