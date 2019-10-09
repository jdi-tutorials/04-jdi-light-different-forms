package com.jdi;

import jdisite.JDISite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static com.epam.jdi.light.logger.LogLevels.STEP;
import static com.epam.jdi.light.settings.WebSettings.logger;
import static jdisite.JDISite.homePage;

public interface TestsInit {
    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        logger.setLogLevel(STEP);
        initElements(JDISite.class);
        homePage.open();
    }
    @AfterSuite(alwaysRun = true)
    static void teardown() {
        killAllSeleniumDrivers();
    }
}
