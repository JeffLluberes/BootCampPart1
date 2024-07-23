package Part1_TestNG_Hard_Questions_TestCases;

import Pages.SearchProductPage;
import TestBase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProduct_Question3 extends TestBase {

    public SearchProduct_Question3() throws Exception {
        super();
    }

    public WebDriver driver;
    public SearchProductPage searchProductPage;

    @BeforeMethod
    public void startUp(){
        driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
    }

    @Test
    public void verifySearchResultsAreDisplayed(){
    searchProductPage = new SearchProductPage(driver);
    searchProductPage.enterToSearchBoxTextField(prop.getProperty("productName"));
    searchProductPage.clickOnSearchButton();
        Assert.assertTrue(searchProductPage.searchResultsForProductIsDisplayed());
        searchProductPage.navigateToProductPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
