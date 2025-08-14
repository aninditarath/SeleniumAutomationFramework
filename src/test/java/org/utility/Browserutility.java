package org.utility;

import org.constants.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public abstract class Browserutility {

    WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public Browserutility(WebDriver driver) {
        this.driver = driver;
    }

    public Browserutility(String browsername){
        if(browsername.equalsIgnoreCase("chrome")){
            driver= new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("safari")) {
            driver= new SafariDriver();

        }
        else {
            System.out.println("invalid browsername........");
        }
    }
    public Browserutility(Browser browsername){
        if(browsername== Browser.CHROME){
            driver= new ChromeDriver();
        } else if (browsername==Browser.SAFARI) {
            driver= new SafariDriver();

        }
        else {
            System.out.println("invalid browsername........");
        }
    }
    public void gotoWebsite(String url){
        driver.get(url);
        driver.manage().window().maximize();

    }

    public void clickon(By locator){
        WebElement element= driver.findElement(locator);
        element.click();


    }

    public void sendkeys(By locator,String texttoenter){
        WebElement element=driver.findElement(locator);
        element.sendKeys(texttoenter);
    }

    public String getVisibletext(By locator){
        WebElement element=driver.findElement(locator);
        String value = element.getText();
        return value;
    }

    public void quitdriver(){
        driver.quit();

    }
}
