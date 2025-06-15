package com.rainbird.step_definitions;

import com.rainbird.utils.*;
import com.rainbird.playwright_config.Playwright_Config;
import io.cucumber.java.en.Given;

public class Step_definition {

    Check check = new Check();

    @Given("User access to page")
    public void user_access_to_page() {
        try {
            Thread.sleep(2000);
            Playwright_Config.Navigation();
        } catch (InterruptedException e){}
    }
}
