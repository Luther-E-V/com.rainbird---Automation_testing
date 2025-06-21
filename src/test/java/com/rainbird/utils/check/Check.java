package com.rainbird.utils.check;

import com.microsoft.playwright.Page;
import com.rainbird.playwright_config.Playwright_Config;

public class Check {
    private Page page = Playwright_Config.getPage();

    public boolean checkVisibility(String xpath){
        return page.locator(xpath).isVisible();
    }

    public boolean checkAvailability(String xpath){
        return page.locator(xpath).isEnabled();
    }

    public void checkValidity(String xpath){
        boolean validation = (boolean) page.locator(xpath).evaluate("el => el.checkValidity()");
        if (validation){
            System.out.println("The input is INVALID");
            String validity_message = (String) page.locator(xpath).evaluate("el => el.validationMessage");
            System.out.println("The validity message is: \" " + validity_message + " \"");
        } else {
            System.out.println("The input is VALID");
        }
    }

    public boolean checkExistence(String xpath){
        return page.locator(xpath).count() >= 1;
    }

    public boolean checkBoxCheck(String xpath){
        return page.locator(xpath).isChecked();
    }

    public void evaluateResult(boolean result, String value_if_true, String value_if_false){
        System.out.println((result)? "  - " + value_if_true : "  - " + value_if_false);
    }

}
