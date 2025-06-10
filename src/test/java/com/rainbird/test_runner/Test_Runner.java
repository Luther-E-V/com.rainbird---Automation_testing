package com.rainbird.test_runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                features = "src/test/resources/Feature/Register.feature",
                glue = {"com.rainbird.step_definitions","com.rainbird.hook"},
                plugin = {"pretty","html:target/REPORT/Register.html"}
)
public class Test_Runner {
}
