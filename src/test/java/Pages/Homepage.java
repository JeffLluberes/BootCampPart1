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

    @FindBy(name = "search")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@type = 'button']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@type = 'button']/i/following::span[@class = 'hidden-xs hidden-sm hidden-md']")
    private WebElement addToCartButton;


    public Homepage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickMyAccountDropDown(){myAccountDropDown.click();}
    public void clickloginLink(){loginLink.click();}
    public void enterToSearchBoxTextField(String product){searchBox.sendKeys(product);}
    public void clickOnSearchButton(){searchButton.click();}
    public void clickOnAddToCart(){addToCartButton.click();}


}
