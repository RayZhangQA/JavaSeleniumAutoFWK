package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1_CheckboxesExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		Dimension d = new Dimension(1280, 1024);
		driver.manage().window().setSize(d);
		// driver.manage().window().maximize();
		Thread.sleep(2000);

		// Select "One Way" radio button
		// driver.findElement(By.id("OneWay")).click();

		// Pick up the current Departure date
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();

		// Select 2 Adults
		Select adults = new Select(driver.findElement(By.id("Adults")));
		adults.selectByValue("2");

		// Select 1 Child
		Select children = new Select(driver.findElement(By.id("Childrens")));
		children.selectByValue("1");

		// Click More options
		driver.findElement(By.id("MoreOptionsLink")).click();

		Select seatClass = new Select(driver.findElement(By.id("Class")));
		seatClass.selectByValue("Economy");

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Air Canada");

		driver.findElement(By.id("SearchBtn")).click();

	}

}
