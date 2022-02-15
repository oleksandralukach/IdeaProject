package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MyStepdefs {
    private WebDriver driver;

    private final String LOGIN_PAGE_URL = "http://3.129.60.236:8080/bank/login";
    private final String HOME_PAGE_URL = "http://3.20.225.112:8080/bank//home";
    private final String SIGNUP_PAGE_URL = "http://3.20.225.112:8080/bank/signup";

        @Given("^User navigates to Digital Bank login page$")
    public void user_navigates_to_Digital_Bank_login_page() throws Throwable {
                driver = Driver.getDriver();
                driver.get(LOGIN_PAGE_URL);
                assertEquals("Failed: URL mismatch", LOGIN_PAGE_URL, driver.getCurrentUrl());
    }
    @Given("Verify that web title is {string}")
    public void verify_that_web_title_is(String expectedTitle) throws Throwable {

            assertEquals("Failed: Title mismatch",expectedTitle, driver.getTitle());
    }

    @When("User logs in with following credentials")
    public void user_logs_in_with_following_credentials(io.cucumber.datatable.DataTable dataTable) {
        WebElement userName = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        List<Map<String, String>> creds = dataTable.asMaps(String.class, String.class);
        userName.sendKeys(creds.get(0).get("username"));
        password.sendKeys(creds.get(0).get("password"));
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
    }
    @Then("User successfully logged in to home page")
    public void user_successfully_logged_in_to_home_page() throws Throwable {
        assertEquals("Failed: URL mismatch",HOME_PAGE_URL, driver.getCurrentUrl());
    }


}
