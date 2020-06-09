package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");

/*		//Using multiple locators to identify the elements
		driver.findElement(By.id("username")).sendKeys("UserName1");
		driver.findElement(By.name("pw")).sendKeys("PassWord1");
		//driver.findElement(By.className("button r4 wide primary")).click(); //Class with space will get error.		
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();                   */

		//Using cssSelector to locate the element
		driver.findElement(By.cssSelector("#username")).sendKeys("UserName2");
		driver.findElement(By.cssSelector("#password")).sendKeys("PassWord2");
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());	
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
