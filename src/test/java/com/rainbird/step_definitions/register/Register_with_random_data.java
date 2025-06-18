package com.rainbird.step_definitions.register;

import com.rainbird.pages.login_page.Login;
import com.rainbird.utils.custom_data.Generate_random_value;
import com.rainbird.pages.register_page.Register;
import com.rainbird.utils.actions.Actions;
import com.rainbird.utils.check.Check;
import com.rainbird.utils.processor.Processor;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Register_with_random_data {

    Login login = new Login();
    Register register = new Register();
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
        String country_random_value_xpath = random.Random_country_option_xpath();
        String option_value = processor.Get_selected_option_text(country_random_value_xpath);
        try {
            Thread.sleep(1000);
            check.Result_evaluation(check.Visibility_check(account_infor.select_country_label),"SELECT COUNTRY label is VISIBLE","SELECT COUNTRY label is INVISIBLE");
            check.Result_evaluation(check.Availability_check(account_infor.select_country),"SELECT COUNTRY field is CLICKABLE","SELECT COUNTRY field is DISABLED");
            Thread.sleep(1000);
            check.Result_evaluation(check.Visibility_check(account_infor.state_label),"STATE label is VISIBLE","STATE label is INVISIBLE");
            check.Result_evaluation(check.Availability_check(account_infor.state),"STATE field should not be CLICKABLE before United States is selected","STATE field is DISABLED when United States is UNSELECTED");
            Thread.sleep(1000);
            action.Select_random_option(country_random_value_xpath);

            if (option_value.equalsIgnoreCase("united states")){
                check.Result_evaluation(check.Availability_check(account_infor.state),"STATE field should be CLICKABLE when SELECT COUNTRY is \"United States\"","STATE field should be DISABLED when SELECT COUNTRY is not \"United States\"");
            }
        } catch (InterruptedException e){}
    }
    @And("User fill out Timezone")
    public void timezone(String timezone){
        try {
            Thread.sleep(1000);
            check.Result_evaluation(check.Visibility_check(account_infor.select_timezone_label),"TIMEZONE label is VISIBLE","TIMEZONE label is INVISIBLE");
            Thread.sleep(1000);
            action.Select_random_option(random.Random_timezone_option_xpath());
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
    public void user_fill_out_address(String address){
        try {
            Thread.sleep(1000);
            action.Fill_in(account_infor.address,address);
            processor.Retrieve_value_input(account_infor.address,"Address");
            processor.getUser_register_information();
        } catch (InterruptedException e){}
    }
    @And("User fill out City")
    public void user_fill_out_city(String city){
        try {
            Thread.sleep(1000);
            action.Fill_in(account_infor.city,city);
            processor.Retrieve_value_input(account_infor.city,"City");
        } catch (InterruptedException e){}
    }
    @And("User fill out Postal Code")
    public void user_fill_out_postal_code(String postal_code){
        try {
            Thread.sleep(1000);
            action.Fill_in(account_infor.postal_code,postal_code);
            processor.getUser_register_information();
        } catch (InterruptedException e){}
    }
    @And("User fill out State")
        public void state(String state) {
        try {
            Thread.sleep(1000);
            action.Select(account_infor.state, state);
            action.Screenshot("Account_Information_Section");
        } catch (InterruptedException e) {
        }
    }
    @And("User fill out Contact Name")
    public void user_fill_out_contact_name(String contact_name){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.contact_name,contact_name);
            processor.Retrieve_value_input(register_login.contact_name,"Contact name");
        } catch (InterruptedException e){}
    }
    @And("User fill out Phone Number")
    public void user_fill_out_phone_number(String phone_number){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.phone_number,phone_number);
            processor.Retrieve_value_input(register_login.phone_number,"Phone number");
            processor.getUser_register_information();
        } catch (InterruptedException e){}
    }
    @And("User fill out Email")
    public void user_fill_out_email(String email){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.email,email);
            processor.Retrieve_value_input(register_login.email,"Email");
        } catch (InterruptedException e){}
    }
    @And("User fill out Confirm Email")
    public void user_fill_out_confirm_email(String confirm_email){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.confirm_email,confirm_email);
            processor.Retrieve_value_input(register_login.confirm_email,"Confirm email");
            processor.getUser_register_information();
        } catch (InterruptedException e){}
    }
    @And("User fill out User Name")
    public void user_fill_out_username(String username){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.username,username);
            processor.Retrieve_value_input(register_login.username,"Username");
            processor.getUser_register_information();
        } catch (InterruptedException e){}
    }
    @And("User fill out Password")
    public void user_fill_out_password(String password){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.password,"Demotesting131313@");
            processor.Retrieve_value_input(register_login.password,"Password");
            Thread.sleep(1000);
            check.Availability_check(register_login.password_eye_icon_on);
            action.Click(register_login.password_eye_icon_on);
        } catch (InterruptedException e){}
    }
    @And("User fill out Confirm Password")
    public void user_fill_out_confirm_password(String confirm_password){
        try {
            Thread.sleep(1000);
            action.Fill_in(register_login.confirm_password,"Demotesting131313@");
            processor.Retrieve_value_input(register_login.confirm_password,"Confirm password");
            Thread.sleep(1000);
            check.Availability_check(register_login.confirm_password_eye_icon_on);
            action.Click(register_login.confirm_password_eye_icon_on);
            Thread.sleep(1000);
            action.Screenshot("Contact and Login Information");
        } catch (InterruptedException e){}
    }

}
