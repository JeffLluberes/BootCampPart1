package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    public WebDriver driver;


    @FindBy(linkText = "My Account")
    private WebElement myAccountDropDown;

    @FindBy(linkText = "Login")
    private WebElement loginLink;

    public Homepage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickMyAccountDropDown(){myAccountDropDown.click();}
    public void clickloginLink(){loginLink.click();}

}
