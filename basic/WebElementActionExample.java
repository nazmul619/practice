package basic;

import org.openqa.selenium.By;

public class WebElementActionExample extends Base {
	
	public void typeExample() {
		driver.findElement(By.id("email")).sendKeys("pxp2007@gmail.com");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("abc2007@gmail.com");
	}
	
	public void clickExample() {
		//driver.findElement(By.tagName("button")).click();
		driver.findElement(By.partialLinkText("Forgot Password?")).click();
		
	}
	public void submitExample() {
		// element type is submit
		driver.findElement(By.tagName("button")).click();
	}
	
	public static void main(String[] args) {

		WebElementActionExample obj = new WebElementActionExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.typeExample();
		obj.clickExample();
		obj.submitExample();
	}

}
