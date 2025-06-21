package com.rainbird.step_definitions.register.register_with_customized_data;

import com.rainbird.pages.register_page.Register;
import com.rainbird.utils.actions.Actions;
import com.rainbird.utils.check.Check;
import com.rainbird.utils.processor.Processor;
import com.rainbird.utils.test_data.Data_set;
import io.cucumber.java.en.When;

import javax.xml.crypto.Data;
import java.io.IOException;


public class Register_with_customized_data {

    Register.Account_Information account_infor = new Register.Account_Information();
    Register.Contact_and_Login_Information register_login = new Register.Contact_and_Login_Information();
    Actions action = new Actions();
    Check check = new Check();
    Processor processor = new Processor();

    @When("User have done populating {string}")
    public void user_have_done_population_data(String data) throws IOException {
            Data_set.Data(data);
        try {
            //COUNTRY
            Thread.sleep(1000);
            System.out.println("* SELECT COUNTRY field:");
            check.evaluateResult(check.checkVisibility(account_infor.select_country_label),"SELECT COUNTRY label is VISIBLE","SELECT COUNTRY label is INVISIBLE");
            check.evaluateResult(check.checkAvailability(account_infor.select_country),"SELECT COUNTRY field is CLICKABLE","SELECT COUNTRY field is DISABLED");
            Thread.sleep(1000);
            System.out.println("* SELECT STATE field:");
            check.evaluateResult(check.checkVisibility(account_infor.select_state_label),"STATE label is VISIBLE","STATE label is INVISIBLE");
            check.evaluateResult(check.checkAvailability(account_infor.select_state),"STATE field should not be CLICKABLE before United States is selected","STATE field is DISABLED when United States is UNSELECTED");
            Thread.sleep(1000);
            action.select(account_infor.select_country, Data_set.getCountry());
            //TIMEZONE
            Thread.sleep(1000);
            System.out.println("* SELECT TIMEZONE field:");
            check.evaluateResult(check.checkVisibility(account_infor.select_timezone_label),"TIMEZONE label is VISIBLE","TIMEZONE label is INVISIBLE");
            Thread.sleep(1000);
            action.select(account_infor.select_timezone,Data_set.getTimezone());
            //ACCOUNT NAME
            Thread.sleep(1000);
            action.Fill_in(account_infor.account_name,Data_set.getAccount_name());
            processor.retrieveInputValue(account_infor.account_name,"Account name");
            //ADDRESS
            Thread.sleep(1000);
            action.Fill_in(account_infor.address, Data_set.getAddress());
            processor.retrieveInputValue(account_infor.address,"Address");
            //CITY
            Thread.sleep(1000);
            action.Fill_in(account_infor.city,Data_set.getCity());
            processor.retrieveInputValue(account_infor.city,"City");
            //POSTAL CODE
            Thread.sleep(1000);
            action.Fill_in(account_infor.postal_code,Data_set.getPostal_code());
            //STATE
            String country_option_value = processor.getSelectedOptionText(account_infor.select_country);
            if (country_option_value.equalsIgnoreCase("united states")){
                Thread.sleep(1000);
                System.out.println("* SELECT STATE field:");
                check.evaluateResult(check.checkAvailability(account_infor.select_state),"STATE field should be CLICKABLE when SELECT COUNTRY is \"United States\"","STATE field should be DISABLED when SELECT COUNTRY is not \"United States\"");
                action.select(account_infor.select_state,Data_set.getState());
            }
            action.Screenshot("Account_Information_Section");
            //CONTACT NAME
            Thread.sleep(1000);
            action.Fill_in(register_login.contact_name,Data_set.getContact_name());
            processor.retrieveInputValue(register_login.contact_name,"Contact name");
            //PHONE NUMBER
            Thread.sleep(1000);
            action.Fill_in(register_login.phone_number,Data_set.getPhone_number());
            processor.retrieveInputValue(register_login.phone_number,"Phone number");
            //EMAIL
            Thread.sleep(1000);
            action.Fill_in(register_login.email,Data_set.getEmail());
            processor.retrieveInputValue(register_login.email,"Email");
            //CONFIRM EMAIL
            Thread.sleep(1000);
            action.Fill_in(register_login.confirm_email,Data_set.getConfirm_email());
            processor.retrieveInputValue(register_login.confirm_email,"Confirm email");
            //USER NAME
            Thread.sleep(1000);
            action.Fill_in(register_login.confirm_email,Data_set.getUser_name());
            processor.retrieveInputValue(register_login.confirm_email,"User Name");
            //PASSWORD
            Thread.sleep(1000);
            action.Fill_in(register_login.password,Data_set.getPassword());
            processor.retrieveInputValue(register_login.password,"Password");
            Thread.sleep(1000);
            check.checkAvailability(register_login.password_eye_icon_on);
            action.click(register_login.password_eye_icon_on);
            //CONFIRM PASSWORD
            Thread.sleep(1000);
            action.Fill_in(register_login.confirm_password,Data_set.getConfirm_password());
            processor.retrieveInputValue(register_login.confirm_password,"Confirm password");
            Thread.sleep(1000);
            check.checkAvailability(register_login.confirm_password_eye_icon_on);
            action.click(register_login.confirm_password_eye_icon_on);
            Thread.sleep(1000);
            System.out.println("* User's account information:\n" + " ");
            processor.getUser_RegisterInformation();
            action.Screenshot("Contact and Login Information");
        } catch (InterruptedException e){}
    }
//    @When("User fill out {string} as Country")
//    public void user_fill_out_country(String country){
//        try {
//            Thread.sleep(1000);
//            System.out.println("* SELECT COUNTRY field:");
//            check.evaluateResult(check.Visibility_check(account_infor.select_country_label),"SELECT COUNTRY label is VISIBLE","SELECT COUNTRY label is INVISIBLE");
//            check.evaluateResult(check.Availability_check(account_infor.select_country),"SELECT COUNTRY field is CLICKABLE","SELECT COUNTRY field is DISABLED");
//            Thread.sleep(1000);
//            System.out.println("* SELECT STATE field:");
//            check.evaluateResult(check.Visibility_check(account_infor.select_state_label),"STATE label is VISIBLE","STATE label is INVISIBLE");
//            check.evaluateResult(check.Availability_check(account_infor.select_state),"STATE field should not be CLICKABLE before United States is selected","STATE field is DISABLED when United States is UNSELECTED");
//            Thread.sleep(1000);
//            action.Select(account_infor.select_country, Get_data(country));
//        } catch (InterruptedException e){}
//    }
//    @And("User fill out {string} as Timezone")
//    public void timezone(String timezone){
//        try {
//            Thread.sleep(1000);
//            System.out.println("* SELECT TIMEZONE field:");
//            check.evaluateResult(check.Visibility_check(account_infor.select_timezone_label),"TIMEZONE label is VISIBLE","TIMEZONE label is INVISIBLE");
//            Thread.sleep(1000);
//            action.Select(account_infor.select_timezone,data.get(timezone).toString());
//        } catch (InterruptedException e){}
//    }
//
//    @And("User fill out {string} as Account Name")
//    public void user_fill_out_account_name(String account_name){
//        try {
//
//        } catch (InterruptedException e){}
//    }
//    @And("User fill out {string} as Address")
//    public void user_fill_out_address(String address){
//        try {
//            Thread.sleep(1000);
//            action.Fill_in(account_infor.address,address);
//            processor.retrieveInputValue(account_infor.address,"Address");
//        } catch (InterruptedException e){}
//    }
//    @And("User fill out {string} as City")
//    public void user_fill_out_city(String city){
//        try {
//            Thread.sleep(1000);
//            action.Fill_in(account_infor.city,city);
//            processor.retrieveInputValue(account_infor.city,"City");
//        } catch (InterruptedException e){}
//    }
//    @And("User fill out {string} as Postal Code")
//    public void user_fill_out_postal_code(String postal_code){
//        try {
//            Thread.sleep(1000);
//            action.Fill_in(account_infor.postal_code,postal_code);
//        } catch (InterruptedException e){}
//    }
//    @And("User fill out {string} as State")
//    public void user_fill_out_state(String state) {
//        try {
//            String country_option_value = processor.Get_selected_option_text(account_infor.select_country);
//            if (country_option_value.equalsIgnoreCase("united states")){
//                Thread.sleep(1000);
//                System.out.println("* SELECT STATE field:");
//                check.evaluateResult(check.Availability_check(account_infor.select_state),"STATE field should be CLICKABLE when SELECT COUNTRY is \"United States\"","STATE field should be DISABLED when SELECT COUNTRY is not \"United States\"");
//                action.Select(account_infor.select_state, state);
//            }
//            action.Screenshot("Account_Information_Section");
//        } catch (InterruptedException e) {
//        }
//    }
//    @And("User fill out {string} as Contact Name")
//    public void user_fill_out_contact_name(String contact_name){
//        try {
//            Thread.sleep(1000);
//            action.Fill_in(register_login.contact_name,contact_name);
//            processor.retrieveInputValue(register_login.contact_name,"Contact name");
//        } catch (InterruptedException e){}
//    }
//    @And("User fill out {string} as Phone Number")
//    public void user_fill_out_phone_number(String phone_number){
//        try {
//            Thread.sleep(1000);
//            action.Fill_in(register_login.phone_number,phone_number);
//            processor.retrieveInputValue(register_login.phone_number,"Phone number");
//        } catch (InterruptedException e){}
//    }
//    @And("User fill out {string} as Email")
//    public void user_fill_out_email(String email){
//        try {
//            Thread.sleep(1000);
//            action.Fill_in(register_login.email,email);
//            processor.retrieveInputValue(register_login.email,"Email");
//        } catch (InterruptedException e){}
//    }
//    @And("User fill out {string} as Confirm Email")
//    public void user_fill_out_confirm_email(String confirm_email){
//        try {
//            Thread.sleep(1000);
//            action.Fill_in(register_login.confirm_email,confirm_email);
//            processor.retrieveInputValue(register_login.confirm_email,"Confirm email");
//        } catch (InterruptedException e){}
//    }
//    @And("User fill out {string} as Password")
//    public void user_fill_out_password(String password){
//        try {
//            Thread.sleep(1000);
//            action.Fill_in(register_login.password,password);
//            processor.retrieveInputValue(register_login.password,"Password");
//            Thread.sleep(1000);
//            check.Availability_check(register_login.password_eye_icon_on);
//            action.Click(register_login.password_eye_icon_on);
//        } catch (InterruptedException e){}
//    }
//    @And("User fill out {string} as Confirm Password")
//    public void user_fill_out_confirm_password(String confirm_password){
//        try {
//            Thread.sleep(1000);
//            action.Fill_in(register_login.confirm_password,confirm_password);
//            processor.retrieveInputValue(register_login.confirm_password,"Confirm password");
//            Thread.sleep(1000);
//            check.Availability_check(register_login.confirm_password_eye_icon_on);
//            action.Click(register_login.confirm_password_eye_icon_on);
//            Thread.sleep(1000);
//            System.out.println("* User's account information:\n" + " ");
//            processor.Get_user_register_information();
//            action.Screenshot("Contact and Login Information");
//        } catch (InterruptedException e){}
//    }
}
