/*
 * package SeleniumPractice;
 * 
 * import java.io.File; import java.net.MalformedURLException; import
 * java.net.URL;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.junit.Test; import org.openqa.selenium.Platform; import
 * org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.openqa.selenium.firefox.FirefoxProfile; import
 * org.openqa.selenium.remote.DesiredCapabilities; import
 * org.openqa.selenium.remote.RemoteWebDriver; import
 * org.testng.annotations.AfterMethod; import
 * org.testng.annotations.BeforeMethod;
 * 
 * public class SeleniumGrid { // protected ThreadLocal<RemoteWebDriver>
 * threadDriver = null;
 * 
 * public static void main(String[] args) throws MalformedURLException {
 * 
 * DesiredCapabilities dc = new DesiredCapabilities();
 * dc.setBrowserName("chrome"); dc.setPlatform(Platform.WINDOWS);
 * 
 * WebDriver driver = new RemoteWebDriver(new
 * URL("http://localhost:4444/wd/hub"),dc);
 * driver.get("https://www.google.com");
 * 
 * System.out.println(driver.getTitle());
 * 
 * } }
 */
/* Commands in Hub Machine
 * -----------------------
 * 1. Download Selenium Server Jar
 * 2. Setting Up Hub:
 *	 	java -jar selenium-server-standalone-3.8.1.jar -role hub
 * 3. Validating Hub started 
 *	 	http://localhost:4444/grid/console
 *
 * Commands in Node Machine
 * ------------------------
 * 1. Login to remote machine and register it as node for Hub
 * 2. Download the Selenium Server Jar in node machine as well check java setup.
 * 3. Accessing Hub from Node Machine
 * 		http://iporhostnameofHub:4444/grid/console 
 * 4.Registering Node with Hub
 * 		java –jar selenium-server-standalone-3.8.1.jar –role webdriver –hub http://iporhostnameofHub:4444/grid/register -port 5566
 * 5.Download the webdrivers and extract them to the same folder with Selenium Server Jar
 *   e.g. Chrome driver.exe and  geckodriver.exe 
 * 
 */