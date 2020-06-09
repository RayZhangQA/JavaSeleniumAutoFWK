package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-creat-menu-with-submenu-using-css-html/26146");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement contentLink = driver.findElement(By.className("menulink"));
		
		Actions action = new Actions(driver);
		action.moveToElement(contentLink).build().perform();
		Thread.sleep(1000);

		driver.findElement(By.linkText("COURSES")).click();
		
		Thread.sleep(5000);
		System.out.println("The Course subMenu has been clicked!");
		
		driver.quit();

	}

}
