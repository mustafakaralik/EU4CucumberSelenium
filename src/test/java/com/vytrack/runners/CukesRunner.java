package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = "src/test/resources/features", //path of features file
       glue = "com/vytrack/step_definitions",    //path of step definition file
        dryRun =false,
        //tags ="@login and not @wip"///it means exclude work in progress
        //tags ="@driver or @VYT-123"
         //tags = {"@login",~@wip"} //old version and but not include @wip use tilda sign new version--> not @wip
        tags = "@navigate"
)
public class CukesRunner {


}
