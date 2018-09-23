package net.thucydides.showcase.cucumber;

/**
 * Created by KaushikS on 21/09/2018.
 */

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features= {"src/test/resources/features/flight_booking/book_a_flight.feature"})
public class CucumberRunner {


}
