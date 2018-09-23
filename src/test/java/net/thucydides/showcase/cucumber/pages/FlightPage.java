package net.thucydides.showcase.cucumber.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.showcase.cucumber.utils.Actions;
import org.openqa.selenium.By;

/**
 * Created by KaushikS on 22/09/2018.
 */
public class FlightPage extends BasePage {
    @Steps
    Actions action;

    private By selectFromAirport = By.xpath("//div[@id='s2id_location_from']");
    private By selectDropDown = By.xpath("//ul[contains(@class,'select2-results')]/li[1]");
    private By selectToAirport = By.xpath("//div[@id='s2id_location_to']");
    private By airportCode = By.xpath("//*[@id='select2-drop']/div/input");
    private By selectFromField = By.xpath("//*[@id='select2-results']/ul/li[1]");
    private By toField = By.xpath("//*[@id='select2-drop']/div/input");
    private By pickADate = By.name("departure");
    private By searchFlights = By.xpath("/html/body/div[4]/section/div[2]/div/div/div[2]/div/div[4]/form/div[6]/button");
    private By flightTab = By.xpath("/html/body/div[4]/section/div[2]/div/div/div[2]/ul/li[2]/a/span");//By.xpath(".//a/@href='#flights'");


    @Step
    public boolean homePageIsAvailable() {
        return action.isDisplayedOnPage(flightTab);
    }


    @Step
    public void clickOnFlightsNavigationButton() {
        action.waitForElement(flightTab);
        action.clickElement(flightTab);
    }


    @Step
    public void enterFromLocation(String value) {
        action.waitForElement(selectFromAirport);
        action.clickElement(selectFromAirport);
        action.enterFieldValue(airportCode, value);
        action.sleep(6000);
        action.clickElement(selectDropDown);
    }


    @Step
    public void enterToLocation(String value) {
        action.clickElement(selectToAirport);
        action.enterFieldValue(airportCode, value);
        action.sleep(6000);
        action.clickElement(selectDropDown);
    }


    @Step
    public void pickADate(String value) {
        action.enterDate(pickADate, value);
    }

    @Step
    public void clickOnFlightsSearch() {
        action.clickElement(searchFlights);
    }


}