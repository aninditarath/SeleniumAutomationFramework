package org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.Browserutility;

public class Loginpage extends Browserutility {

   private static final By EMAIL= By.id("email");
   private static final By PASSWORD = By.id("passwd");
   private static final By SIGNINBUTTON= By.id("SubmitLogin");
    public Loginpage(WebDriver driver) {
        super(driver);
    }

    public MyaccountPage loginwith(String username, String password){
        sendkeys(EMAIL,username);
        sendkeys(PASSWORD,password);
        clickon(SIGNINBUTTON);
        MyaccountPage myaccount = new MyaccountPage(getDriver());
       return  myaccount;

    }
}
