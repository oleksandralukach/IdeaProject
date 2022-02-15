package com.automation.stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class StepDefinition2 {

    @Given("user opens website")
    public void openWebsite() {
        System.out.println("Opening website");
    }

    @And("user is on login page")
    public void verifyLoginPage() {
        System.out.println("On login page");
    }

    @When("user enters username {string} and password {string}")
    public void doLogin(String string, String string2) {
        System.out.println("logging in");
    }

    @And("click on login button")
    public void clickLoginButton() {
    }

    @Then("verify user is navigated to homepage")
    public void verifyHomePage() {
    }

    @When("user hover mouse on Pim menu")
    public void hoverOnPimMenu() {
    }

    @When("click on Add Employee Button")
    public void clickAddEmployeeButton() {
    }

    @Then("verify user is navigated to add employee page")
    public void verifyAddEmployeePage() {
    }

    @When("user enters valid details on add employee page")
    public void fillEmployeePage() {
    }

    @When("click on save button")
    public void clickSaveButton() {
    }

    @Then("user is navigated to personal detailed page")
    public void verifyPersonalDetailedPage() {
    }

    @Then("verify error message for missing name and last name")
    public void verify_error_message_for_missing_name_and_last_name() {
    }

    @Then("verify user is not navigated to homepage")
    public void verify_user_is_not_navigated_to_homepage() {
    }

    @Then("verify message {string} is displayed")
    public void verify_message_is_displayed(String string) {
    }

    @When("user clicks on user badge icon")
    public void user_clicks_on_user_badge_icon() {
    }

    @When("select logout option")
    public void select_logout_option() {
    }

    @Then("user close the browser")
    public void user_close_the_browser() {
    }

    @Then("error message is displayed")
    public void error_message_is_displayed() {
    }

    @Then("verify table has below data")
    public void verifyTableHasBelowData(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists();
        //System.out.println(data.get(2).get(1));

        //System.out.println(dataTable.cells().get(2).get(1)); //printing cell on row index 2, column index 1
        System.out.println(dataTable.cells()); //printing the rows

//        for (int i = 0; i < data.size(); i++) {
//            for (int j = 0; j < data.get(i).size(); j++) {
//                System.out.print(data.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }
    }

    @Then("verify another table data")
    public void verifyAnotherTableData(List<String> listOfData) {
        for (String e : listOfData) {
            System.out.println(e + " ");
        }
    }
}

//    public void thefollowingInvoices(DataTable dataTable){
//     //Data table object stores rows and columns from feature file data table.
//        Sout(dataTable.cells()); //printing the rows
//        Sout(dataTable.cells().get(2).get(1)); //first row than column
//
//        List<Map<String,String>> invoices = dataTable.asMaps(String.class, String.class);
//
//        for(List<Map<String,String>>invoice : invoices){
//            Invoice invoice1 = new Invoice(Double.parseDouble(invoice.get(“amount”)), invoice.get(“name”);
//            invoiceList.add(invoice1);
//        }
//
//    }
