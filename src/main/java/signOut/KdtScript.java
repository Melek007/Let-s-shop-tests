package signOut;

import org.openqa.selenium.WebDriver;

import rep.Methods;

public class KdtScript {
	public static void main(String[] args) throws InterruptedException {
		//Test data
		String url="https://rahulshettyacademy.com/client/";
		String userEmail="user0.test5@gmail.com";
		String userPassword="1234@User5678";
		
		//Initialize
		WebDriver driver=null;
		Methods user=new Methods(driver);
		
		//Steps
		user.launchBrowser(url);
		user.fillLoginDetails(userEmail, userPassword);
		user.signOut();
	}

}
