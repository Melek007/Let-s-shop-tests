package login;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/login", glue = "login", monochrome = true, plugin = {"html: target/cucumber.html"})
public class CucumberTestNGTestrunner extends AbstractTestNGCucumberTests{

}
