package basic;

public class First extends Base {
	
	public void printTitle() {
		System.out.println("Page title = "+ driver.getTitle());
		
	}
	
	public static void main(String[] args) {
		First obj  = new First();
		obj.setupBrowser("chrome","https://www.facebook.com");
		//obj.setupBrowser("edge","https://www.facebook.com");
		obj.printTitle();
		obj.quitBrowser();
		
	}
}
