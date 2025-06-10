package com.rainbird.step_definitions;

import com.rainbird.pages.Login_page;
import com.rainbird.pages.Register;
import com.rainbird.utils.Actions;
import com.rainbird.playwright_config.Playwright_Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class Step_definition {
    Login_page login = new Login_page();
    Register register = new Register();
    Actions action = new Actions();
    @Given("User access to page")
    public void user_access_to_page() {
        Playwright_Config.Navigation();
    }
    @When("User click Create an account")
    public void user_click_create_an_account() {
        action.Click(login.create_account);
    }
    @Then("User is navigated to Term of licence page")
    public void user_is_navigated_to_term_of_licence_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User read and click consent checkbox")
    public void user_read_and_click_consent_checkbox() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User is navigated to Registration page")
    public void user_is_navigated_to_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("User fills out registration form")
    public void user_fills_out_registration_form() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User click Required field checkbox")
    public void user_click_required_field_checkbox() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("User click Register button")
    public void u_ser_click_register_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
