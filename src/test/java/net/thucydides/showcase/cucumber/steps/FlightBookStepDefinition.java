package net.thucydides.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.showcase.cucumber.pages.BookFlight;
import net.thucydides.showcase.cucumber.pages.FlightPage;
import net.thucydides.showcase.cucumber.pages.LandingPage;
import org.junit.Assert;

/**
 * Created by KaushikS on 22/09/2018.
 */
public class FlightBookStepDefinition  {

    @Steps
    LandingPage homepage;
    @Steps
    FlightPage searchFlight;
    @Steps
    BookFlight bookFlight;




    @Given("^a user visits a travel website$")
    public void aUserVisitsATravelWebsite() throws Exception {
        homepage.openSite();
        Assert.assertTrue(searchFlight.homePageIsAvailable());

    }

    @And("^enters Origin (.*)$")
    public void entersOriginLocation(String fromLocation) throws Exception {
        searchFlight.clickOnFlightsNavigationButton();
        searchFlight.enterFromLocation(fromLocation);
    }

    @And("^enters Destination (.*)$")
    public void entersDestinationToLocation(String toLocation) throws Throwable {
        searchFlight.enterToLocation(toLocation);
    }

    @And("^enters a travel date (.*)$")
    public void entersATravelDateTravelDate(String date) throws Throwable {
        searchFlight.pickADate(date);
    }

    @When("^a user searches a flight$")
    public void aUserSearchesAFlight() throws Throwable {
        searchFlight.clickOnFlightsSearch();
    }

    @Then("^a user should get at least one flight option$")
    public void aUserShouldGetAtLeastOneFlightOption() throws Throwable {
        bookFlight.atLeastAFlightIsAvailable();
        Assert.assertNotEquals(bookFlight.atLeastAFlightIsAvailable(),"0");
    }

    @Given("^a user searched a flight$")
    public void aUserSearchedAFlight() throws Throwable {
        homepage.openSite();
        searchFlight.clickOnFlightsNavigationButton();
        searchFlight.enterFromLocation("MEL");
        searchFlight.enterToLocation("SYD");
        searchFlight.pickADate("29-10-11");
        searchFlight.clickOnFlightsSearch();
        bookFlight.atLeastAFlightIsAvailable();


    }

    @When("^user submits the booking details$")
    public void userSubmitsTheBookingDetails() throws Throwable {
        bookFlight.booknow();
        bookFlight.travellerDetails();
    }
}
