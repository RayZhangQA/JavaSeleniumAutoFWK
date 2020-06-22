package SeleniumJava_SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p09_submitTheHTMLForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_submit");
		System.out.println("The page Title: " + driver.getTitle());

		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("fname")).sendKeys("Ray");
		driver.findElement(By.id("lname")).sendKeys("Zhang");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		System.out.println("The submitted form page Title: " + driver.getTitle());

		Thread.sleep(3000);
		driver.quit();

	}

}
