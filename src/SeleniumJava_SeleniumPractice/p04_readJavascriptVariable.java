package SeleniumJava_SeleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p04_readJavascriptVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String URL = "https://www.google.com";
		driver.get(URL);

		// Set up the Javascript object
		JavascriptExecutor jscript = (JavascriptExecutor) driver;
		String strTitle = (String) jscript.executeScript("return document.title");

		System.out.println("Webpage Title: " + strTitle);

		driver.quit();
	}

}
