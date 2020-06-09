package SeleniumPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableColumnSorting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();//Change to descending order
		//driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();//Change to ascending order

		//Declare the Arrays of originalList and copiedList
		ArrayList<String> originalList = new ArrayList<String>();		
		ArrayList<String> copiedList = new ArrayList<String>();
		
		//Setup WebElement for the target column
		List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		//Adding each raw's value to Array
		for (int i = 0; i < firstColList.size(); i++){
			originalList.add(firstColList.get(i).getText());
		}

		//Copy originalList to copiedList
		for (int i = 0; i < originalList.size(); i++){
			copiedList.add(originalList.get(i));
		}

		//Convert copiedList to ascending order.
		Collections.sort(copiedList);

		//Collections.reverse(copiedList);//Convert the Array ascending/descending order

		System.out.println("********** originalList *********");
		System.out.println(originalList);

		System.out.println("*********** copiedList ********");
		System.out.println(copiedList);
		
		Assert.assertTrue(originalList.equals(copiedList));
		
		Thread.sleep(5000);
		driver.quit();
	}

}
