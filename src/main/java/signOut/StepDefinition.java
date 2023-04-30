package signOut;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import rep.Methods;

public class StepDefinition {
	WebDriver driver= null;
	Methods user=new Methods(driver);
	@Given("^I go to (.+)$")
	public void I_go_to_url(String url)
	{
		user.launchBrowser(url);
	}
	@When("^I fill (.+) and (.+)$")
	public void I_fill_userEmail_and_userPassword(String userEmail, String userPassword)
	{
		user.fillLoginDetails(userEmail, userPassword);
	}
	@Given("I sign out")
	public void I_sign_out() throws InterruptedException
	{
		user.signOut();
	}
}
