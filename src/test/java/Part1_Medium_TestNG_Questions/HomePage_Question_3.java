package Part1_Medium_TestNG_Questions;

import Pages.Homepage;
import TestBase.TestBase;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage_Question_3 extends TestBase {
    public HomePage_Question_3() throws Exception {
        super();

    }
    public WebDriver driver;
    public Homepage homepage;

    @BeforeMethod
    public void startUp(){
        driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));

    }
    @Test
    public void verifyPresenceOfCertainElements(){
        homepage = new Homepage(driver);
        Assert.assertTrue(homepage.elementPresentOnHomePage());
        homepage.clickOnLinkOnHomepage();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
