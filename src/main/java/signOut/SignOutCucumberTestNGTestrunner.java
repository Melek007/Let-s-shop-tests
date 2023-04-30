package signOut;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/signOut", glue = "signOut", monochrome = true, plugin = {"html: target/cucumber.html"})
public class SignOutCucumberTestNGTestrunner extends AbstractTestNGCucumberTests{

}
