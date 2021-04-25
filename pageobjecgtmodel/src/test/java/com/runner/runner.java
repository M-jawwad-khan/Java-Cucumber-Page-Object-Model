package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/hp/Documents/eclipse workspace/"
		+ "pageobjecgtmodel/src/test/java/com/featurepage/Feature.feature",
glue= {"com/stepdefination"},//where is ur step defination
monochrome = true,
strict = true, // it will check if any step is not define in the ui package
dryRun = false // to check the mapping is proper between feature file and ui file
//tags = {"~@smoketest","~REgressiontest"} or {@smoketest Or REg and not reg}
//format= {"pretty","html:test-output","json:jsonn_output/cucumber.json"}
)
public class runner {

	
}
