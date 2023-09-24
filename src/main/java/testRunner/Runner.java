package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/main/resources/features",
        glue = {"stepdefination"},
        plugin ={"pretty","json:target/report.json","html:target/HtmlReports"}

)

public class Runner {

}
