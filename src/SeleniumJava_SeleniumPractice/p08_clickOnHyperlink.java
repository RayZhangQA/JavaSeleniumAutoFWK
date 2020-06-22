package SeleniumJava_SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p08_clickOnHyperlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("wevdriver.chrome.driver", "C://webdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.veeva.com/products/vault-clinical/");
		System.out.println("The home page Title is: " + driver.getTitle());

		// Locate a Hyperlink using findElement(By.linkText("the text"))
		driver.findElement(By.linkText("Read the report")).click();

		Thread.sleep(1000);
		System.out.println("The Read the report page Title is: " + driver.getTitle());

		Thread.sleep(3000);
		driver.quit();
	}

}
