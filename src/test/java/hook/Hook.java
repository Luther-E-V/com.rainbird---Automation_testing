package hook;

import io.cucumber.java.AfterAll;
import playwright_config.Playwright_Config;
import io.cucumber.java.BeforeAll;

public class Hook {
    private static final String base_url = "https://iq4staging.usw2.rainbird.com/";

    @BeforeAll
    public void Setup(){
        System.out.println("Test begins");
        Playwright_Config.getPlaywright();
        Playwright_Config.getBrowser();
        Playwright_Config.getPage().navigate(base_url);
    }

    @AfterAll
    public void Teardown(){
        Playwright_Config.Playwright_teardown();
        System.out.println("Test finished");

    }
}
