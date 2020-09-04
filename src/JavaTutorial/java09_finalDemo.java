package JavaTutorial;

//this, super, try, catch, finally, final, public, private, protected, default
//package, import, inheritance, runtime, polymorphisms, strings

public class java09_finalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int i = 4;

	}

}

//Packages - Set of classes interfaces
//java.lang - Default package
//java.util - collection classes
//import packages.classname

//User defined java packages
//1. Class A can use Class B directly by creating object if both Classes belongs to same package.

//Difference between the modifiers with public, private, protected, default
//default modifier: The access to variable/method only able inside the package
//public modifier: You will have access to variable/method across all the packages 
//private modifier: you can not access to variable/method out side the class of same package
//protected modifier: variable/method as protected, you can access those in sub classes only (other packages)
