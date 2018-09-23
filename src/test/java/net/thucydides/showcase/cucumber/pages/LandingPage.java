package net.thucydides.showcase.cucumber.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.showcase.cucumber.utils.Actions;

/**
 * Created by KaushikS on 22/09/2018.
 */
public class LandingPage extends BasePage {

    @Steps
    Actions action;


    @Step("Open Website")
    public void openSite() {
        launchBrowser();
        driver.get(URL);

    }


}
