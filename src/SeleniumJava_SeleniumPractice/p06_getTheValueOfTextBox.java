package SeleniumJava_SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p06_getTheValueOfTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://www.google.com";
		driver.get(URL);

		String googleText = driver.findElement(By.id("SIvCob")).getText();
		System.out.println("The Google Text: " + googleText);

		Thread.sleep(3000);
		driver.quit();

	}

}
