package Part1_Medium_TestNG_Questions;

import Pages.CartPage;
import Pages.Homepage;
import Pages.SearchProductPage;
import TestBase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCart_Question2 extends TestBase {

    public AddToCart_Question2() throws Exception {
        super();
    }

    public WebDriver driver;
    public Homepage homepage;
    public SearchProductPage searchProductPage;
    public CartPage cartPage;

    @BeforeMethod
    public void Startup() {
        driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
        searchProductPage = new SearchProductPage(driver);
        searchProductPage.enterToSearchBoxTextField(prop.getProperty("productName"));
        searchProductPage.clickOnSearchButton();
        searchProductPage.clickOnAddToCart();
    }

    @Test
    public void verifyCorrectProductIsBeingPurchased() {
        cartPage = new CartPage(driver);
        cartPage.clickOnViewItemLink();
        cartPage.clickOnViewCartLink();
        Assert.assertTrue(cartPage.productInCartDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}