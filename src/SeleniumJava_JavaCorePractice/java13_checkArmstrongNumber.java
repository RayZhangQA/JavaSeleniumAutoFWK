package SeleniumJava_JavaCorePractice;

public class java13_checkArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c = 0, a, temp;
		int n = 153;// It is the number to check Armstrong
		temp = n;

		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}

		if (temp == c)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");

	}

}

//Armstrong number is the number which is the sum of the cubes of all its unit, 
//tens and hundred digits for three-digit numbers.
//e.g. 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
//So 153 is an Armstrong number.

//1. a=153%10=3, 	n=153/10=15, 	c=0+（3*3*3）=0+9=27
//2. a=15%10=5,		n=15/10=1,		c=27+(5*5*5)=27+125=152
//3. a=1%10=1,		n=1/10=0,		c=152+(1*1*1)=152+1=153