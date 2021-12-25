package basic;

public class NavigationExample extends Base {

	public void navExample() throws InterruptedException {
		
		// entering the url
		System.out.println("entering the url for youtube");
		Thread.sleep(5000);
		driver.navigate().to("http://www.youtube.com");
		
		System.out.println("navigate back to google.com via browser back button");
		Thread.sleep(5000);
		driver.navigate().back();
		
		System.out.println("navigate back to youtube.com via browser forward button");
		Thread.sleep(5000);
		driver.navigate().forward();
		
		System.out.println("clicking on refresh button in youtube page");
		Thread.sleep(5000);
		driver.navigate().refresh();
		
	}
	
	public static void main(String[] args) throws InterruptedException {

		NavigationExample obj = new NavigationExample();
		obj.setupBrowser("chrome", "https://www.google.com");
		obj.navExample(); 
		
	}

}
