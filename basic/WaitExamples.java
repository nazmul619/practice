package basic;

public class WaitExamples extends Base {

	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	
	public static void main(String[] args) {
		WaitExamples obj = new WaitExamples();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		
		obj.getTitle();
	
	}

}
