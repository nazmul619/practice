package new_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumDriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.amazon.com"); // navigate url
		
		/* driver.navigate().to("https://www.amazon.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh(); */
		
		String title = driver.getTitle(); // to get page title
		System.out.println(title);
		
		driver.manage().deleteAllCookies(); // delete all the cookies
		
		String getUrl=driver.getCurrentUrl(); // get current url
		System.out.println(getUrl);
		
		// driver.close();  //  Recording class8:   2.20 min   // 
		//driver.close();  // 
		//--> only current window tab closed but new windows and current browser instance doesn't closed like chromedriver.exe in the backend (task Manager ))
		
		
		// driver.quit();
		//--> current all window tab and new windows closed and current browser instance also closed like chromedriver.exe in the backend (task Manager ))
		
		
	}
}
