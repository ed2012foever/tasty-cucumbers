package ie.tucan.bdd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Driver class for the cucumber app
 * 
 * @author Ed Gohery
 */
public class App {
	public static void main(String[] args) {
		
		WebDriver driver;
		String baseUrl;
		StringBuffer verificationErrors = new StringBuffer();
		DesiredCapabilities dCaps;

		dCaps = new DesiredCapabilities();
		dCaps.setJavascriptEnabled(true);
		dCaps.setCapability("takesScreenshot", false);

		driver = new PhantomJSDriver(dCaps);
		baseUrl = "https://uk.yahoo.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(baseUrl + "/");
		System.out.println(driver.getPageSource());
		driver.quit();
	}

}