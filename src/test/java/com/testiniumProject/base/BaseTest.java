package com.testiniumProject.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        logger.info("***************************   Test started   ***************************");
        driver.get("https://www.beymen.com/");
        logger.info("Test için gidilen url: "+ driver.getTitle());
    }

    @After
    public void tearDown() {
        logger.info("***************************   Test finished   ***************************");
        driver.quit();
    }
}