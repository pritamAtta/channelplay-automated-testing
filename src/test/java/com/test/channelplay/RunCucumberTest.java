package com.test.channelplay;

import io.cucumber.testng.*;
import org.testng.annotations.DataProvider;

@CucumberOptions(
		features = "src/test/resources/com/test/channelplay/feature",
		glue = {"com.test.channelplay.stepDefinition"},
		tags = "@currentFile",
		format= {"pretty","html:test-output_1","json:target/cucumber-reports/CucumberTestReport.json"},
		plugin = {"pretty", "rerun:target/rerun.txt", "timeline:target/timeline", "json:target/cucumber-reports/CucumberTestReport.json"}, monochrome=true
		)

public class RunCucumberTest extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
}
