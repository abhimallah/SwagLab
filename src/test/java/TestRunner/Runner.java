package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="Login",
features="src//test//java//Features",
glue="src//test//java//StepDefinition"
		)

public class Runner extends AbstractTestNGCucumberTests {

}
