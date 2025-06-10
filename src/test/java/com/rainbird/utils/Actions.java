package com.rainbird.utils;

import com.microsoft.playwright.Page;
import com.rainbird.playwright_config.Playwright_Config;

public class Actions {
    public Page page = Playwright_Config.getPage();
    public void Click(String xpath){
        page.locator(xpath).click();
    }
}
