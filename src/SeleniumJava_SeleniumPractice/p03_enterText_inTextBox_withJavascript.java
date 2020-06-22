package SeleniumJava_SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p03_enterText_inTextBox_withJavascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String URL = "https://www.rahulshettyacademy.com/AutomationPractice/";
		driver.get(URL);

		// Set up the Javascript Executor object
		JavascriptExecutor jscript = (JavascriptExecutor) driver;
		// Issue command to enter the text
		jscript.executeScript("document.getElementById('name').value = 'ray.zhang';");

		driver.findElement(By.id("alertbtn")).click();

		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
		driver.close();

	}

}
