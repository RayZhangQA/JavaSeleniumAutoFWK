package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Dimension d = new Dimension(1280,1024);
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		//xpath
		//driver.findElement(By.xpath("//*[@type='email']")).sendKeys("Myown xPath");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("RayZhngQA");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//css
		driver.findElement(By.cssSelector("#email")).sendKeys("Myown CSSPath");
		driver.findElement(By.cssSelector("#pass")).sendKeys("My PassWord");;
		driver.findElement(By.cssSelector("#u_0_b")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
