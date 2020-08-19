package HomeDepotAutoTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.Assert;

public class Scenario1a {
	public static void main(String args[]) throws Exception {
		// setup firefox driver
		System.setProperty("webdriver.gecko.driver", "C://webdrivers//geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();

		options.addArguments("--disable-web-security");
		options.addArguments("--ignore-urlfetcher-cert-requests");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--allow-running-insecure-content");
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		options.setCapability("marionette", true);

		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// open "Homedepot.ca" home page
		driver.get("https://www.homedepot.ca/en/home.html");
		driver.manage().deleteAllCookies(); // Temporarily resolve the Access Denied issue for opening sub pages.

		// Close the localization notification dialog
		driver.findElement(By.xpath("//button[@title='Close dialog']")).click();

		// Click on "Shop by Room" and then click on "Kitchen"
		driver.findElement(By.xpath("//global-header-categories/div/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//a[@href='/en/home/shop-by-room/kitchen.html']")).click();

		// Verify the breadcrumb is showing the same path I navigated.
		List<WebElement> navigatedPaths = driver
				.findElements(By.xpath("//li[contains(@itemprop,'itemListElement')]//span[@itemprop='name']"));

		for (WebElement ele : navigatedPaths) {
			String[] expectedPaths = { "Home", "Shop by Room", "Kiechen" };
			int i = 0;
			if (ele.getText().equals(expectedPaths[i])) {
				Assert.assertTrue(true);
				i++;
			}
			System.out.println(ele.getText());
		}

		// Scroll down and verify the verbiage "Essential Appliances"
		WebElement esseAppliances = driver.findElement(By.xpath("//h2[text()='Essential Appliances']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(esseAppliances).perform();
		Assert.assertEquals(esseAppliances.getText(), "Essential Appliances");
		System.out.println("The verbiage is : " + esseAppliances.getText());

		// Verify the description underneath of "Essential Appliances"
		WebElement appliancesDesc = driver.findElement(By.xpath("//span[contains(text(),'Create a beautiful')]"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", appliancesDesc);
		String expectedDesc = "Create a beautiful, stylish and functional kitchen with these essential items.";
		Assert.assertEquals(appliancesDesc.getText(), expectedDesc);
		System.out.println(appliancesDesc.getText());

		// Click on "Microwave" link and Verify the link name matches the page title.
		WebElement microwaves = driver.findElement(By.xpath("//span[contains(text(),'Microwaves')]"));
		String linkName = microwaves.getText();
		microwaves.click();
		System.out.println(linkName);
		System.out.println(driver.getTitle());

		Assert.assertFalse(driver.getTitle().matches(linkName), "The link name is not matching with page Title!");

		// Close the localization notification dialog
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@title='Close dialog']")).click();

		// Click "Category" <span _ngcontent-hdca-c156="" class="acl-dropdown__label
		WebElement category = driver
				.findElement(By.xpath("//span[contains(text(),'Category') or contains(text(),'category')]"));
		category.click();

		// Select the second option under "Microwaves" dropdown
		WebElement secondLink = driver
				.findElement(By.xpath("//li[contains(text(),'Microwaves')]//following-sibling::li[2]"));
		secondLink.click();

		// Click Compare radio button for any 2 Appliances.
		WebElement selectProd1 = driver.findElement(By.xpath("//article[contains(@class,'acl-product-card')][3]"));
		WebElement selectProd2 = driver.findElement(By.xpath("//article[contains(@class,'acl-product-card')][4]"));
		selectProd1.findElement(By.xpath(".//span[@class='acl-checkbox__faux-checkbox']")).click();
		selectProd2.findElement(By.xpath(".//span[@class='acl-checkbox__faux-checkbox']")).click();

		// --Get title value of selected product
		String selectedProdTitle1 = selectProd1
				.findElement(By.xpath(".//a[contains(@class,'acl-product-card__title-link')]")).getAttribute("title");
		String selectedProdTitle2 = selectProd2
				.findElement(By.xpath(".//a[contains(@class,'acl-product-card__title-link')]")).getAttribute("title");
		System.out.println("selectedProdTitle1 is " + selectedProdTitle1);
		System.out.println("selectedProdTitle2 is " + selectedProdTitle2);

		// --Get title value of mini product in Compare Panel
		WebElement miniProd1 = driver.findElement(By.xpath("//div[contains(@class,'acl-col--3')][1]"));
		WebElement miniProd2 = driver.findElement(By.xpath("//div[contains(@class,'acl-col--3')][2]"));

		String miniProdTitle1 = miniProd1.findElement(By.xpath(".//a[contains(@class,'acl-mini-product-card__title')]"))
				.getAttribute("title");
		String miniProdTitle2 = miniProd2.findElement(By.xpath(".//a[contains(@class,'acl-mini-product-card__title')]"))
				.getAttribute("title");

		System.out.println("miniProdTitle1 is " + miniProdTitle1);
		System.out.println("miniProdTitle2 is " + miniProdTitle2);

		// --Verify the title are same
		Assert.assertEquals(miniProdTitle1, selectedProdTitle1, "The selected prod is added to Compare Panel");
		Assert.assertEquals(miniProdTitle2, selectedProdTitle2, "The selected prod is added to Compare Panel");

		// --Click "Compare" button and verify the "Product Comparison"
		driver.findElement(By.xpath("//button[contains(@classname,'acl-mb--small')]")).click();
		String prodComparisonTitle = driver.findElement(By.xpath("//span[contains(@class,'acl-display--show')]"))
				.getText();
		System.out.println("The Product Comparison Page Title: " + prodComparisonTitle);
		Assert.assertEquals(prodComparisonTitle, "Product Comparison", "The page is opened correctly!");

		// End of Scenario 1
		driver.quit();

	}

}
