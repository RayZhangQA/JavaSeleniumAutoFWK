package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		//Setup the date as "April 23"
		String month = "April";
		String day = "23";
		//1. setup the month 
		driver.findElementByXPath(".//*[@id='travel_date']").click();
		WebElement monthSelector = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
		WebElement monthNext = driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']"));
		
		while (!monthSelector.getText().contains(month)) {
			monthNext.click();
		}

		//2. setup the day

		List<WebElement> days = driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count = days.size();

		for (int i = 0; i < count; i++) {
			String text = days.get(i).getText();
			if (text.equalsIgnoreCase(day)) {
				days.get(i).click();
				break;
			}

		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}