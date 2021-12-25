package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	WebDriver driver;

	public void setupBrowser(String browser,String url) {
	
		String currDir = System.getProperty("user.dir");
		//System.out.println(currDir); // show the path
		
		if(browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",currDir+"\\drivers\\chromedriver.exe");	
			driver = new ChromeDriver();
				}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", currDir+"\\drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", currDir+"\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Valid browser was not provided, hence quiting the automation run");
			System.exit(0);
		}
		
		// driver.manage().window().maximize();
		
		if(url!="")
			driver.get(url);
		else
			driver.get("about:blank");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}
}
