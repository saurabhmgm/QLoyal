package net.thucydides.showcase.cucumber.utils;

import net.thucydides.showcase.cucumber.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by KaushikS on 23/09/2018.
 */
public class Actions extends BasePage {

    public WebElement element;


    public void clickElement(By locator){

        element = driver.findElement(locator);
        element.click();


    }

    public void enterFieldValue(By locator, String value) {
        element=driver.findElement(locator);
        element.sendKeys(value);
        }

    public void enterDate(By locator,String value) {
        element=driver.findElement(locator);
        element.sendKeys(value);
    }


   public void waitForElement(By locator){
        WebDriverWait wait = new WebDriverWait(driver,20);
        element= wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void sleep(int milliSeconds){
        try {
            Thread.sleep((long)milliSeconds);
        } catch (Exception var2) {
        }
   }


    public boolean isDisplayedOnPage(By locator) {
        element = driver.findElement(locator);
        return element.isDisplayed();

    }

    public Integer flightListReturned(By locator,By tagName) {
        List<WebElement> flights = driver.findElement(locator).findElements(tagName);
        return flights.size();


    }
}

