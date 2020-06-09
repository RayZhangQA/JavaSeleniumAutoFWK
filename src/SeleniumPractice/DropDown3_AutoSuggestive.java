package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown3_AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		Dimension d = new Dimension(1280, 1024);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		// //label[@for='fromCity']
		// //input[@placeholder='From']
	
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		Thread.sleep(1000);
/*
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mum");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
*/
		//Using WebElement to optimize the code:
		WebElement fromCity = driver.findElement(By.xpath("//input[@placeholder='From']"));
		//departureCity.click();
		fromCity.sendKeys("mum");
		Thread.sleep(2000);
		fromCity.sendKeys(Keys.ARROW_DOWN);
		fromCity.sendKeys(Keys.ENTER);

		WebElement toCity = driver.findElement(By.xpath("//input[@placeholder='To']"));
		toCity.sendKeys("del");
		Thread.sleep(2000);
		//toCity.sendKeys(Keys.ARROW_DOWN); //Using for loop to ArrowDown 4 times.
		for (int i=1; i<4; i++) {
			toCity.sendKeys(Keys.ARROW_DOWN);
		}
		toCity.sendKeys(Keys.ENTER);

		Thread.sleep(5000);	
		driver.quit();
	}

}
