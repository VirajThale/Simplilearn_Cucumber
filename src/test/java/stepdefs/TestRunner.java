package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		plugin = {"pretty","html:target/cucumber-html","json:target/cucumber.json"},
		features ="src/test/java/features",
		//tags = {"@LoginFeature"},
		//tags = {"@Regression" ,"@Sanity"}, //AND condition
		//tags = {"@Regression, @Sanity"},	//OR condition
        //tags = {"~@DataTable"},
		
		tags = {"@Regression"},
		glue = {"stepdefs"}
		
		)


public class TestRunner {
	

	
	
}
