package com.rainbird.step_definitions.register.before_and_after_populatin_data;

import com.rainbird.pages.register_page.Register;
import com.rainbird.utils.actions.Actions;
import com.rainbird.utils.check.Check;
import com.rainbird.utils.processor.Processor;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class After_populating_data {

    Register.Email_Verification verification = new Register.Email_Verification();
    Register.Account_Information account_infor = new Register.Account_Information();
    Actions action = new Actions();
    Check check = new Check();
    Processor processor = new Processor();
    @And("User click Required field checkbox")
    public void user_click_required_field_checkbox() {
        try {
            Thread.sleep(1000);
            System.out.println("* Required field checkbox:");
            check.evaluateResult(check.checkAvailability(account_infor.required_field_consent_checkbox),"Required field checkbox is not CHECKED before CLICKED","ERROR FOUND. Required field checkbox is CHECKED BEFORE CLICKED");
            action.click(account_infor.required_field_consent_checkbox);
            check.evaluateResult(check.checkAvailability(account_infor.required_field_consent_checkbox),"Required field checkbox is CHECKED after CLICKED","ERROR FOUND. Required field checkbox is CHECKED BEFORE CLICKED");
        } catch (InterruptedException e){}
    }
    @And("User click Register button")
    public void user_click_register_button() {
        try {
            Thread.sleep(1000);
            System.out.println("* Register button:");
            check.evaluateResult(check.checkAvailability(account_infor.register_button),"Register button is CLICKABLE","Register button is DISABLED");
            action.click(account_infor.register_button);
        } catch (InterruptedException e){}
    }
    @Then("User should be navigated to Email Verification page")
    public void user_should_be_navigated_to_email_verification_page(){
        try {
            Thread.sleep(1000);
            System.out.println("* Verification page title:");
            check.evaluateResult(check.checkVisibility(verification.title),"User is navigated to Email Verification page","User is NOT navigated to Email Verification page");
            System.out.println("* Confirm Email text:");
            check.evaluateResult(check.checkVisibility(verification.confirm_with_email),"Confirm with Email is VISIBLE","Confirm with Email is INVISIBLE");
            System.out.println("* Confirm Instruction text:");
            check.evaluateResult(check.checkVisibility(verification.confirm_instruction),"Confirm Instruction is VISIBLE","Confirm Instruction is INVISIBLE");
            System.out.println("* Resend Request:");
            check.evaluateResult(check.checkVisibility(verification.resend_request),"Resend Request is VISIBLE","Resend Request is INVISIBLE");
            System.out.println("* Resend button:");
            check.evaluateResult(check.checkExistence(verification.resend_button),"Resend button EXISTS","Resend button NOT FOUND");
            check.evaluateResult(check.checkAvailability(verification.resend_button),"Resend button is CLICKABLE","Resend button is UNCLICKABLE");
            System.out.println("- Email receiving verification: \n" + "  " + processor.getVerifiedEmail());
            action.Screenshot("Email_Verification_page");

        } catch (InterruptedException e){}
    }
}
