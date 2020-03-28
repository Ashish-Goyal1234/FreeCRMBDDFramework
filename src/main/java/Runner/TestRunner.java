package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
                features = "E:\\Selenium\\FreeCRMBDDFramework\\src\\main\\java\\Feature\\dealsmap.feature", //the path of the feature files
                glue={"stepDefinitions"},  //the path of the step definition files
                format = {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"},  // to generate different type of reporting.
                monochrome = true, // display the console output in a proper readable format.
                strict = true, //it will check if any step is not defined in step definition file.
                //dryRun = true  //checks mapping between feature file and login step definition is proper or not.
                    dryRun = false // able to execute the testcase
        )


public class TestRunner {


}
