package Part2_TestNG_Hard_Questions_TestCases;

import Pages.CartPage;
import Pages.Homepage;
import TestBase.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class AddToCart_Question2 extends TestBase {

    public AddToCart_Question2() throws Exception {
        super();
    }
    public WebDriver driver;
    public Homepage homepage;
    public CartPage cartPage;


    @BeforeMethod
    public void Startup(){

        driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
        homepage = new Homepage(driver);
        homepage.enterToSearchBoxTextField(prop.getProperty("productName"));
        homepage.clickOnSearchButton();
        homepage.clickOnAddToCart();

    }

}
