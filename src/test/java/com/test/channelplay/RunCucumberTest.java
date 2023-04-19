package com.test.channelplay;

import io.cucumber.testng.*;
import org.testng.annotations.DataProvider;

@CucumberOptions(
		features = "src/test/resources/com/test/channelplay/feature",
		glue = {"com.test.channelplay.stepDefinition"},
		tags = "@currentFile",
		plugin = {"pretty", "rerun:target/rerun.txt", "timeline:target/timeline", "json:target/cucumber.json", "html:target/cucumber.html"}, 
	        monochrome=true
		)

public class RunCucumberTest extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
}
