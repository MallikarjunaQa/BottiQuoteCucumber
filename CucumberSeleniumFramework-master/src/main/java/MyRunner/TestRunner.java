package MyRunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features = "C:\\Users\\mallikarjuna.ss\\Desktop\\CucumberSeleniumFramework-master\\CucumberSeleniumFramework-master\\src\\main\\java\\Features", //the path of the feature files
			glue={"stepDefinitions"},//the path of the step definition files
		/*	format = {"pretty","html:tst-outout"}*/
			monochrome = true,
			strict = true,
			dryRun =false
			)
	 
	public class TestRunner {
	 
	}
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	

