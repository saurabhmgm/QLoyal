package net.thucydides.showcase.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by KaushikS on 22/09/2018.
 */
public class BasePage {


    public static WebDriver driver;
    public static final String URL = "http://www.phptravels.net";



   public void launchBrowser(){
       //driver = new FirefoxDriver();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

   }


}
