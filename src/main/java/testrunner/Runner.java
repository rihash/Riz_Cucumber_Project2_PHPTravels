package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Automation Testing\\2023\\Eclipse\\Project_Cucumber\\src\\main\\java\\feature",
glue="stepdefinitions",
//plugin={"pretty","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports/Cucumber.html","junit:target/cucumber-reports/Cucumber.xml"} )
plugin = {"pretty","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports/Cucumber.html","junit:target/cucumber-reports/Cucumber.xml"})
public class Runner {

}
