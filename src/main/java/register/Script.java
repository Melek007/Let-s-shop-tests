package register;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script {
	public static void main(String[] args) throws IOException, InterruptedException {
		//Test Data
		String url="https://rahulshettyacademy.com/client";
		String firstName="User";
		String lastName="Test";
		String userEmail="user0.test2@gmail.com"; //new email for each iteration
		String userMobile= "1612345678";
		String occupation="Student";
		String userPassword="1234@User5678";
		//launch
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		//click to register
		driver.findElement(By.cssSelector("p.login-wrapper-footer-text")).click();
		//fill details
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		driver.findElement(By.id("userEmail")).sendKeys(userEmail);
		driver.findElement(By.id("userMobile")).sendKeys(userMobile);
		WebElement dropDownElement= driver.findElement(By.cssSelector("select[class='custom-select ng-untouched ng-pristine ng-valid']"));
		Select options=new Select(dropDownElement);
		options.selectByVisibleText(occupation);
		driver.findElement(By.xpath("//span[.='Male']")).click();
		driver.findElement(By.id("userPassword")).sendKeys(userPassword);
		driver.findElement(By.id("confirmPassword")).sendKeys(userPassword);
		WebElement checkBoxElement= driver.findElement(By.xpath("//div/input[@type='checkbox']"));
		if(!checkBoxElement.isSelected())
		{
			checkBoxElement.click();
		}
		//click Register
		driver.findElement(By.id("login")).click();
		//verify
		Thread.sleep(3000);
		/*WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div.login-wrapper.my-auto.p-5.ng-star-inserted"))));*/
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("C:\\Users\\melek\\Downloads\\Screenshot Selenium\\Register Confirmation.png")); //put your file
	}
}
