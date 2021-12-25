package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 {
	public void setupBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	public static void main(String [] args) {
		Basic1 obj = new Basic1();
		
		
	}

}
