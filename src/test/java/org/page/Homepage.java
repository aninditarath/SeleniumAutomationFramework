package org.page;

import org.constants.Browser;

import static org.constants.Enviornment.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.Browserutility;
import org.utility.JsonUtility;

import static org.utility.PropertiesUtil.*;

public class Homepage extends Browserutility {

  private static final By LOGIN_LOCATOR = By.xpath("//a[@class='login']");

    public Homepage(Browser browsername) {
        super(browsername);
        gotoWebsite(readproperty(QA,"URL"));
        gotoWebsite(JsonUtility.readjson(QA));
    }


    public Loginpage goToLoginpage(){
      clickon(LOGIN_LOCATOR);
      Loginpage loginpage = new Loginpage(getDriver());
      return loginpage;


  }

  public  void quit(){
        quitdriver();

  }


}
