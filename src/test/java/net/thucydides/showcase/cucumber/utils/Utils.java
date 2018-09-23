package net.thucydides.showcase.cucumber.utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.thucydides.showcase.cucumber.pages.BasePage;


public class Utils extends BasePage {


    @Before
    public void openBrowser() {
        //System.setProperty("webdriver.gecko.driver", "src/test/resources/Driver/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
    }


    @After
    public void afterScenario() {
        driver.close();
    }
}
