package org.uitests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.Browserutility;

import java.time.Duration;

public class LoginTestold extends Browserutility{

    public LoginTestold(WebDriver driver) {
        super(driver);
    }



    public static void main(String[] args) {

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");

//        WebDriverManager.chromedriver().setup();
     WebDriver wd = new ChromeDriver();

       // Browserutility browserutility = new Browserutility(wd);
        //browserutility.gotoWebsite("http://www.automationpractice.pl/index.php");

        WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(30));

      // browserutility.clickon(loginLocator);

        By email= By.id("email");
       //browserutility.sendkeys(email,"vagog10304@ahvin.com");

        By password = By.id("passwd");
        //browserutility.sendkeys(password,"password");

        By signinbutton= By.id("SubmitLogin");
        //browserutility.clickon(signinbutton);
    }

}
