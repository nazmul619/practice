package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollExample extends Base {

	public void youtubeScroll() {
		// execute this on youtube
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
	}
	public void amazonScroll() {
		// execute this on amazon website
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,2000)");
	
	// to go to the bottom of the page directly
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	/*
	// to go to specific element location
	WebElement techDetails = driver.findElement(By.xpath("//h1[contains(text(),'Technical Details')]"));
	js.executeScript("argument[0].scrollIntoView();",techDetails );
	
	*/
	}
	public static void main(String[] args) {
		ScrollExample obj = new ScrollExample();
		// obj.setupBrowser("chrome", "https://www.youtube.com");
		obj.setupBrowser("chrome", "https://www.amazon.com");
		obj.youtubeScroll();
		
	}

}
