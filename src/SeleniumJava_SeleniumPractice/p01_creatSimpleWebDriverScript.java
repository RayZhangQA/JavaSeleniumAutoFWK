package SeleniumJava_SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p01_creatSimpleWebDriverScript {

	public static void main(String[] args) {
		// Step1: set System Property with the webdriver path
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

//		ChromeOptions options = new ChromeOptions();
//		File extnFile = new File("/path/to/extension.crx");
//		options.addExtensions(extnFile);
//		DesiredCapabilities dc = DesiredCapabilities.chrome();
//		dc.setCapability(ChromeOptions.CAPABILITY, options);
//		WebDriver driver = new RemoteWebDriver(dc);

		// Step2: Define the WebDriver with new ChromeDriver()
		WebDriver driver = new ChromeDriver();

		// Step3: Open the Browser by driver.get()
		driver.get("https://www.google.com");

		// Step4: Set up a wait time to loading the page
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Webpage gets loaded successfully!!!");

		// Step5: Close or quit the Browser
		driver.close();
	}

}
