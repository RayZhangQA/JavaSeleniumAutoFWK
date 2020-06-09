package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6_Option_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		/* 1. Select any checkbox
* 2. Grab the label of the selected checkbox
* 3. Select an option in dropdown. Here option to select should come from step 2.
*	 (Do not hard code the option)
* 4. Enter the step 2 grabbed label text in Editbox
* 5. Click Alert and then verify if text grabbed from step 2 is present in the pop up message
*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		Dimension d = new Dimension(1280,1024);
		driver.manage().window().setSize(d);

		//1. Select any checkbox	
		driver.findElement(By.id("checkBoxOption3")).click();

		//2. Grab the label of the selected checkbox
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]"));
		String checkboxName = checkbox.getText();
		System.out.println("The selected checkbox is " + checkboxName + "!");
		
		//3. Select an option in dropdown which is selected from step 2
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(checkboxName);
		WebElement dropdown = s.getFirstSelectedOption();
		String dropdownName = dropdown.getText();
		System.out.println("The selected Dropdown is " + dropdownName + "!");
		
		//4. Enter the step 2 grabbed label text into Editbox
		driver.findElement(By.id("name")).sendKeys(checkboxName);
		
		//5. Click Alert and then verify if text grabbed from step 2 is present in the pop up message
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("The Alert Text: " + alertText);
		
		if(alertText.contains(checkboxName)) {
			System.out.println("The selected checkbox is showing up in Alert!");
		}
		else {
			System.out.println("Something went wrong!");
		}	
		
		Thread.sleep(5000);
		alert.accept();
		
		driver.quit();
	}

}
