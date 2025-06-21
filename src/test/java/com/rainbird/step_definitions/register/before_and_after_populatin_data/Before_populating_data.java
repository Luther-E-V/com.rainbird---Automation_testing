package com.rainbird.step_definitions.register.before_and_after_populatin_data;

import com.rainbird.pages.login_page.Login;
import com.rainbird.pages.register_page.Register;
import com.rainbird.utils.actions.Actions;
import com.rainbird.utils.check.Check;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Before_populating_data {

    Register register = new Register();
    Register.Terms_of_license license = new Register.Terms_of_license();
    Actions action = new Actions();
    Check check = new Check();
    Login login = new Login();

    //CLICK REGISTER LINK TEXT
    @When("User click CREATE ACCOUNT")
    public void user_click_create_an_account() {
        try {
            Thread.sleep(1000);
            System.out.println("* Create Account link text: ");
            check.evaluateResult(check.checkAvailability(login.create_account),"CREATE ACCOUNT link text is CLICKABLE","CREATE ACCOUNT link text is DISABLED");
            action.click(login.create_account);
        } catch (InterruptedException e){}
    }

    @Then("User is navigated to Term of licence page")
    public void user_is_navigated_to_term_of_licence_page() {
        try {
            Thread.sleep(1000);
            System.out.println("* Term of licence content: ");
            check.evaluateResult(check.checkExistence(license.term_of_licence_content),"User is NAVIGATED to Term of licence page","User is NOT NAVIGATED to Term of licence page");
        } catch (InterruptedException e){}
    }
    @When("User read and click consent checkbox")
    public void user_read_and_click_consent_checkbox() {
        try {
            Thread.sleep(1000);
            System.out.println("* Terms agreement checkbox: ");
            check.evaluateResult(check.checkVisibility(license.terms_agreement_checkbox),"Checkbox is VISIBLE","Checkbox is INVISIBLE");
            check.evaluateResult(check.checkAvailability(license.terms_agreement_checkbox),"Checkbox is CLICKABLE","Checkbox is DISABLED");
            Thread.sleep(1000);
            action.click(license.terms_agreement_checkbox);
            check.evaluateResult(check.checkBoxCheck(license.terms_agreement_checkbox),"Checkbox is CLICKED","Checkbox is NOT CLICKED");
            Thread.sleep(1000);
            System.out.println("* Accept button: ");
            check.evaluateResult(check.checkAvailability(license.accept_button),"ACCEPT button is CLICKABLE","ACCEPT button is DISABLED");
            action.click(license.accept_button);
        } catch (InterruptedException e){}
    }
    @Then("User is navigated to Registration page")
    public void user_is_navigated_to_registration_page() {
        try {
            Thread.sleep(1000);
            System.out.println("* Registration title text:");
            check.evaluateResult(check.checkVisibility(register.registration_title_text),"User is NAVIGATED to Registration page","User is NOT NAVIGATED to Registration page");
        } catch (InterruptedException e){}
    }
}
