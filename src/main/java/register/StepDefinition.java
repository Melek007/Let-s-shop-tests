package register;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver= null;
	@Given("^I launch browser and i connect to (.+)$")
	public void I_launch_browser_and_i_connect_to_url(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	@When("I click to register")
	public void I_click_to_register()
	{
		driver.findElement(By.cssSelector("p.login-wrapper-footer-text")).click();
	}
	@And("^I fill first name (.+)$")
	public void I_fill_firstName(String firstName)
	{
		driver.findElement(By.id("firstName")).sendKeys(firstName);
	}
	@And("^I fill last name (.+)$")
	public void I_fill_lastName(String lastName)
	{
		driver.findElement(By.id("lastName")).sendKeys(lastName);
	}
	@And("^I fill user email (.+)$")
	public void I_fill_userEmail(String userEmail)
	{
		driver.findElement(By.id("userEmail")).sendKeys(userEmail);
	}
	@And("^I fill user mobile (.+)$")
	public void I_fill_userMobile(String userMobile)
	{
		driver.findElement(By.id("userMobile")).sendKeys(userMobile);
	}
	@And("^I select (.+)$")
	public void I_select_occupation(String occupation)
	{
		WebElement dropDownElement= driver.findElement(By.cssSelector("select[class='custom-select ng-untouched ng-pristine ng-valid']"));
		Select options=new Select(dropDownElement);
		options.selectByVisibleText(occupation);
	}
	@And("I check gender")
	public void I_check_gender()
	{
		driver.findElement(By.xpath("//span[.='Male']")).click();
	}
	@And("^I fill userPassword (.+)$")
	public void I_fill_userPassword(String userPassword)
	{
		driver.findElement(By.id("userPassword")).sendKeys(userPassword);
		driver.findElement(By.id("confirmPassword")).sendKeys(userPassword);
	}
	@And("I check age checkbox")
	public void I_check_age_checkbox()
	{
		WebElement checkBoxElement= driver.findElement(By.xpath("//div/input[@type='checkbox']"));
		if(!checkBoxElement.isSelected())
		{
			checkBoxElement.click();
		}
	}
	@Then("I click login")
	public void I_click_login()
	{
		driver.findElement(By.id("login")).click();
	}
	@And("I take screenshot")
	public void I_take_screenshot() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("C:\\Users\\melek\\Downloads\\Screenshot Selenium\\Register Confirmation.png"));
	}
}
