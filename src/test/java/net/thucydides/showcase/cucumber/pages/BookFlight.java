package net.thucydides.showcase.cucumber.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.showcase.cucumber.utils.Actions;
import org.openqa.selenium.By;

/**
 * Created by KaushikS on 23/09/2018.
 */
public class BookFlight extends BasePage {

@Steps
Actions action;


    private By listOfFlight= By.xpath("//*[@id='load_data']/tbody");
    private By tagName = By.tagName("tr");



    @Step
    public Integer atLeastAFlightIsAvailable() {
        action.waitForElement(listOfFlight);
        return action.flightListReturned(listOfFlight,tagName);
    }

    public void travellerDetails() {
       // action.clickElement();
    }

    public void booknow() {
       // action.clickElement();
    }
}
