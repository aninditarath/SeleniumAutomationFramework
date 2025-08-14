package org.uitests;

import org.constants.Browser;
import org.page.Homepage;
import org.pojo.User;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest2 {
Homepage homepage;
    @BeforeMethod(description = "Load the homepage")
    public void setup(){
         homepage = new Homepage(Browser.CHROME);
    }
         @Test(description = "Verifies the login functionality",
                 groups = {"e2e","sanity"},
                 dataProviderClass = org.dataproviders.loginDataProvider.class,
                 dataProvider = "LoginTestDataprovider")
        public void loginTest(User user){
        //WebDriver driver= new ChromeDriver();

//        homepage.gotoWebsite("http://www.automationpractice.pl/index.php");
//       Loginpage loginpage= homepage.goToLoginpage();
//       loginpage.loginwith("vagog10304@ahvin.com", "password");


             assertEquals(homepage.goToLoginpage()
                     .loginwith(user.getEmailaddress(),user.getPassword())
                     .checkUsername(),"Vg Grover");



    }
    @AfterMethod(alwaysRun = true)
    public void teardown() {
        if (homepage != null) homepage.quit();
    }

}
