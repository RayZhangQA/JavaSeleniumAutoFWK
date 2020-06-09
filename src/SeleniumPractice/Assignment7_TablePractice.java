package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_TablePractice {

	public static void main(String[] args) {

/* 1. Print number of raws in the table including the header
 * 2. Print number of columns in the table
 * 3. Print the data of second raw
 */ 
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		Dimension d = new Dimension(1280,1024);
		driver.manage().window().setSize(d);
		
		List<WebElement> raws = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
		System.out.println("The number of raws is " + raws.size());

		WebElement secondRaw = raws.get(2);
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='product']/tbody/tr[3]/td"));
		System.out.println("The number of column is " + columns.size());

		for(int i=0;i<columns.size();i++) {
			System.out.println(columns.get(i).getText());
		}
	
	}

}
