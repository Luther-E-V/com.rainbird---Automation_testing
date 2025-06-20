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
            check.Result_evaluation(check.Availability_check(account_infor.required_field_consent_checkbox),"Required field checkbox is not CHECKED before CLICKED","ERROR FOUND. Required field checkbox is CHECKED BEFORE CLICKED");
            action.Click(account_infor.required_field_consent_checkbox);
            check.Result_evaluation(check.Availability_check(account_infor.required_field_consent_checkbox),"Required field checkbox is CHECKED after CLICKED","ERROR FOUND. Required field checkbox is CHECKED BEFORE CLICKED");
        } catch (InterruptedException e){}
    }
    @And("User click Register button")
    public void u_ser_click_register_button() {
        try {
            Thread.sleep(1000);
            System.out.println("* Register button:");
            check.Result_evaluation(check.Availability_check(account_infor.register_button),"Register button is CLICKABLE","Register button is DISABLED");
            action.Click(account_infor.register_button);
        } catch (InterruptedException e){}
    }
    @Then("User should be navigated to Email Verification page")
    public void user_should_be_navigated_to_email_verification_page(){
        try {
            Thread.sleep(1000);
            System.out.println("* Verification page title:");
            check.Result_evaluation(check.Visibility_check(verification.title),"User is navigated to Email Verification page","User is NOT navigated to Email Verification page");
            System.out.println("* Confirm Email text:");
            check.Result_evaluation(check.Visibility_check(verification.confirm_with_email),"Confirm with Email is VISIBLE","Confirm with Email is INVISIBLE");
            System.out.println("* Confirm Instruction text:");
            check.Result_evaluation(check.Visibility_check(verification.confirm_instruction),"Confirm Instruction is VISIBLE","Confirm Instruction is INVISIBLE");
            System.out.println("* Resend Request:");
            check.Result_evaluation(check.Visibility_check(verification.resend_request),"Resend Request is VISIBLE","Resend Request is INVISIBLE");
            System.out.println("* Resend button:");
            check.Result_evaluation(check.Existence_check(verification.resend_button),"Resend button EXISTS","Resend button NOT FOUND");
            check.Result_evaluation(check.Availability_check(verification.resend_button),"Resend button is CLICKABLE","Resend button is UNCLICKABLE");
            System.out.println("- Email receiving verification: \n" + "  " + processor.Email_receive_verification());
            action.Screenshot("Email_Verification_page");

        } catch (InterruptedException e){}
    }
}
