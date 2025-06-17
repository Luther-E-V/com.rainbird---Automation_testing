package com.rainbird.utils;

import com.microsoft.playwright.Page;
import com.rainbird.playwright_config.Playwright_Config;

public class Check {
    private Page page = Playwright_Config.getPage();

    public boolean Visibility_check(String xpath){
        return page.locator(xpath).isVisible();
    }

    public boolean Availability_check(String xpath){
        return page.locator(xpath).isEnabled();
    }

    public void Validity_check(String xpath){
        boolean validity_check = (boolean) page.locator(xpath).evaluate("el => el.checkValidity()");
        if (validity_check){
            System.out.println("The input is INVALID");
            String validity_message = (String) page.locator(xpath).evaluate("el => el.validationMessage");
            System.out.println("The validity message is: \" " + validity_message + " \"");
        } else {
            System.out.println("The input is VALID");
        }
    }

    public boolean Existence_check(String xpath){
        return page.locator(xpath).count() >= 1;
    }

    public boolean boxCheck_check(String xpath){
        return page.locator(xpath).isChecked();
    }

    public void Result_evaluation(boolean result, String value_if_true, String value_if_false){
        System.out.println((result)? value_if_true : value_if_false);
    }

}
