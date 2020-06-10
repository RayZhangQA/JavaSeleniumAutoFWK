Udemy - Selenium WebDriver with Java - Basic to Advanced + Frameworks
Selenium Basic to Advanced With Java Core Practice - Learning Notes 

#Validate the accuracy of xpath and css from browser addons  

##### 1. Get the xpath from the browser by copy>>xpath

	e.g. --> //*[@id="forgot_password_link"]

##### 2. Change the double quotes to single quite

##### 3. Put the modified xpath inside of the double quotes of $x("")

	e.g. --> $x("//*[@id='forgot_password_link']")

##### 4. In browser>>Inspect>>Console, paste the modified xpath and then press enter KEY.

	Move your mouse to the Array, you should see "Forgot Your Password?" should be highlighted.
	This is the way to validate if the xpath is correct.  

##### 5. For validate the css, change $x("") to $("").	

	e.g. #mydomainLink --> $("#mydomainLink")



# Generating Customized xpath from HTML attributes

		xpath Syntax --> //tagName[@attribute='value']
		xpath Syntax --> //*[@attribute='value']
		css Syntax --> tagName[attribute='value']
		css Syntax --> [attribute='value']
		css Syntax --> tagName#id
		css Syntax --> #id

		<input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
		//input[@type='email']
		//input[@name='email']
		//input[@id='email']

		<input type="password" class="inputtext login_form_input_box" name="pass" id="pass" data-testid="royal_pass">
		//*[@type='password']
		
		Regular expression
		xpath Syntax --> //tagName[contains(@attribute,'value')] --> e.g. //input[contains(@name,'username')]	
		CSS Syntax --> tagName[Attribute*='value'] --> e.g. input[name*='username']


# Locators - Pay Attentions to the Followings:

	Classes should not have spaces- Compound classes cannot be accepted
	Multiple values - Selenium identifies the first one- Scans from top left
	Double quotes inside double quotes are not accepted
	Xpath/CSS  can be defined in n number of ways
	Rightclick copy on blue highlighted html code to generate xpath
	Firepath depreciated from firefox
	when xpath starts with html-Not reliable- Switch browser to get another one
	There is no direct way to get CSS in chrome. You will find it in tool bar
	Degrade browser to less firefox 55 to get Firepath
	$("") - for css ,    $x("")   or xpath
	//tagName[@attribute='value']  - xpath syntax
	tagName[attribute='value']  -CSS  tagName#id- CSS   tagname.classname- CSS
	//tagName[contains(@attribute,'value')]  - xpath regular expression
	tagName[Attribute*='value'] - Css regular expression
	Parent-child relationship xpath - Define xpath for parent/tagnames
	 --> e.g. //div[@class='SDkEP']/div[2]/input		
	Chropath - chrome	
	
	.//*[text()[contains(.,'Visible TEXT')]]	

# Synchronization in Selenium

		1). Entered form and select movie/flight enter
		2). Search
		3). Load 3 seconds
		4). First flight result:	

##### 1. Implicit Wait
	Hey wait for 5(n) number of seconds before you throw exception. 
	5 is the maximum waiting time.
	If the generic search is complete in 3 seconds, it will continue to next step immediately.
	
	An exception case , the search will take more than 15 seconds to load when you searching all the hotels. 
	In this case We can set up n to 15 seconds.
	But we have to wait 15 seconds to fail the test cases if the generic search does not work with some specific issues.
	To resolve this kind of issues, we can use Explicit Wait.
		---------------------------
		Implicit Wait Method - defined globally.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		---------------------------
		Wait for 5 seconds to check the object to be available on the web page. 
		If the object shows up in 2S, the execution continues to next step. 
		if it exceeded to 5S and then fail the execution. 
	
	Pros - Readable Code
	Cons -  Performance cause issues are not caught. 
			If there is a performance issue, it is hardly to be noticed.

##### 2. Explicit Wait
	We can setup 15 seconds specifically to all location hotel search. 	
	
	Setup an Implicit Wait for generic search and setup an Explicit Wait for Searching all the Hotels.
	Normally, there is a combination of both Implicit Wait and Explicit Wait methods in a realtime project.

		---------------------------
		WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By locator));
		---------------------------
		Wait until the element is visible on the page.
		The maximum wait time is 5 seconds.	

	Pros - Wait is applied only at targeted elements. So no performance issues.
	Cons - More code.
	
##### 3. Thread.sleep(5000)
	Hold on the execution for 5 seconds.
	
	So normally, Thread.sleep() method is not used in real project.
	
##### 4. FluentWait - Another Explicit Wait mechanism type
	FluentWait finds the web element repeatedly at regular intervals of time until the timeout or till the object gets found.
	Unlike WebDriver wait, we need to build Customized wait methods based on condition.
	Both WebDriverWait and FluentWait classes implement Wait Interface

	1). WebDriverWait = 10 seconds, every ms check the condition
	2). FluentWait = 10 seconds, Polling 4s (every 4 seconds check the condition)



# Actions

How to MouseOver on object with Selenium?
Performing Mouse and keyboard interactions with Selenium
Context click on element
Double click on element
drag dropping the element

driver.switchTo().window(arg0)


#Frames

What are Frames?
	Frame is a part of a Web page or browser window which displays content independent of its container, 
	with the ability to load content independently.
How to identify Frames in application?
How to handle frames?
Best Practices when working with Frames application. 


#The links in the page

#####1. Get the count of the links in this page

driver.findElements(By.tagName("a")).size();
http://qaclickacademy.com/practice.php


#####2. GEt the count of the links in Footer section of this page

WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
footerdriver.findElements(By.tagName("a")).size();


#####3. Get the count of the links in first column of Footer section of this page

WebElement columnDriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); 
columnDriver.findElements(By.tagName("a")).size();


#####4. Click on each link in the column and check if the pages are opening

for (int i=1;columnDriver.findElements(By.tagName("a")).size();i++)
{
	String clickOnLinkTab = Keys.chord（Keys.CONTROL,Keys.ENTER）;
	columnDriver.findElements(By.tagName("a")).sendKeys(clickOnLinkTab);	
}		


#####5. Get the title of each open tab

Set<String> tabs = driver.getWindowHandls();
Iterator<String> it = tabs.Iterator();

while(it.hasNext())
{
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
}

#####6. Swith to a new window opened in Selenium

for(String winHandle:driver.getWindowsHandles()){
	driver.switchTo().window(winHandle);
}


#		Handling Calendar UI in Travel Web Site


#		Practice exercises on Table

1. Take the WebElement as a sub section instead of driver
2. Traverse from parent to child node with xpath or cssSelector.
3. Move to child index with cssSelector
4. Iterate all the elements with common css
5. Traverse from sibling to sibling
6. Convert String to Integer
7. Sum logic
8. Get the Text() xpath 


# Hidden elements - By JavaScript DOM

JavaScript DOM can extract hidden elements
Because Selenium cannot identify hidden elements - (Ajax implementation)
Investigate the properties of object if it have any hidden text
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	String script = "return document.getElementById(\"fromPlaceName\").value;";
	String test = js.executeScript(script);
	System.out.println(text);

https://www.w3schools.com/js/js_htmldom_document.asp
document.getElementById("id")
		

#Handling SSL_CERTS and INSECURE_CERTS in Chrome

Set DesiredCapabilities - General Chrome profile

	DesiredCapabilities ch = DesiredCapabilities.chrome();
	ch.setCapability(CapabilityType.ACCEPT_INSUCURE_CERTS, true);
	ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

Set ChromeOptions for local browser

	ChromeOptions c = new ChromeOptions();
	c.merge(ch);
	System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(c);
	

# Maximum the windows || Delete all the cookies || Get Screenshot

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().deleteCookieNamed("cookName");
	//delete session cookie - direct to login page
	
	File src = ((TakesScreenshot)driver).getScreenshotas(OutputType.FILE);
	FileUtils.copyFile(src,new File(C://screenshot.png"));
	//FileUtils not available --> https://commons.apache.org/proper/commons-io --> download Commons IO jar 
	//--> --> add the eclipse project >> property >> Java Build Path >> Library >> external jars.



# Table Column Shorting Strategy Plan

How to check if the column items are in ascending ordering?
1. Retrieve all values of Veg/frout name column --> ArrayList e.g. 3,1,2,4,5
2. Copy ArrayList to ArrayList2 --> apply sort to ArrayList2 --> 1,2,3,4,5
3. Compare ArrayList and ArrayList2, if they are same, means the ArrayList is not in ascending ordering.
4. Convert from ascending to descending or vice versa. Udemy - Selenium WebDriver with Java - Basic to Advanced + Frameworks

