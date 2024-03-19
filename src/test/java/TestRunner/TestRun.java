package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/Features",
        glue="StepDefinitions",
        dryRun=false,
        plugin={"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        //plugin={"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"},
        monochrome=true

)
public class TestRun {
}
