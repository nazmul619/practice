package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElemetStateExample extends Base{

	public void isDisplayedExample() {
		// hidden element
		System.out.println(driver.findElement(By.tagName("input")).isDisplayed());
		
		// not hidden
		System.out.println(driver.findElement(By.id("email")).isDisplayed());
	}
	
	public void isEnableExample() {
		
		System.out.println(driver.findElement(By.id("email")).isEnabled());
		
	}
	
	public void isSelectedExample() {
		// applicable for checkBox and radio button
		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@id='u_0_7_Ua' or @id='u_0_5_Lq']"));
		System.out.println("Before clicking - is the element selected"+ maleRadioBtn.isSelected());
		
		// clicking on the radio button
		maleRadioBtn.click();
		System.out.println(" After clicking - is the element selected"+ maleRadioBtn.isSelected());
		
	}
	
	
	public static void main(String[] args) {
		
		WebElemetStateExample obj = new WebElemetStateExample();
		//obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.setupBrowser("chrome", "https://www.facebook.com/r.php");
		obj.isDisplayedExample();
		obj.isEnableExample();
		//obj.isSelectedExample();
		
		
		
		//obj.closeBrowser();
	}

}
