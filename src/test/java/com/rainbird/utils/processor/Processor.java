package com.rainbird.utils.processor;

import com.microsoft.playwright.Page;
import com.rainbird.pages.register_page.Register;
import com.rainbird.playwright_config.Playwright_Config;
import com.rainbird.utils.actions.Actions;
import java.util.ArrayList;

public class Processor {
    Actions action = new Actions();
    Register.Email_Verification verification = new Register.Email_Verification();
    public Page page = Playwright_Config.getPage();
    private static ArrayList<String> user_register_information = new ArrayList<>();

    public void getUser_RegisterInformation(){
        for (String value : user_register_information){
            System.out.println(value + "\n");
        }
    }

    public void retrieveInputValue(String xpath,String field){
        String value_input = page.locator(xpath).inputValue();
        String user_information = field + ": " + value_input;
        user_register_information.add(user_information);
    }

    public void retrieveSelectedOptionText(String xpath,String field){
        String option_text = (String) page.locator(xpath).evaluate("sel => sel.options[sel.selectedIndex].innerText");
        String user_information = field + ": " + option_text;
        user_register_information.add(user_information);
    }

    public String getSelectedOptionText(String xpath){
        return page.locator(xpath).evaluate("sel => sel.options[sel.selectedIndex].innerText").toString();
    }
    public String getInputValue(String xpath){
        return page.locator(xpath).inputValue();
    }
    public String getVerifiedEmail(){
        Page page = Playwright_Config.getPage();
        String confirm_content = page.locator(verification.confirm_with_email).textContent().substring(25);
        return confirm_content.replaceAll(" to confirm the validity of your email address.","");
    }
}
