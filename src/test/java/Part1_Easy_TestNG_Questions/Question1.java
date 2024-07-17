package Part1_Easy_TestNG_Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question1 {

    public WebDriver driver;

    @BeforeMethod

    public void startup(){
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("");
    }
    @Test
    public void verifyTitleOfThePage(){


    }

}
