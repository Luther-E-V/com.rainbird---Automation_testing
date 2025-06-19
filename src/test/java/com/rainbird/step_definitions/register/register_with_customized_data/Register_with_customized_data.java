package com.rainbird.step_definitions.register.register_with_customized_data;

import com.microsoft.playwright.Page;
import com.rainbird.pages.login_page.Login;
import com.rainbird.pages.register_page.Register;
import com.rainbird.playwright_config.Playwright_Config;
import com.rainbird.utils.actions.Actions;
import com.rainbird.utils.check.Check;
import com.rainbird.utils.processor.Processor;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Register_with_customized_data {

    Page page = Playwright_Config.getPage();
    Login login = new Login();
    Register register = new Register();
    Register.Account_Information account_infor = new Register.Account_Information();
    Register.Terms_of_license license = new Register.Terms_of_license();
    Register.Contact_and_Login_Information register_login = new Register.Contact_and_Login_Information();
    Register.Email_Verification verification = new Register.Email_Verification();
    Actions action = new Actions();
    Check check = new Check();
    Processor processor = new Processor();

    @When("User fill out {string} as Country")
    public void user_fill_out_country(String country){
        try {
            Thread.sleep(1000);
            System.out.println("* SELECT COUNTRY field:");
            check.Result_evaluation(check.Visibility_check(account_infor.select_country_label),"SELECT COUNTRY label is VISIBLE","SELECT COUNTRY label is INVISIBLE");
            check.Result_evaluation(check.Availability_check(account_infor.select_country),"SELECT COUNTRY field is CLICKABLE","SELECT COUNTRY field is DISABLED");
            Thread.sleep(1000);
            System.out.println("* SELECT STATE field:");
            check.Result_evaluation(check.Visibility_check(account_infor.select_state_label),"STATE label is VISIBLE","STATE label is INVISIBLE");
            check.Result_evaluation(check.Availability_check(account_infor.select_state),"STATE field should not be CLICKABLE before United States is selected","STATE field is DISABLED when United States is UNSELECTED");
            Thread.sleep(1000);
            action.Select(account_infor.select_country,country);
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as Timezone")
    public void timezone(String timezone){
        try {
            Thread.sleep(1000);
            System.out.println("* SELECT TIMEZONE field:");
            check.Result_evaluation(check.Visibility_check(account_infor.select_timezone_label),"TIMEZONE label is VISIBLE","TIMEZONE label is INVISIBLE");
            Thread.sleep(1000);
            action.Select(account_infor.select_timezone,timezone);
        } catch (InterruptedException e){}
    }

    @And("User fill out {string} as Account Name")
    public void user_fill_out_account_name(String account_name){
        try {
            Thread.sleep(1000);
            action.Fill_in(account_infor.account_name,account_name);
            processor.Retrieve_value_input(account_infor.account_name,"Account name");
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as Address")
    public void user_fill_out_address(String address){
        try {
            Thread.sleep(1000);
            action.Fill_in(account_infor.address,address);
            processor.Retrieve_value_input(account_infor.address,"Address");
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as City")
    public void user_fill_out_city(String city){
        try {
            Thread.sleep(1000);
            action.Fill_in(account_infor.city,city);
            processor.Retrieve_value_input(account_infor.city,"City");
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as Postal Code")
    public void user_fill_out_postal_code(String postal_code){
        try {
            Thread.sleep(1000);
            action.Fill_in(account_infor.postal_code,postal_code);
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as State")
    public void state(String state) {
        try {
            String country_option_value = processor.Get_selected_option_text(account_infor.select_country);
            if (country_option_value.equalsIgnoreCase("united states")){
                Thread.sleep(1000);
                System.out.println("* SELECT STATE field:");
                check.Result_evaluation(check.Availability_check(account_infor.select_state),"STATE field should be CLICKABLE when SELECT COUNTRY is \"United States\"","STATE field should be DISABLED when SELECT COUNTRY is not \"United States\"");
                action.Select(account_infor.select_state, state);
            }
            action.Screenshot("Account_Information_Section");
        } catch (InterruptedException e) {
        }
    }
    @And("User fill out {string} as Contact Name")
    public void user_fill_out_contact_name(String contact_name){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.contact_name,contact_name);
            processor.Retrieve_value_input(register_login.contact_name,"Contact name");
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as Phone Number")
    public void user_fill_out_phone_number(String phone_number){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.phone_number,phone_number);
            processor.Retrieve_value_input(register_login.phone_number,"Phone number");
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as Email")
    public void user_fill_out_email(String email){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.email,email);
            processor.Retrieve_value_input(register_login.email,"Email");
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as Confirm Email")
    public void user_fill_out_confirm_email(String confirm_email){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.confirm_email,confirm_email);
            processor.Retrieve_value_input(register_login.confirm_email,"Confirm email");
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as Password")
    public void user_fill_out_password(String password){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.password,password);
            processor.Retrieve_value_input(register_login.password,"Password");
            Thread.sleep(1000);
            check.Availability_check(register_login.password_eye_icon_on);
            action.Click(register_login.password_eye_icon_on);
        } catch (InterruptedException e){}
    }
    @And("User fill out {string} as Confirm Password")
    public void user_fill_out_confirm_password(String confirm_password){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.confirm_password,confirm_password);
            processor.Retrieve_value_input(register_login.confirm_password,"Confirm password");
            Thread.sleep(1000);
            check.Availability_check(register_login.confirm_password_eye_icon_on);
            action.Click(register_login.confirm_password_eye_icon_on);
            Thread.sleep(1000);
            System.out.println("* User's account information:\n" + " ");
            processor.Get_user_register_information();
            action.Screenshot("Contact and Login Information");
        } catch (InterruptedException e){}
    }
}
