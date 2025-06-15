package com.rainbird.utils;

import com.microsoft.playwright.Page;
import com.rainbird.playwright_config.Playwright_Config;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Actions {
    private static ArrayList<String> user_register_information = new ArrayList<>();
    public Page page = Playwright_Config.getPage();

    public void getUser_register_information(){
        System.out.println(user_register_information); ;
    }

    public void Click(String xpath){
        page.locator(xpath).click();
    }

    public void Select(String xpath, String... option_value){
        page.locator(xpath).selectOption(option_value);
    }

    public void Hover(String xpath){
        page.locator(xpath).hover();
    }

    public void Screenshot(String screenshot_name){
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./screenshots/" + screenshot_name + ".png")));
    }

    public void Fill_in(String xpath, String input_value){
        page.locator(xpath).fill(input_value);
    }

    public void Retrieve_value_input(String xpath,String section){
        String value_input = page.locator(xpath).inputValue();
        String user_information = section + ": " + value_input;
        user_register_information.add(user_information);
    }
    public void Retrieve_selected_option_text(String xpath,String section){
        String option_text = (String) page.locator(xpath).evaluate("sel => sel.options[sel.selectedIndex].innerText");
        String user_information = section + ": " + option_text;
        user_register_information.add(user_information);
    }
}
