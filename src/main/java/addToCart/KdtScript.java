package addToCart;


import org.openqa.selenium.WebDriver;

import rep.Methods;

public class KdtScript extends Methods{
	public KdtScript(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) throws InterruptedException {
		//Test Data
		String url="https://rahulshettyacademy.com/client/";
		String userEmail="user0.test5@gmail.com";
		String userPassword="1234@User5678";
		String itemToAdd="ADIDAS ORIGINAL";
		
		WebDriver driver=null;
		Methods user=new Methods(driver);
		user.launchBrowser(url);
		user.fillLoginDetails(userEmail, userPassword);
		user.addToCart(itemToAdd);
	}
}
