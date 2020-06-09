package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SearchFilghtE2E {

	public static void main(String[] args) throws InterruptedException {
		// Open "spicejet.com web page
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Dimension d = new Dimension(1280, 1024);
		driver.manage().window().setSize(d);
		//driver.manage().window().maximize();
		Thread.sleep(2000);

		//Select "One Way" radio button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//Check if Return Date is disabled.
		WebElement returnDate = driver.findElement(By.id("Div1"));
		System.out.println(returnDate.getAttribute("style").contains("0.5"));
		//returnDate.click();
		//System.out.println(returnDate.getAttribute("style").contains("1"));
		
		if(returnDate.getAttribute("style").contains("0.5")) {
			System.out.println("The Return Date Calendar is disabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		// Select the fromCity - Using WebElement to optimize the code:
		WebElement fromCity = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT"));
		
		fromCity.click();
		Thread.sleep(2000);
		fromCity.sendKeys("mum");
		Thread.sleep(2000);
		System.out.println("The Departure City is "+ fromCity.getText());
		
		// Select the toCity
		WebElement toCity = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT"));
		toCity.sendKeys("del");
		Thread.sleep(2000);
		System.out.println("The Arraval City is "+ toCity.getText());

		// Select the Departure Date from the Calendar with the current date which is highlighted.
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.print("The current Date is selected for the departure!");

		// Select 2 Adults
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		//s.selectByIndex(6);
		//s.selectByVisibleText("5");
		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		System.out.println("The Adult is "+ driver.findElement(By.id("divpaxinfo")).getText());
		
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
		//System.out.print("The total checkbox number is " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		// Click "Search" button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
