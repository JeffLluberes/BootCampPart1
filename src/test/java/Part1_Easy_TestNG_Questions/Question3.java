package Part1_Easy_TestNG_Questions;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question3 {

    public WebDriver driver;

    @BeforeMethod
    public void startUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rediff.com");
    }
    @Test
    public void verifyPresenceOfElements(){

        // Money link WebElement
        driver.findElement(By.xpath("//div[@class = 'cell topicons']/child::a[2]")).click();
        // MoneyWiz logo after clicking money link
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class ='block msprite moneywizlogo negative curhand']")).isDisplayed());
    }
    @AfterMethod
    public void tearDown(){

        driver.quit();
    }
}
