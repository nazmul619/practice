package basic;

import org.openqa.selenium.By;

public class LocatorExamples extends Base{

	public void locators() {
		driver.findElement(By.id("email")).sendKeys("palash@gmai.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("md islam");
		
	}
	
	public static void main(String [] args) {
		LocatorExamples obj = new LocatorExamples();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.locators();
	}
}
