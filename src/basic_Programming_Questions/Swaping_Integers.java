package basic_Programming_Questions;

public class Swaping_Integers {
	public static void main(String[] args) {
		int x = 10;
		int y = 9;
		/*
		 * //using temp int temp=x; x=y; y=temp;
		 * System.out.println("The value of x is:"+x);
		 * System.out.println("The value of y is:"+y);
		 */
		// 2
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("The value of x is:" + x);
		System.out.println("The value of y is:" + y);

		// 3
		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println("The value of x is:" + x);
		System.out.println("The value of y is:" + y);

		// 4 xor operator
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("The value of x is:" + x);
		System.out.println("The value of y is:" + y);

	}
}
