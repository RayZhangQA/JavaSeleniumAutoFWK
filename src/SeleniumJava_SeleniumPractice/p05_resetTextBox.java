package SeleniumJava_SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p05_resetTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://www.google.com";
		driver.get(URL);

		WebElement searchText = driver.findElement(By.xpath("//input[@title='Search']"));
		searchText.sendKeys("Selenium Practice Website");

		Thread.sleep(3000);
		searchText.clear();

		driver.quit();

	}

}
