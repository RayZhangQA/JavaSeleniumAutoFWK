package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethodsOfWebDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com"); // Hit URL on the browser
		System.out.println(driver.getTitle()); //Validate id your Page Title is correct
		
		System.out.println(driver.getCurrentUrl()); //Validate if you are landed on correct URL
		
		//System.out.println(driver.getPageSource()); //Print the page source
		driver.navigate().to("http://yahoo.com"); //Switch to Yahoo from Google.
		driver.navigate().back(); //Navigate back to Google.
		driver.navigate().forward(); //Navigate forward to Yahoo.
		driver.navigate().refresh(); //Reload Yahoo.
		
		Thread.sleep(3000);
		driver.close(); //It close current browser
		driver.quit(); //It closes all the browsers opened by Selenium Script.

	}

}
