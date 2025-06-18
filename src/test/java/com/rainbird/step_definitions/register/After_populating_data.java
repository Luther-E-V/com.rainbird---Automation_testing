package com.rainbird.step_definitions.register;

import com.rainbird.pages.register_page.Register;
import com.rainbird.utils.actions.Actions;
import com.rainbird.utils.check.Check;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class After_populating_data {

    Register.Email_Verification verification = new Register.Email_Verification();
    Register.Account_Information account_infor = new Register.Account_Information();
    Actions action = new Actions();
    Check check = new Check();

    @When("User click Required field checkbox")
    public void user_click_required_field_checkbox() {
        try {
            Thread.sleep(1000);
            check.Result_evaluation(check.Availability_check(account_infor.required_field_consent_checkbox),"Required field checkbox is not CHECKED before CLICKED","ERROR FOUND. Required field checkbox is CHECKED BEFORE CLICKED");
            action.Click(account_infor.required_field_consent_checkbox);
            check.Result_evaluation(check.Availability_check(account_infor.required_field_consent_checkbox),"Required field checkbox is CHECKED àter CLICKED","ERROR FOUND. Required field checkbox is CHECKED BEFORE CLICKED");
        } catch (InterruptedException e){}
    }
    @And("User click Register button")
    public void u_ser_click_register_button() {
        try {
            Thread.sleep(1000);
            check.Result_evaluation(check.Availability_check(account_infor.register_button),"Register.feature button is CLICKABLE","Register.feature button is DISABLED");
            action.Click(account_infor.register_button);
        } catch (InterruptedException e){}
    }
    @Then("User should be navigated to Email Verification page")
    public void user_should_be_navigated_to_email_verification_page(){
        try {
            Thread.sleep(1000);
            check.Result_evaluation(check.Visibility_check(verification.title),"User is navigated to Email Verification page","User is NOT navigated to Email Verification page");
            check.Result_evaluation(check.Visibility_check(verification.confirm_with_email),"Confirm with Email is VISIBLE","Confirm with Email is INVISIBLE");
            check.Result_evaluation(check.Visibility_check(verification.confirm_instruction),"Confirm Instruction is VISIBLE","Confirm Instruction is INVISIBLE");
            check.Result_evaluation(check.Visibility_check(verification.resend_request),"Resend Request is VISIBLE","Resend Request is INVISIBLE");
            check.Result_evaluation(check.Existence_check(verification.resend_button),"Resend button EXISTS","Resend button NOT FOUND");
            check.Result_evaluation(check.Availability_check(verification.resend_button),"Resend button is CLICKABLE","Resend button is UNCLICKABLE");
            action.Screenshot("Email_Verification_page");

        } catch (InterruptedException e){}
    }
}
