package Part1_Medium_TestNG_Questions;

import Pages.Homepage;
import Pages.RegistrationPage;
import TestBase.TestBase;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.text.Utilities;

public class SuccessFulRegistration_Question1 extends TestBase {
    public SuccessFulRegistration_Question1() throws Exception {
        super();
    }
    public WebDriver driver;
    public Homepage homepage;
    public RegistrationPage registrationPage;

    @BeforeMethod
    public void startUp(){
        driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
        homepage = new Homepage(driver);
        homepage.clickMyAccountDropDown();
        homepage.clickOnRegisterLink();
    }
    @Test
    public void verifySuccessfulLoginWithValidCredentials(){
        registrationPage = new RegistrationPage(driver);
        registrationPage.enterFirstNameIntoFieldBox(prop.getProperty("firstName"));
        registrationPage.enterLastNameIntoFieldBox(prop.getProperty("lastName"));
        registrationPage.enterEmailIntoFieldBox();
        registrationPage.enterTelephoneIntoFieldBox(prop.getProperty("telephone"));
        registrationPage.enterPasswordIntoFieldBox(prop.getProperty("password"));
        registrationPage.enterConfirmPasswordIntoFieldBox(prop.getProperty("confirmPassword"));
        registrationPage.clickOnPrivacyPolicyCheckBox();
        registrationPage.clickOnContinueButton();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
