package rep;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods {
	WebDriver driver;
	public Methods(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void fillLoginDetails(String userEmail, String userPassword)
	{
		/*userEmailElement.sendKeys(userEmail);
		userPasswordElement.sendKeys(userPassword);
		loginButtonElement.click();*/
		driver.findElement(By.id("userEmail")).sendKeys(userEmail);
		driver.findElement(By.id("userPassword")).sendKeys(userPassword);
		driver.findElement(By.id("login")).click();
	}
	
	public void launchBrowser(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void addToCart(String itemToAdd) throws InterruptedException
	{
		Thread.sleep(3000);
		List<WebElement> itemsElements= driver.findElements(By.xpath("//div/h5/b"));
		for (int i=0; i<itemsElements.size();i++)
		{
			String itemName=itemsElements.get(i).getText();
			if (itemName.equalsIgnoreCase(itemToAdd))
			{
				driver.findElements(By.xpath("//div/button[.=' Add To Cart']")).get(i).click();
			}
		}
	}
}
