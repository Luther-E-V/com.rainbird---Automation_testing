package com.rainbird.step_definitions;

import com.microsoft.playwright.Page;
import com.rainbird.pages.Login_page;
import com.rainbird.pages.Register;
import com.rainbird.playwright_config.Playwright_Config;
import com.rainbird.utils.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.image.RGBImageFilter;

public class Step_definition_register {

    Login_page login = new Login_page();
    Register register = new Register();
    Register.Account_Information account_infor = new Register.Account_Information();
    Register.Terms_of_license license = new Register.Terms_of_license();
    Register.Contact_and_Login_Information register_login = new Register.Contact_and_Login_Information();
    Register.Email_Verification verification = new Register.Email_Verification();
    Actions action = new Actions();
    Check check = new Check();


    @When("User click CREATE ACCOUNT")
    public void user_click_create_an_account() {
        try {
            Thread.sleep(1000);
            check.Result_evaluation_check(check.Visibility_check(login.create_account),"CREATE ACCOUNT link text is VISIBLE","Create an account link text is INVISIBLE");
            check.Result_evaluation_check(check.Availability_check(login.create_account),"CREATE ACCOUNT link text is CLICKABLE","CREATE ACCOUNT link text is DISABLED");
            action.Click(login.create_account);
        } catch (InterruptedException e){}
    }

    @Then("User is navigated to Term of licence page")
    public void user_is_navigated_to_term_of_licence_page() {
        try {
            Thread.sleep(1000);
            check.Result_evaluation_check(check.Existence_check(license.term_of_licence_content),"User is NAVIGATED to Term of licence page","User is NOT NAVIGATED to Term of licence page");
        } catch (InterruptedException e){}
    }
    @When("User read and click consent checkbox")
    public void user_read_and_click_consent_checkbox() {
        try {
            Thread.sleep(1000);
            check.Result_evaluation_check(check.Visibility_check(license.terms_agreement_checkbox),"Checkbox is VISIBLE","Checkbox is INVISIBLE");
            check.Result_evaluation_check(check.Availability_check(license.terms_agreement_checkbox),"Checkbox is CLICKABLE","Checkbox is DISABLED");
            Thread.sleep(1000);
            action.Click(license.terms_agreement_checkbox);
            check.Result_evaluation_check(check.boxCheck_check(license.terms_agreement_checkbox),"Checkbox is CLICKED","Checkbox is NOT CLICKED");
            Thread.sleep(1000);
            check.Result_evaluation_check(check.Availability_check(license.accept_button),"ACCEPT button is CLICKABLE","ACCEPT button is DISABLED");
            action.Click(license.accept_button);
        } catch (InterruptedException e){}
    }
    @Then("User is navigated to Registration page")
    public void user_is_navigated_to_registration_page() {
        try {
            Thread.sleep(1000);
            check.Result_evaluation_check(check.Visibility_check(register.registration_title_text),"User is NAVIGATED to Registration page","User is NOT NAVIGATED to Registration page");
        } catch (InterruptedException e){}
    }
    @When("User fill out {string} as Country and {string} as Timezone and {string} as State")
    public void user_fill_out_country_timezone_and_state(String country, String timezone, String state){
        try {
            Thread.sleep(1000);
            check.Result_evaluation_check(check.Visibility_check(account_infor.select_country_label),"SELECT COUNTRY label is VISIBLE","SELECT COUNTRY label is INVISIBLE");
            check.Result_evaluation_check(check.Availability_check(account_infor.select_country),"SELECT COUNTRY field is CLICKABLE","SELECT COUNTRY field is DISABLED");
            Thread.sleep(1000);
            check.Result_evaluation_check(check.Visibility_check(account_infor.state_label),"STATE label is VISIBLE","STATE label is INVISIBLE");
            check.Result_evaluation_check(check.Availability_check(account_infor.state),"STATE field should not be CLICKABLE before United States is selected","STATE field is DISABLED when United States is UNSELECTED");
            Thread.sleep(1000);
            check.Result_evaluation_check(check.Visibility_check(account_infor.select_timezone_label),"TIMEZONE label is VISIBLE","TIMEZONE label is INVISIBLE");
            Thread.sleep(1000);
            action.Select(account_infor.select_country,country);
            action.Select(account_infor.select_timezone,timezone);
            if (country.equalsIgnoreCase("United States")){
                check.Result_evaluation_check(check.Availability_check(account_infor.state),"STATE field should be CLICKABLE when SELECT COUNTRY is \"United States\"","STATE field should be DISABLED when SELECT COUNTRY is not \"United States\"");
                action.Select(account_infor.state,state);
            }
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as Account Name and {string} as Address")
    public void user_fill_out_account_name_and_address(String account_name, String address){
        try {
            Thread.sleep(1000);
            action.Fill_in(account_infor.account_name,account_name);
            action.Retrieve_value_input(account_infor.account_name,"Account name");
            action.Fill_in(account_infor.address,address);
            action.Retrieve_value_input(account_infor.address,"Address");
            action.getUser_register_information();
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as City and {string} as Postal Code")
    public void user_fill_out_city_and_postal_code(String city, String postal_code){
        try {
            Thread.sleep(1000);
            action.Fill_in(account_infor.city,city);
            action.Retrieve_value_input(account_infor.city,"City");
            action.Fill_in(account_infor.postal_code,postal_code);
            action.getUser_register_information();
            action.Screenshot("Account_Information");
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as Contact Name and {string} as Phone Number")
    public void user_fill_out_contact_name_and_phone_number(String contact_name, String phone_number){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.contact_name,contact_name);
            action.Retrieve_value_input(register_login.contact_name,"Contact name");
            action.Fill_in(register_login.phone_number,phone_number);
            action.Retrieve_value_input(register_login.phone_number,"Phone number");
            action.getUser_register_information();
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as Email and {string} as Confirm Email")
    public void user_fill_out_email_and_confirm_email(String email, String confirm_email){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.email,email);
            action.Retrieve_value_input(register_login.email,"Email");
            action.Fill_in(register_login.confirm_email,confirm_email);
            action.Retrieve_value_input(register_login.confirm_email,"Confirm email");
            action.getUser_register_information();
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as User Name")
    public void user_fill_out_username(String username){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.username,username);
            action.Retrieve_value_input(register_login.username,"Username");
            action.getUser_register_information();
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as Password and {string} as Confirm Password")
    public void user_fill_out_password_and_confirm_password(String password, String confirm_password){
        try {

            action.Fill_in(register_login.password,"Demotesting131313@");
            action.Retrieve_value_input(register_login.password,"Password");
            Thread.sleep(1000);
            check.Availability_check(register_login.password_eye_icon_on);
            action.Click(register_login.password_eye_icon_on);
            Thread.sleep(1000);
            action.Fill_in(register_login.confirm_password,"Demotesting131313@");
            action.Retrieve_value_input(register_login.confirm_password,"Confirm password");
            Thread.sleep(1000);
            check.Availability_check(register_login.confirm_password_eye_icon_on);
            action.Click(register_login.confirm_password_eye_icon_on);
            Thread.sleep(1000);
            action.Screenshot("Contact and Login Information");
        } catch (InterruptedException e){}
    }
    @When("User click Required field checkbox")
    public void user_click_required_field_checkbox() {
        try {
            Thread.sleep(1000);
            check.Result_evaluation_check(check.Availability_check(account_infor.required_field_consent_checkbox),"Required field checkbox is not CHECKED before CLICKED","ERROR FOUND. Required field checkbox is CHECKED BEFORE CLICKED");
            action.Click(account_infor.required_field_consent_checkbox);
            check.Result_evaluation_check(check.Availability_check(account_infor.required_field_consent_checkbox),"Required field checkbox is CHECKED àter CLICKED","ERROR FOUND. Required field checkbox is CHECKED BEFORE CLICKED");
        } catch (InterruptedException e){}
    }
    @And("User click Register button")
    public void u_ser_click_register_button() {
        try {
            Thread.sleep(1000);
            check.Result_evaluation_check(check.Availability_check(account_infor.register_button),"Register button is CLICKABLE","Register button is DISABLED");
            action.Click(account_infor.register_button);
        } catch (InterruptedException e){}
    }
    @Then("User should be navigated to Email Verification page")
    public void user_should_be_navigated_to_email_verification_page(){
        try {
            Thread.sleep(1000);
            check.Result_evaluation_check(check.Visibility_check(verification.title),"User is navigated to Email Verification page","User is NOT navigated to Email Verification page");
            check.Result_evaluation_check(check.Visibility_check(verification.confirm_with_email),"Confirm with Email is VISIBLE","Confirm with Email is INVISIBLE");
            check.Result_evaluation_check(check.Visibility_check(verification.confirm_instruction),"Confirm Instruction is VISIBLE","Confirm Instruction is INVISIBLE");
            check.Result_evaluation_check(check.Visibility_check(verification.resend_request),"Resend Request is VISIBLE","Resend Request is INVISIBLE");
            check.Result_evaluation_check(check.Existence_check(verification.resend_button),"Resend button EXISTS","Resend button NOT FOUND");
            check.Result_evaluation_check(check.Availability_check(verification.resend_button),"Resend button is CLICKABLE","Resend button is UNCLICKABLE");
            action.Screenshot("Email_Verification_page");

        } catch (InterruptedException e){}
    }
    @Given("User access to Email page")
    public void user_access_to_email_page(){
        Page page = Playwright_Config.getPage();
        try {
            Thread.sleep(20000);
            page.navigate("https://gmail.com");
            System.out.println("Observing");
        } catch (InterruptedException e){}
    }
    @When("User follow steps and confirm Email address")
    public void user_follow_steps_and_confirm_email_address(){
        try {
            Thread.sleep(20000);
            System.out.println("Observing");

        } catch (InterruptedException e){}
    }
    @Then("User is redirected to page")
    public void user_is_redirected_to_page(){
        try {
            Thread.sleep(10000);
            System.out.println("Observing");
        } catch (InterruptedException e){}
    }
}
