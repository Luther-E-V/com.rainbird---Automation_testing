package com.rainbird.utils;

import com.microsoft.playwright.Page;
import com.rainbird.playwright_config.Playwright_Config;
import java.util.ArrayList;

public class Processor {
    Actions action = new Actions();
    public Page page = Playwright_Config.getPage();
    private static ArrayList<String> user_register_information = new ArrayList<>();

    public void Get_user_register_information(){
        System.out.println(user_register_information); ;
    }

    public void Retrieve_value_input(String xpath,String field){
        String value_input = page.locator(xpath).inputValue();
        String user_information = field + ": " + value_input;
        user_register_information.add(user_information);
    }

    public void Retrieve_selected_option_text(String xpath,String field){
        String option_text = (String) page.locator(xpath).evaluate("sel => sel.options[sel.selectedIndex].innerText");
        String user_information = field + ": " + option_text;
        user_register_information.add(user_information);
    }

    public String Get_selected_option_text(String xpath){
        return (String) page.locator(xpath).evaluate("sel => sel.options[sel.selectedIndex].innerText");
    }
    public String Get_value_input(String xpath){
        return page.locator(xpath).inputValue();
    }
}
