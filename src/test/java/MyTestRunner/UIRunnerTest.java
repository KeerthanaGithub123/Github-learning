package MyTestRunner;

import org.junit.runner.RunWith;
import io.cucumber.core.cli.Main;
//import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures"},
		glue = {"stepDefinitions", "AppHooks"},
		monochrome=true,
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		publish=true

		)

public class UIRunnerTest {

}
