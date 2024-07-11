package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/",glue={"stepdefinitions"},monochrome=true,dryRun=false,tags= {"@smoke"},plugin = {"html:reports/cucumberhtml","pretty"}
	//	,glue={"stepdefinitions"},monochrome = true,dryRun = false,plugin = {"html:reports/cucumberhtml","pretty"},tags={"@smoke"}
		)

public class Runner {

}
