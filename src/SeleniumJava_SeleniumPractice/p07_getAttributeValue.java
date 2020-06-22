package SeleniumJava_SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p07_getAttributeValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://duckduckgo.com/");

		WebElement searchTextBox = driver.findElement(By.id("search_form_input_homepage"));

		// Retrieving html attribute value using getAttribute() method
		String typeValue = searchTextBox.getAttribute("type");
		System.out.println("Value of type Attribute is: " + typeValue);

		String autocompleteValue = searchTextBox.getAttribute("autocomplete");
		System.out.println("Value of autocomplete Attribute is: " + autocompleteValue);

		// Retrieving value of attribute which does not exist
		String nonExistingAttributeValue = searchTextBox.getAttribute("nonExistingAttribute");
		System.out.println("Value of nonExistingAttribute Attribute is: " + nonExistingAttributeValue);

		Thread.sleep(3000);
		driver.quit();

	}

}
