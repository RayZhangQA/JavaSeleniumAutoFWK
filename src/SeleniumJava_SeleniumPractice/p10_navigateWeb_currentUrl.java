package SeleniumJava_SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p10_navigateWeb_currentUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://webdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		String firstPage = driver.getTitle();
		System.out.println("The initially open: " + firstPage);
		System.out.println("The current page URL： " + driver.getCurrentUrl());
		Thread.sleep(2000);

		// Navigate to
		driver.navigate().to("https://www.yahoo.com");
		String secondPage = driver.getTitle();
		System.out.println("Navigate from " + firstPage + " to " + secondPage);
		System.out.println("The current page URL： " + driver.getCurrentUrl());
		Thread.sleep(2000);

		// Navigate back
		driver.navigate().back();
		String navigateBackPage = driver.getTitle();
		System.out.println("Navigate back to " + navigateBackPage);
		System.out.println("The current page URL： " + driver.getCurrentUrl());
		Thread.sleep(2000);

		// Navigate forward
		driver.navigate().forward();
		String navigateForwardPage = driver.getTitle();
		System.out.println("Navigate forward to " + navigateForwardPage);
		System.out.println("The current page URL： " + driver.getCurrentUrl());
		Thread.sleep(2000);

		// Navigate Refresh
		driver.navigate().refresh();
		String navigateRefreshPage = driver.getTitle();
		System.out.println("Navigate refresh " + navigateRefreshPage);
		System.out.println("The current page URL： " + driver.getCurrentUrl());
		Thread.sleep(2000);

		driver.quit();

	}

}
