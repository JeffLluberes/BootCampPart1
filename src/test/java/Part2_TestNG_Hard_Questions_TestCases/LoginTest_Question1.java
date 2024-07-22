package Part2_TestNG_Hard_Questions_TestCases;

import Pages.AccountPage;
import Pages.Homepage;
import Pages.LoginPage;
import TestBase.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest_Question1 extends TestBase {
    public LoginTest_Question1() throws Exception {
        super();
    }

    public WebDriver driver;
    public Homepage homepage;
    public LoginPage loginPage;
    public AccountPage accountPage;

    @BeforeMethod
    public void loginSetup() {
        driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
        homepage = new Homepage(driver);
        homepage.clickMyAccountDropDown();
        homepage.clickloginLink();
    }

    @Test
    public void loginWithValidCredentials() {
        loginPage = new LoginPage(driver);
        loginPage.enterEmail(prop.getProperty("validEmail"));
        loginPage.enterPassword(prop.getProperty("validPassword"));
        loginPage.clickOnLoginButton();



    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
