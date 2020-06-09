package SeleniumPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// Open the website and reset the size of the window. 
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Dimension d = new Dimension(1280, 1024);
		driver.manage().window().setSize(d);
		//driver.manage().window().maximize();
		Thread.sleep(2000);

		// Select the fromCity - Using WebElement to optimize the code:
		WebElement fromCity = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT"));
		
		fromCity.click();
		Thread.sleep(2000);
		fromCity.sendKeys("mum");
		Thread.sleep(2000);
		
		// Select the toCity
		WebElement toCity = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT"));
		toCity.sendKeys("del");
		Thread.sleep(2000);

		// Select the Departure Date from the Calendar with the current date which is highlighted.
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.print("The current Date is selected for the departure!");

		// Select the checkbox of "Senior Citizen" and print the statement of the selection.
		WebElement seniorCitizen = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		WebElement seniorCitizenText = driver.findElement(By.cssSelector("label[for*='SeniorCitizenDiscount']"));
		//System.out.println(seniorCitizen.isSelected());
		Assert.assertFalse(seniorCitizen.isSelected());
		seniorCitizen.click();
		//System.out.println(seniorCitizen.isSelected());
		Assert.assertTrue(seniorCitizen.isSelected());
		Assert.assertEquals(seniorCitizenText.getText(), "Senior Citizen");

		if (seniorCitizen.isSelected()){
			System.out.println("The checkbox of "+seniorCitizenText.getText()+" is selected!");			
		}
		else {
			System.out.println("The checkbox of "+seniorCitizenText.getText()+" is NOT selected!");			
		}
				
		// Count the number of checkboxes in the page.
		System.out.print("The total checkbox number is " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		Thread.sleep(5000);
		//driver.quit();
	}

}
