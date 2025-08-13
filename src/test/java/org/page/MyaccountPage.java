package org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.Browserutility;

public class MyaccountPage extends Browserutility {

    private static final By USERNAME = By.xpath("//a[@title='View my customer account']");
    public MyaccountPage(WebDriver driver) {
        super(driver);
    }

    public String checkUsername(){
        return getVisibletext(USERNAME);


    }
}
