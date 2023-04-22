package login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver=null;
	@Given("I launch browser")
	public void I_launch_browser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@And("^I go to (.+)$")
	public void I_go_to_url(String url)
	{
		driver.get(url);
	}
	@When("^I fill email (.+)$")
	public void I_fill_email(String userEmail)
	{
		driver.findElement(By.id("userEmail")).sendKeys(userEmail);
	}
	@And("^I fill password (.+)$")
	public void I_fill_password(String userPassword)
	{
		driver.findElement(By.id("userPassword")).sendKeys(userPassword);
	}
	@And("I click login button")
	public void I_click_login_button()
	{
		driver.findElement(By.id("login")).click();
	}
	@Then("I take screenshot")
	public void I_take_screenshot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\melek\\Downloads\\Screenshot Selenium\\Login Confirmation.png"));
	}

}
