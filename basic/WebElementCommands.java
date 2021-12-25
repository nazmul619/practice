package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	
		public void getAttributeExample() {
			
			WebElement email = driver.findElement(By.id("email"));
			System.out.println("Custom attribute - datatestid value = "+ email.getAttribute("data-testid"));
			System.out.println("place holder value"+ email.getAttribute("placeholder"));
		}
	
		public void getTextExample() {
			// example -1
			String text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]")).getText();
			System.out.println(text);
			
			//example -2
			System.out.println("hyper link value ="+ driver.findElement(By.partialLinkText("Forg")).getText());
			
			// example - 3
			System.out.println("Button value ="+ driver.findElement(By.tagName("button")).getText());	
			
		}
		
		public void getCssExample() {
			WebElement loginBtn = driver.findElement(By.tagName("button"));
			System.out.println(loginBtn);
			
			System.out.println("font-size ="+ loginBtn.getCssValue("font-size"));
			System.out.println("Width ="+ loginBtn.getCssValue("width"));
			System.out.println("Background color ="+ loginBtn.getCssValue("background-color"));
			
			
		}
		
		public void getTagnameExample() {
			
		//	System.out.println("tagname ="+ driver.findElement(By.id("u_0_d_90")).getTagName());
			
		}
		
		public void getSizeExample() {
			WebElement loginBtn = driver.findElement(By.tagName("button"));
			System.out.println("Dimension"+loginBtn.getSize());
			System.out.println("Height"+loginBtn.getSize().height);
			System.out.println("Width"+loginBtn.getSize().width);
			
		}
		
		public void getLocationExample() {
			WebElement loginBtn = driver.findElement(By.tagName("button"));
			System.out.println("Location - point Value = "+ loginBtn.getLocation());
			System.out.println("x ="+ loginBtn.getLocation().x);
			System.out.println("y ="+ loginBtn.getLocation().y);
			System.out.println("get x ="+ loginBtn.getLocation().getX());
			System.out.println("get y ="+ loginBtn.getLocation().getY());
			
		}
		
		public void getRectangleExample() {
			WebElement loginBtn = driver.findElement(By.tagName("button"));
			System.out.println("dimension =" + loginBtn.getRect().getDimension());
			System.out.println("height dimension =" + loginBtn.getRect().getDimension().height);
			System.out.println("width dimension =" + loginBtn.getRect().getDimension().width);
			System.out.println("get height dimension =" + loginBtn.getRect().getDimension().getHeight());
			System.out.println("get height dimension =" + loginBtn.getRect().getDimension().getWidth());
			
		}
	
	public static void main(String[] args) {	
		WebElementCommands obj = new WebElementCommands();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.getAttributeExample();
		obj.getTextExample();
		obj.getCssExample();
		obj.getTagnameExample();
		obj.getSizeExample();
		obj.getLocationExample();
		obj.getRectangleExample();
	}

}
