package Part1_Easy_TestNG_Questions;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Question2 {

    public WebDriver driver;
    public SoftAssert softAssert;

    @BeforeMethod
    public void startUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucedemo.com");
    }
    @Test
    public void verifySuccessfulLogin(){

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //verify successful login
        Assert.assertTrue(driver.findElement(By.id("react-burger-menu-btn")).isDisplayed());



    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
