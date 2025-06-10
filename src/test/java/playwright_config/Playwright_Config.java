package playwright_config;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;

public class Playwright_Config {
    private static Playwright playwright;
    private static Browser browser;
    private static Page page;

    private static final boolean headless = false;

    private Playwright_Config(){}

    public static Playwright getPlaywright(){
        if (playwright == null){
            playwright = Playwright.create();
        }
        return playwright;
    }

    public static Browser getBrowser(){
        if (browser == null){
            browser = Playwright_Config.getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(headless));
        }
        return browser;
    }

    public static Page getPage(){
        if (page == null){
            page = Playwright_Config.getBrowser().newPage();
        }
        return page;
    }

    public static void Playwright_teardown(){
        if (page != null) page.close();
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}
