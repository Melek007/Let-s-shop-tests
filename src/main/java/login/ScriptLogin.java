package login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScriptLogin {
	public static void main(String[] args) throws IOException {
		//Test Data
		String url="https://rahulshettyacademy.com/client/";
		String userEmail="user0.test5@gmail.com";
		String userPassword="1234@User5678";
		//launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		//Fill email and password
		driver.findElement(By.id("userEmail")).sendKeys(userEmail);
		driver.findElement(By.id("userPassword")).sendKeys(userPassword);
		//Click login button
		driver.findElement(By.id("login")).click();
		//Take screenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\melek\\Downloads\\Screenshot Selenium\\Login Confirmation.png"));
	}
}
