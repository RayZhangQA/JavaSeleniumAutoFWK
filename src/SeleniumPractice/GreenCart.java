package SeleniumPractice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Setup a global implicit wait time for 3 seconds.
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		//Setup a explicit wait time for 6 seconds that apply to some specific actions.
		WebDriverWait w = new WebDriverWait(driver,6);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		//Setup the needed items
		String[] itemsNeeded = { "Cauliflower", "Beetroot", "Tomato", "Beans" };

		//Invoke addItems method to add the needed items to the cart.
		addItems(driver, itemsNeeded);
		
		//Check the shopping cart
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		//Apply the Promo Code
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());		

		Thread.sleep(5000);
		driver.quit();

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		// Add Items Method - Specific focus on adding items
		int j = 0;
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < items.size(); i++) {
			String[] itemFullName = items.get(i).getText().split("-");
			String itemName = itemFullName[0].trim();

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(itemName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}

			}
		}
	}

}
