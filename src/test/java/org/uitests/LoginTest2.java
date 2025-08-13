package org.uitests;

import org.constants.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.page.Homepage;
import org.page.Loginpage;
import org.utility.Browserutility;

import java.time.Duration;

public class LoginTest2 {

    public static void main(String[] args) {

        //WebDriver driver= new ChromeDriver();
        Homepage homepage = new Homepage(Browser.SAFARI);
//        homepage.gotoWebsite("http://www.automationpractice.pl/index.php");
//       Loginpage loginpage= homepage.goToLoginpage();
//       loginpage.loginwith("vagog10304@ahvin.com", "password");
       String username = homepage.goToLoginpage()
                .loginwith("vagog10304@ahvin.com","password")
                .checkUsername();

        System.out.println("--------------"+ username);



    }

}
