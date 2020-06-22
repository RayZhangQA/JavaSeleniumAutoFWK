package SeleniumJava_SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p02_enterText_inTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String URL = "https://www.rahulshettyacademy.com/AutomationPractice/";
		driver.get(URL);

		// Enter your name to the Text Box
		driver.findElement(By.id("name")).sendKeys("ray.zhang");

		driver.findElement(By.id("alertbtn")).click();

		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
		driver.close();

	}

}
