package Pages;

import ch.qos.logback.core.html.CssBuilder;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public WebDriver driver;

    @FindBy(id = "cart-total")
    private WebElement itemLink;

    @FindBy(linkText = "View Cart")
    private WebElement viewCartLink;

    @FindBy(css = "#content > form > div > table > tbody > tr > td:nth-child(2) > a")
    private WebElement productInCart;


    public CartPage( WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnViewItemLink(){itemLink.click();}
    public void clickOnViewCartLink(){viewCartLink.click();}
    public boolean productInCartDisplayed(){
        boolean display = productInCart.isDisplayed();
        return display;
    }
    }
