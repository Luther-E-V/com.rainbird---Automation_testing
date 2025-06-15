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
    private static final  String base_url = "https://iq4staging-api.usw2.rainbird.com/coreidentityserver/Account/Login?ReturnUrl=%2Fcoreidentityserver%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3D17342B41-6EB7-4D29-9871-6874E1C513A0%26redirect_uri%3Dhttps%253A%252F%252Fiq4staging.usw2.rainbird.com%252Fauth.html%26response_type%3Did_token%2520token%26scope%3DcoreAPI.read%2520coreAPI.write%2520openid%2520profile%26state%3D3c60902ca96b4235bcbab6fb3da0ab22%26nonce%3D978bfd83a7554238a85f1cc91ea85851";

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
