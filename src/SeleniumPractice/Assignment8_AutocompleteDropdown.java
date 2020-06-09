package SeleniumPractice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8_AutocompleteDropdown {

	/*
	 * 1. Enter "United" to Suggestive Dropdown and then Select "United Kingdom"
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		Dimension d = new Dimension(1280, 1024);
		driver.manage().window().setSize(d);

		WebElement dropdown = driver.findElement(By.id("autocomplete"));
		String initItem = "uni";
		String targetItem = "United Kingdom (UK)";
		dropdown.sendKeys(initItem);
		Thread.sleep(2000);
		dropdown.sendKeys(Keys.DOWN);
		// System.out.println(dropdown.getText());

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String item = (String) js.executeScript(script);
		ArrayList<String> dropdownItems = new ArrayList<String>();
		dropdownItems.add(item);
		
		while (!dropdownItems.contains(targetItem)) {
			dropdown.sendKeys(Keys.DOWN);
			item = (String) js.executeScript(script);
			dropdownItems.add(item);

			//System.out.println(i + ":  " + item);
			//System.out.println(i + ":  " + initItem);
			//System.out.println(i + ":  " + dropdownItems);
			if (initItem.equals(item)) {
				System.out.println("The item is not found!");
				break;
			}

			if (dropdownItems.contains(targetItem)) {
				System.out.println("The item " + item + " is found!");
			}

			Thread.sleep(10000);
			driver.quit();
		}
	}
}
