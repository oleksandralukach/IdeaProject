package step_defs;

import com.github.javafaker.Faker;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.MyAccountPage;
import pages.SignInPage;
import utilities.Driver;

import java.util.Locale;

public class SignInPageSteps {

    WebDriver driver = Driver.getDriver();
    SignInPage sign = new SignInPage();
    MyAccountPage accountPage = new MyAccountPage();

    @Given("^I am on home page$")
    public void i_am_on_home_page() {

        driver.get("http://automationpractice.com/index.php");
    }

    @When("^I click Sign in button$")
    public void i_click_Sign_in_button() {

        sign.buttonSignIn.click();
    }

    @When("^I enter email to create account$")
    public void i_enter_email_to_create_account() {
        Faker faker = new Faker();
        String fakeEmail = faker.internet().emailAddress();
        sign.inputFieldEmailAddress.sendKeys(fakeEmail);
    }

    @When("^I click Create an Account button$")
    public void i_click_Create_an_Account_button() {
        sign.buttonCreateAccount.click();
    }

    @Then("^I fill up personal information$")
    public void i_fill_up_personal_information() {
        sign.radioButtonGender1.click();

        Faker faker = new Faker();
        String fakeName = faker.name().firstName();
        String fakeLastName = faker.name().lastName();

        sign.inputFieldFirstName.sendKeys(fakeName);
        sign.inputFieldSecondName.sendKeys(fakeLastName);
        sign.inputFieldPassword.sendKeys("Doe1234");
        sign.dateOfBirth();
        sign.checkboxSignUpNewSletter.click();
        sign.checkboxReceiveSpecialOffers.click();
    }

    @Then("^I fill up address information$")
    public void i_fill_up_address_information() {
        sign.inputFieldAddress.sendKeys("Main street 456");
        sign.inputFieldCity.sendKeys("Bloomfield");
        sign.inputFieldZipCode.sendKeys("60020");
        sign.location();
        sign.inputFieldMobilePhoneNumber.sendKeys("6307418733");
        sign.inputFieldAliasAddress.sendKeys("Main street 456");
        sign.buttonRegister.click();
    }

    @Then("^I verify title \"([^\"]*)\"$")
    public void i_verify_title(String title) {
        String text = accountPage.titleMyAccount.getText().trim().toLowerCase();
        Assert.assertEquals("not equal", title.trim().toLowerCase(),text);
    }
}
