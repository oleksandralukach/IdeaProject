package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class SignInPage {

    public SignInPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='login']")
    public WebElement buttonSignIn;

    @FindBy(xpath = "(//*[@class='is_required validate account_input form-control'])[1]")
    public WebElement inputFieldEmailAddress;

    @FindBy(xpath = "(//*[@class='is_required validate account_input form-control'])[2]")
    public WebElement inputFieldEmailAddressExistAccount;

    @FindBy(xpath = " //*[@id=\"passwd\"]")
    public WebElement inputFieldPasswordExistAccount;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]")
    public WebElement buttonCreateAccount;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]\n")
    public WebElement buttonSubmitLogin;

    @FindBy(xpath = "//*[@id=\"id_gender1\"]")
    public WebElement radioButtonGender1;

    @FindBy(xpath = "//*[@id=\"customer_firstname\"]")
    public WebElement inputFieldFirstName;

    @FindBy(xpath = "//*[@id=\"customer_lastname\"]")
    public WebElement inputFieldSecondName;

    @FindBy(xpath = "//*[@id=\"passwd\"]\n")
    public WebElement inputFieldPassword;

    @FindBy(xpath = "//*[@id=\"days\"]")
    public WebElement dropdownDay;

    @FindBy(xpath = "//*[@id=\"months\"]")
    public WebElement dropdownMonth;

    @FindBy(xpath = "//*[@id=\"years\"]")
    public WebElement dropdownYear;

    public void dateOfBirth() {

        WebElement day = dropdownDay;
        day.click();

        Select dropdownDay = new Select(day);
        dropdownDay.selectByValue("10");

        WebElement month = dropdownMonth;
        day.click();

        Select dropdownMonth = new Select(month);
        dropdownMonth.selectByValue("5");

        WebElement year = dropdownYear;
        day.click();

        Select dropdownYear = new Select(year);
        dropdownYear.selectByValue("1975");

    }

    @FindBy(xpath = "//*[@id=\"newsletter\"]")
    public WebElement checkboxSignUpNewSletter;

    @FindBy(xpath = "//*[@id=\"optin\"]")
    public WebElement checkboxReceiveSpecialOffers;

    @FindBy(xpath = "//*[@id=\"firstname\"]")
    public WebElement inputFieldAddressName;

    @FindBy(xpath = "//*[@id=\"lastname\"]")
    public WebElement inputFieldAddressLastName;

    @FindBy(xpath = "//*[@id=\"address1\"]\n")
    public WebElement inputFieldAddress;

    @FindBy(xpath = "//*[@id=\"city\"]")
    public WebElement inputFieldCity;

    @FindBy(xpath = "//*[@id=\"id_state\"]")
    public WebElement dropdownState;

    @FindBy(xpath = "//*[@id=\"id_country\"]")
    public WebElement dropdownCountry;

    @FindBy(xpath = "//*[@id=\"postcode\"]")
    public WebElement inputFieldZipCode;


    public void location() {

        WebElement state = dropdownState;
        state.click();

        Select dropdownState = new Select(state);
        dropdownState.selectByIndex(2);

        WebElement country = dropdownCountry;
        country.click();

        Select dropdownCountry = new Select(country);
        dropdownCountry.selectByIndex(1);
    }

    @FindBy(xpath = "//*[@id=\"phone_mobile\"]")
    public WebElement inputFieldMobilePhoneNumber;

    @FindBy(xpath = "//*[@id=\"alias\"]\n")
    public WebElement inputFieldAliasAddress;

    @FindBy(xpath = "//*[@id=\"submitAccount\"]\n")
    public WebElement buttonRegister;

}