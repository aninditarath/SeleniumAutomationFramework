package org.page;

import org.constants.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.Browserutility;

public class Homepage extends Browserutility {

  private static final By LOGIN_LOCATOR = By.xpath("//a[@class='login']");

    public Homepage(Browser browsername) {
        super(browsername);
        gotoWebsite("http://www.automationpractice.pl/index.php");
    }


    public Loginpage goToLoginpage(){
      clickon(LOGIN_LOCATOR);
      Loginpage loginpage = new Loginpage(getDriver());
      return loginpage;


  }


}
