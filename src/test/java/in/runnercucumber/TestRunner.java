package in.runnercucumber;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import in.stepdefinition.GenerateJvmReports;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", 
glue = "in.stepdefinition", 
plugin = {"pretty", "html:target//cucumber.html","json:target//cucumber.json"},
dryRun = false, 
strict = true)
public class TestRunner {
	
	@AfterClass
	public static void generate() {
		
		GenerateJvmReports.generateReport(System.getProperty("user.dir")+"/target//cucumber.jvm");
              
	}
	
	
	
	
	
	
	
	

}
