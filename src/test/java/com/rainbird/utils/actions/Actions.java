package com.rainbird.utils.actions;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;
import com.rainbird.playwright_config.Playwright_Config;
import java.nio.file.Paths;

public class Actions {

    public Page page = Playwright_Config.getPage();

    public void click(String xpath){
        page.locator(xpath).click();
    }

    public void select(String select_xpath, String option_value){
        page.locator(select_xpath).selectOption(option_value);
    }
    public void selectrandomOption(String select_xpath,int option_index){
        page.locator(select_xpath).selectOption(new SelectOption().setIndex(option_index));
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


}
