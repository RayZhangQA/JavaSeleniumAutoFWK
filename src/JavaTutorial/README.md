Java Tutorial - w3schools.com

#1. Java Getting Started
	OOPS - Object-Oriented Programming System

#### 1.1. Java Install
To check if you have Java installed on a Windows PC, search in the start bar for Java or type the following in Command Prompt (cmd.exe):

	C:\Users\Your Name>java -version

If Java is installed, you will see something like this (depending on version):

	java version "11.0.1" 2018-10-16 LTS
	Java(TM) SE Runtime Environment 18.9 (build 11.0.1+13-LTS)
	Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.1+13-LTS, mixed mode)

If you do not have Java installed on your computer, you can download it for free from oracle.com.

#### 1.2. Setup for Windows

To install Java on Windows:

	1. Go to "System Properties" (Can be found on Control Panel > System and Security > System > Advanced System Settings)
	2. Click on the "Environment variables" button under the "Advanced" tab
	3. Then, select the "Path" variable in System variables and click on the "Edit" button
	4. Click on the "New" button and add the path where Java is installed, followed by \bin. 
		By default, Java is installed in C:\Program Files\Java\jdk-11.0.1 (If nothing else was specified when you installed it). 
		In that case, You will have to add a new path with: C:\Program Files\Java\jdk-11.0.1\bin
		Then, click "OK", and save the settings
	5. At last, open Command Prompt (cmd.exe) and type java -version to see if Java is running on your machine	
#### 1.3 Java Quickstart

In Java, every application begins with a class name, and that class must match the filename.

Let's create our first Java file, called MyClass.java, which can be done in any text editor (like Notepad).

The file should contain a "Hello World" message, which is written with the following code:

		public class MyClass {
		  static void myMethod() {
		    // code to be executed
		  }
		}

Save the code in Notepad as "MyClass.java". 

Open Command Prompt (cmd.exe), navigate to the directory where you saved your file, 

and type "javac MyClass.java":

	C:\Users\Your Name>javac MyClass.java

This will compile your code. 

If there are no errors in the code, the command prompt will take you to the next line. 

Now, type "java MyClass" to run the file:

	C:\Users\Your Name>java MyClass

The output should read:

	Hello World	

# 2. Java Syntax

Every line of code that runs in Java must be inside a class. 

In our example, we named the class MyClass. A class should always start with an uppercase first letter.

Note: Java is case-sensitive: "MyClass" and "myclass" has different meaning.

The name of the java file must match the class name. 

When saving the file, save it using the class name and add ".java" to the end of the filename. 


#### 2.1. The main Method

The main() method is required and you will see it in every Java program:

	public static void main(String[] args)

Any code inside the main() method will be executed. 

Every Java program has a class name which must match the filename.

And that every program must contain the main() method.

#### 2.2. System.out.println()

Inside the main() method, we can use the println() method to print a line of text to the screen:

Note: The curly braces {} marks the beginning and the end of a block of code.

Note: Each code statement must end with a semicolon.

#### 2.3. Java Comments	

Comments can be used to explain Java code, and to make it more readable. 

It can also be used to prevent execution when testing alternative code.

Single-line comments start with two forward slashes (//).

Any text between // and the end of the line is ignored by Java (will not be executed).

#### 2.4. Java Multi-line Comments

Multi-line comments start with /* and ends with */.

Any text between /* and */ will be ignored by Java.

# 3. Java Variables

#### 3.1 Java Variables
Variables are containers for storing data values.

In Java, there are different types of variables, for example:

	String - stores text, such as "Hello". String values are surrounded by double quotes
	int - stores integers (whole numbers), without decimals, such as 123 or -123
	float - stores floating point numbers, with decimals, such as 19.99 or -19.99
	char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
	boolean - stores values with two states: true or false

#### 3.2 Declaring (Creating) Variables

To create a variable, you must specify the type and assign it a value:
	
	type variable = value;

Create a variable called name of type String and assign it the value "John":

	String name = "John";
	System.out.println(name);

Create a variable called myNum of type int and assign it the value 15:

	int myNum = 15;
	System.out.println(myNum);

You can also declare a variable without assigning the value, and assign the value later:

	int myNum;
	myNum = 15;
	System.out.println(myNum);

Change the value of myNum from 15 to 20:

	int myNum = 15;
	myNum = 20;  // myNum is now 20
	System.out.println(myNum);

#### 3.3 Final Variables
However, you can add the final keyword if you don't want others (or yourself) to overwrite existing values 

(this will declare the variable as "final" or "constant", which means unchangeable and read-only):

	final int myNum = 15;
	myNum = 20;  // will generate an error: cannot assign a value to a final variable

#### 3.4 Other Types

	int myNum = 5;
	float myFloatNum = 5.99f;
	char myLetter = 'D';
	boolean myBool = true;
	String myText = "Hello";

# 4. Java Data Types
Data types are divided into two groups:

	Primitive data types - includes byte, short, int, long, float, double, boolean and char
	Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)

#### 4.1 Primitive Data Types

>A primitive data type specifies the size and type of variable values, and it has no additional methods.

>There are eight primitive data types in Java:

		Data Type		Size		Description
		-------------------------------------------------------------------------------
		1. byte		1 byte		Stores whole numbers from -128 to 127
		2. short	2 bytes		Stores whole numbers from -32,768 to 32,767
		3. int		4 bytes		Stores whole numbers from -2,147,483,648 to 2,147,483,647
		4. long		8 bytes		Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		5. float	4 bytes		Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		6. double	8 bytes		Stores fractional numbers. Sufficient for storing 15 decimal digits
		7. boolean	1 bit		Stores true or false values
		8. char		2 bytes		Stores a single character/letter or ASCII values

##### 4.1.1 Numbers
###### 	1. Integer Types
>1.1 Byte - The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:

			byte myNum = 100;
			System.out.println(myNum);

>1.2 Short - The short data type can store whole numbers from -32768 to 32767:

			short myNum = 5000;
			System.out.println(myNum);

>1.3 Int - The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.

			int myNum = 100000;
			System.out.println(myNum);

>1.4 Long - The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":

			long myNum = 15000000000L;
			System.out.println(myNum);

###### 	2. Floating Point Types
> You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
>
>2.1 Float - The float data type can store fractional numbers from 3.4e−038 to 3.4e+038. Note that you should end the value with an "f":

			float myNum = 5.75f;
			System.out.println(myNum);

>2.2 Double - The double data type can store fractional numbers from 1.7e−308 to 1.7e+308. Note that you should end the value with a "d":

			double myNum = 19.99d;
			System.out.println(myNum);	
***
Use float or double?

The precision of a floating point value indicates how many digits the value can have after the decimal point. The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits. Therefore it is safer to use double for most calculations.
***			
>2.3 Scientific Numbers - A floating point number can also be a scientific number with an "e" to indicate the power of 10:

			float f1 = 35e3f;
			double d1 = 12E4d;
			System.out.println(f1);
			System.out.println(d1);

##### 4.1.2 Booleans
>A boolean data type is declared with the boolean keyword and can only take the values true or false:

			boolean isJavaFun = true;
			boolean isFishTasty = false;
			System.out.println(isJavaFun);     // Outputs true
			System.out.println(isFishTasty);   // Outputs false

##### 4.1.3 Characters
>The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':

			char myGrade = 'B';
			System.out.println(myGrade);
>Alternatively, you can use ASCII values to display certain characters:

			char a = 65, b = 66, c = 67;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
>Tip: A list of all ASCII values can be found in our [ASCII Table Reference](https://www.w3schools.com/charsets/ref_html_ascii.asp)
##### 4.1.4 Strings
>The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:

			String greeting = "Hello World";
			System.out.println(greeting);

The String type is so much used and integrated in Java, that some call it "the special ninth type".

A String in Java is actually a non-primitive data type, because it refers to an object. The String object has methods that are used to perform certain operations on strings. Don't worry if you don't understand the term "object" just yet. We will learn more about strings and objects in a later chapter.
		
#### 4.2 Non-Primitive Data Types
>Non-primitive data types are called reference types because they refer to objects.

>The main difference between primitive and non-primitive data types are:

		1. Primitive types are predefined (already defined) in Java. 
			Non-primitive types are created by the programmer and is not defined by Java (except for String).
		2. Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
		3. A primitive type has always a value, while non-primitive types can be null.
		4. A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
		5. The size of a primitive type depends on the data type, while non-primitive types have all the same size.

>Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc.




