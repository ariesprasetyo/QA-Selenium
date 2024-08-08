package step_definition;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Regression",
        features = {"classpath:features/"},
//        glue = {"com.mobile.automation.framework.stepDefinition"},
        plugin = {
                "pretty", "html:target/cucumber-reports/report.html",
                "json:target/cucumber/cucumber.json",
        },
        monochrome = true
)
public class RunCukesTest {
}
