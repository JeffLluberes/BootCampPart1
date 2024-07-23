package Pages;

import Utilities.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    public WebDriver driver;

    @FindBy(name = "firstname")
    private WebElement FirstNameFieldBox;

    @FindBy(name = "lastname")
    private WebElement LastNameFieldBox;

    @FindBy(name = "email")
    private WebElement emailFieldBox;

    @FindBy(name = "telephone")
    private WebElement telephoneFieldBox;

    @FindBy(name = "password")
    private WebElement passwordFieldBox;

    @FindBy(name = "confirm")
    private WebElement confirmPasswordFieldBox;

    @FindBy (name = "agree")
    private WebElement privacyPolicyConfirm;

    @FindBy (css  = "input.btn.btn-primary")
    private WebElement clickOnContinue;




    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void enterFirstNameIntoFieldBox(String firstNameText){
        FirstNameFieldBox.sendKeys(firstNameText);
    }
    public void enterLastNameIntoFieldBox(String lastNameText){
        LastNameFieldBox.sendKeys(lastNameText);
    }
    public void enterEmailIntoFieldBox(){
        emailFieldBox.sendKeys(utils.emailWithDateTimeStamp());
    }
    public void enterTelephoneIntoFieldBox(String telephoneText){
        emailFieldBox.sendKeys(telephoneText);
    }
    public void enterPasswordIntoFieldBox(String passwordText){
        passwordFieldBox.sendKeys(passwordText);
    }
    public void enterConfirmPasswordIntoFieldBox(String confirmPasswordText){
        confirmPasswordFieldBox.sendKeys(confirmPasswordText);
    }
    public void clickOnPrivacyPolicyCheckBox(){privacyPolicyConfirm.click();}
    public void clickOnContinueButton(){clickOnContinue.click();}
}