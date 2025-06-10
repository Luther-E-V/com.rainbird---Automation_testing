package test_runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                features = "src/test/resources/Feature",
                glue = {"src/test/java/step_definitions","src/test/java/hook"},
                plugin = {"pretty","html:target/REPORT/"}
)
public class Test_Runner {
}
