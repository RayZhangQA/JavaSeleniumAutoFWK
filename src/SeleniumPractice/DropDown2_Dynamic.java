package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown2_Dynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Dimension d = new Dimension(1280, 1024);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		//Static dropdown with Select locator
		//Dynamic dropdown with indexes locator
		//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']")).click();
		//Use Parent-Child Relationship locator - put the parent xpath before the child xpath will make it unique. 
		// //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']
		
		Thread.sleep(5000);
		driver.quit();
	}

}
