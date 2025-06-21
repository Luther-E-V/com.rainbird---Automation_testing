package com.rainbird.hook;

import io.cucumber.java.AfterAll;
import com.rainbird.playwright_config.Playwright_Config;
import io.cucumber.java.BeforeAll;

public class Hook {

    @BeforeAll
    public static void Setup(){
        System.out.println("Test begins");
        Playwright_Config.getPlaywright();
        Playwright_Config.getBrowserContext();
        Playwright_Config.getPage();
    }

    @AfterAll
    public static void Teardown(){
        Playwright_Config.teardownPlaywright();
        System.out.println("Test finished");
    }
}
