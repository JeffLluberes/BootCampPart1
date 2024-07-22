package Part1_Easy_TestNG_Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question1 {

    public WebDriver driver;

    @BeforeMethod
    public void startup(){
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://rediff.com");
    }
    @Test
    public void verifyTitleOfThePage(){

    String actualTitle = driver.getTitle();
    String expectedTitle ="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
    Assert.assertEquals(actualTitle,expectedTitle);


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
