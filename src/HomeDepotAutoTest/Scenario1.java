package HomeDepotAutoTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.Assert;

public class Scenario1 {
	public static void main(String args[]) throws Exception {
		// setup chrome driver
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("load-extension"));
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-popup-blocking"));
		options.addArguments("--disable-web-security");
		options.addArguments("--ignore-urlfetcher-cert-requests");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--allow-running-insecure-content");
		options.addArguments("--user-agent={userAgent}");
		options.addArguments("--disable-gpu");
		options.addArguments("--no-sandbox");
		options.addArguments("--verbose");
		options.addArguments("--lang=");
		options.setCapability("requireWindowFocus", true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// open "Homedepot.ca" home page
		driver.get("https://www.homedepot.ca/en/home.html");
		driver.manage().deleteAllCookies(); // Temporarily resolve the Access Denied issue for opening sub pages.

		// Close the localization notification dialog
		driver.findElement(By.xpath("//button[@title='Close dialog']")).click();

		// Click on "Shop by Room" and then click on "Kitchen"
		// driver.findElement(By.xpath("//global-header-categories/div/ul/li[2]/a/span")).click();
		driver.findElement(By.linkText("Shop by Room")).click();

		// driver.findElement(By.xpath("//a[@href='/en/home/shop-by-room/kitchen.html']")).click();
		driver.findElement(By.linkText("Kitchen")).click();

		// Close the localization notification dialog
		// driver.findElement(By.xpath("//button[@title='Close dialog']")).click();

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
		WebElement esseAppliances = driver.findElement(
				By.xpath("//div[contains(@class,'hdca-cms-rich-text')]//h2[text()='Essential Appliances']"));
		// div[contains(@class,'hdca-cms-rich-text')]//h2[text()='Essential Appliances']
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
		driver.manage().deleteAllCookies();

		// Click on "Microwave" link and Verify the link name matches the page title.
		// driver.findElement(By.xpath("//span[contains(text(),'Microwaves')]")).click();
		driver.findElement(By.linkText("Microwaves")).click();

		System.out.println(driver.getTitle());
		Assert.assertFalse(driver.getTitle().matches("Microwaves"), "The link text is not matching with page Title!");
		System.out.println(driver.getCurrentUrl());

		// "https://www.homedepot.ca/en/home/categories/appliances/cooking/microwaves.html"

		// Click "Category" <span _ngcontent-hdca-c156="" class="acl-dropdown__label
		driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();
		// driver.findElement(By.linkText("Category")).click();

		// Select the second option under "Microwaves" dropdown
		driver.findElement(By.xpath("//li[contains(text(),'Microwaves')]//following-sibling::li[2]")).click();

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
