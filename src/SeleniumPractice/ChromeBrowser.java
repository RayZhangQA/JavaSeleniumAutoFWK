package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys("rayzhangqa@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Password");
		driver.findElement(By.linkText("Forgot account?")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
