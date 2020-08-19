package SeleniumJava_SeleniumPractice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class p01_creatSimpleWebDriverScriptFirefox {

	public static void main(String[] args) {
		// Step1: set System Property with the webdriver path
		System.setProperty("webdriver.firefox.bin", "C:\\webdrivers\\firefox\\bin");

		FirefoxProfile fp = new FirefoxProfile();
		// load with firefox addons
		File file = new File("path\\to\\extension.xpi");
		fp.addExtension(file);
		// other settings on the profile...
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, fp);
		WebDriver driver = new RemoteWebDriver(dc);

		// Step2: Define the WebDriver with new ChromeDriver()
		// WebDriver driver = new ChromeDriver();

		// Step3: Open the Browser by driver.get()
		driver.get("https://www.google.com");

		// Step4: Set up a wait time to loading the page
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Webpage gets loaded successfully!!!");

		// Step5: Close or quit the Browser
		driver.close();
	}

}
