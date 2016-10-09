package Login;

import org.openqa.selenium.firefox.FirefoxDriver;

public class openFacebook {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
	}

}
