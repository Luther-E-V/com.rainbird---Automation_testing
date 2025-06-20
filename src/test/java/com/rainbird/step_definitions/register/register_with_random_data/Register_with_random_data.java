package com.rainbird.step_definitions.register.register_with_random_data;

import com.rainbird.utils.custom_data.Generate_random_value;
import com.rainbird.pages.register_page.Register;
import com.rainbird.utils.actions.Actions;
import com.rainbird.utils.check.Check;
import com.rainbird.utils.processor.Processor;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Register_with_random_data {

    Register.Account_Information account_infor = new Register.Account_Information();
    Register.Terms_of_license license = new Register.Terms_of_license();
    Register.Contact_and_Login_Information register_login = new Register.Contact_and_Login_Information();
    Register.Email_Verification verification = new Register.Email_Verification();
    Generate_random_value random = new Generate_random_value();
    Actions action = new Actions();
    Check check = new Check();
    Processor processor = new Processor();

    @When("User fill out Country")
    public void user_fill_out_country(){
        int country_random_xpath = account_infor.Select_country_by_random_index_value();
        String country_opt_value = processor.Get_selected_option_text(account_infor.select_country);
        try {
            Thread.sleep(1000);
            System.out.println("* SELECT COUNTRY field:");
            check.Result_evaluation(check.Visibility_check(account_infor.select_country_label),"SELECT COUNTRY label is VISIBLE","SELECT COUNTRY label is INVISIBLE");
            check.Result_evaluation(check.Availability_check(account_infor.select_country),"SELECT COUNTRY field is CLICKABLE","SELECT COUNTRY field is DISABLED");
            System.out.println("* SELECT STATE field:");
            check.Result_evaluation(check.Availability_check(account_infor.select_state),"STATE field should not be CLICKABLE before \"United States\" is selected","STATE field is DISABLED when \"United States\" is UNSELECTED");
            Thread.sleep(1000);
            action.Select_random_option(account_infor.select_country, account_infor.Select_country_by_random_index_value());
        } catch (InterruptedException e){}
    }
    @And("User fill out Timezone")
    public void timezone(){
        try {
            Thread.sleep(1000);
            check.Result_evaluation(check.Visibility_check(account_infor.select_timezone_label),"TIMEZONE label is VISIBLE","TIMEZONE label is INVISIBLE");
            Thread.sleep(1000);
            action.Select_random_option(account_infor.select_timezone,account_infor.Select_timezone_by_random_index_value());
        } catch (InterruptedException e){}
    }
    @And("User fill out Account Name")
    public void user_fill_out_account_name(){
        try {
            Thread.sleep(1000);
            action.Fill_in(account_infor.account_name,random.Random_valid_username());
            processor.Retrieve_value_input(account_infor.account_name,"Account name");
        } catch (InterruptedException e){}
    }
    @And("User fill out Address")
    public void user_fill_out_address(){
        try {
            Thread.sleep(1000);
            action.Fill_in(account_infor.address,random.Random_address());
            processor.Retrieve_value_input(account_infor.address,"Address");
        } catch (InterruptedException e){}
    }
    @And("User fill out City")
    public void user_fill_out_city(){
        try {
            Thread.sleep(1000);
            action.Fill_in(account_infor.city,random.Random_city());
            processor.Retrieve_value_input(account_infor.city,"City");
        } catch (InterruptedException e){}
    }
    @And("User fill out Postal Code")
    public void user_fill_out_postal_code(){
        try {
            Thread.sleep(1000);
            action.Fill_in(account_infor.postal_code,random.Random_postal_code());
            processor.Retrieve_value_input(account_infor.postal_code,"Postal code");
        } catch (InterruptedException e){}
    }
    @And("User fill out State")
        public void state() {
        try {
            Thread.sleep(1000);
            String country_value = processor.Get_selected_option_text(account_infor.select_country);
            Thread.sleep(1000);
            System.out.println("* SELECT STATE field:");
            check.Result_evaluation(check.Visibility_check(account_infor.select_state_label),"STATE label is VISIBLE","STATE label is INVISIBLE");
            check.Result_evaluation(check.Availability_check(account_infor.select_state),"STATE field should be CLICKABLE when SELECT COUNTRY is \"United States\"","STATE field should be DISABLED when SELECT COUNTRY is not \"United States\"");
            if (country_value.equalsIgnoreCase("united states")){
                check.Result_evaluation(check.Availability_check(account_infor.select_state),"STATE field should be CLICKABLE when SELECT COUNTRY is \"United States\"","STATE field should be DISABLED when SELECT COUNTRY is not \"United States\"");
                action.Select_random_option(account_infor.select_state,account_infor.Select_state_by_random_index_value());
                action.Screenshot("Account_Information_Section");
            }
        } catch (InterruptedException e) {
        }
    }
    @And("User fill out Contact Name")
    public void user_fill_out_contact_name(){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.contact_name,random.Random_contact_name());
            processor.Retrieve_value_input(register_login.contact_name,"Contact name");
        } catch (InterruptedException e){}
    }
    @And("User fill out Phone Number")
    public void user_fill_out_phone_number(){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.phone_number,random.Random_phone_number());
            processor.Retrieve_value_input(register_login.phone_number,"Phone number");
        } catch (InterruptedException e){}
    }
    @And("User fill out Email")
    public void user_fill_out_email(){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.email,"123321123@gmail.com");
            processor.Retrieve_value_input(register_login.email,"Email");
        } catch (InterruptedException e){}
    }
    @And("User fill out Confirm Email")
    public void user_fill_out_confirm_email(){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.confirm_email,"123321123@gmail.com");
            processor.Retrieve_value_input(register_login.confirm_email,"Confirm email");
        } catch (InterruptedException e){}
    }
    @And("User fill out User Name")
    public void user_fill_out_username(){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.username,random.Random_valid_username());
            processor.Retrieve_value_input(register_login.username,"Username");
        } catch (InterruptedException e){}
    }
    @And("User fill out Password")
    public void user_fill_out_password(){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.password,random.Random_valid_password());
            processor.Retrieve_value_input(register_login.password,"Password");
            Thread.sleep(1000);
            check.Availability_check(register_login.password_eye_icon_on);
            action.Click(register_login.password_eye_icon_on);
        } catch (InterruptedException e){}
    }
    @And("User fill out Confirm Password")
    public void user_fill_out_confirm_password(){
        try {
            Thread.sleep(1000);
            String valid_confirm_password = processor.Get_value_input(register_login.password);
            action.Fill_in(register_login.confirm_password,valid_confirm_password);
            processor.Retrieve_value_input(register_login.confirm_password,"Confirm password");
            Thread.sleep(1000);
            check.Availability_check(register_login.confirm_password_eye_icon_on);
            action.Click(register_login.confirm_password_eye_icon_on);
            System.out.println("* User's account information:\n" + " ");
            processor.Get_user_register_information();
            Thread.sleep(1000);
            action.Screenshot("Contact and Login Information");
        } catch (InterruptedException e){}
    }

}
