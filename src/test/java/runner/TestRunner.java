package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // link feature file to TestRunner class by providing the path of feature file in features
        features = "src/test/resources/features",

        // link StepDefinition class with TestRunner class by providing the path of stepdefinitions
        // package in glue
        glue = "stepdefinitions",

        // provide the tag name
        tags = "@SmokeTest",

        // set the monochrome as true
        monochrome = true,

        // generate the html reports, json reports, junit reports
        plugin = {"pretty", "html:target/HtmlReports/report.html",
        "json:target/JsonReports/report.json","junit:target/JunitReports/report.xml"}
)
public class TestRunner {

}
