package RunTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\JAY\\eclipse-workspace\\MailCompose\\src\\main\\java\\Feature", glue = {
		"MailComposeSteps" }, plugin = { "pretty", "html:test-outout" })

public class TestStart {

}
