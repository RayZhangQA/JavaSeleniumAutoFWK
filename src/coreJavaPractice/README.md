Udemy - Selenium WebDriver with Java - Basic to Advanced + Frameworks
Selenium Basic to Advanced With Java Core Practice - Learning Notes 

#Java OOPS Basics for Selenium Part-1 
	OOPS - Object-Oriented Programming System

#### 1. Writing 1st Executable Program in Java

		public static void main(String[] args) {
			System.out.print("hi");
			System.out.println("hello world!");
		}

#### 2. Java Method

	A method is a block of code which only runs when it is called.
	You can pass data, known as parameters, into a method.
	Methods are used to perform certain actions, and they are also known as functions.
	Why use methods? To reuse code: define the code once, and use it many times.
	
##### Create a Method

	A method must be declared within a class. 
	It is defined with the name of the method, followed by parentheses (). 
	Java provides some pre-defined methods, such as System.out.println(), 
	but you can also create your own methods to perform certain actions:
	
##### Example - Create a method inside MyClass:

		public class MyClass {
		  static void myMethod() {
		    // code to be executed
		  }
		}
		
##### Example Explained
	myMethod() is the name of the method
	static means that the method belongs to the MyClass class and not an object of the MyClass class. 
	You will learn more about objects and how to access methods through objects later in this tutorial.
	void means that this method does not have a return value. 
	You will learn more about return values later in this chapter
	
##### 3. Put the modified xpath inside of the double quotes of $x("")

	e.g. --> $x("//*[@id='forgot_password_link']")

##### 4. In browser>>Inspect>>Console, paste the modified xpath and then press enter KEY.

	Move your mouse to the Array, you should see "Forgot Your Password?" should be highlighted.
	This is the way to validate if the xpath is correct.  

##### 5. For validate the css, change $x("") to $("").	

	e.g. #mydomainLink --> $("#mydomainLink")



# Generating Customized xpath from HTML attributes

