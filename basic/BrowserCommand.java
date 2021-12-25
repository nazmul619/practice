package basic;

public class BrowserCommand extends Base {

	public void getCommand(String url) {
		driver.get(url);  
	// is used in setup browser method to open up the application under test url( UAT)
	}
	
	public void getCurrentPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("url"+ url);
	}
	
	public void getPageTitle() {
		System.out.println(driver.getTitle());
	}
	
	public void closeWindow() {
		driver.close();// current close browser like current tab but still driver instance like object still in the task manager
	}
	public void quiteWindow() {
		driver.quit();  // 
	}
	
	public static void main(String[] args) {
		
		BrowserCommand obj = new BrowserCommand();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		
		//obj.getCommand("https://www.google.com");
		
		obj.getCurrentPageUrl();
		obj.getPageTitle();
		//obj.closeWindow();
		obj.quitBrowser();
	}

}
