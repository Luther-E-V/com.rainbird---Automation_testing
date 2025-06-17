package com.rainbird.playwright_config;

import com.microsoft.playwright.*;
import java.nio.file.Paths;


public class Playwright_Config {
    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext context;
    private static Page page;

    private static final boolean headless = false;
    private static final int Viewport_width = 1710;
    private static final int Viewport_height = 1050;
    private static final  String base_url =  "https://iq4staging.usw2.rainbird.com/";

    private Playwright_Config(){}

    public static Playwright getPlaywright(){
        if (playwright == null){
            playwright = Playwright.create();
        }
        return playwright;
    }

    public static BrowserContext getBrowserContext(){
        if (browser == null){
            BrowserType chromium = Playwright_Config.getPlaywright().chromium();
            browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(headless));
            context = browser.newContext(new Browser.NewContextOptions().setViewportSize(Viewport_width,Viewport_height));
        }
        return context;
    }

    public static Page getPage(){
        if (page == null){
            page = Playwright_Config.getBrowserContext().newPage();
        }
        return page;
    }
    public static void Navigation(){
        page.navigate(base_url);
    }

    public static void Playwright_teardown(){
        if (page != null) page.close();
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}
