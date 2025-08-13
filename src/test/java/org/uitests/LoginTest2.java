package org.uitests;

import org.constants.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.page.Homepage;
import org.page.Loginpage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.Browserutility;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class LoginTest2 {
Homepage homepage;
    @BeforeMethod(description = "Load the homepage")
    public void setup(){
        Homepage homepage = new Homepage(Browser.CHROME);
    }
         @Test(description = "Verifies the login functionality", groups = {"e2e","sanity"})
        public void loginTest(){
        //WebDriver driver= new ChromeDriver();

//        homepage.gotoWebsite("http://www.automationpractice.pl/index.php");
//       Loginpage loginpage= homepage.goToLoginpage();
//       loginpage.loginwith("vagog10304@ahvin.com", "password");


             assertEquals(homepage.goToLoginpage()
                     .loginwith("vagog10304@ahvin.com","password")
                     .checkUsername(),"Vg Grover");



    }

}
