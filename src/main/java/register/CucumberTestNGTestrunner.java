package register;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/register", glue = "register", monochrome = true, plugin = {"html: target/cucumber.html"})
public class CucumberTestNGTestrunner extends AbstractTestNGCucumberTests{

}
