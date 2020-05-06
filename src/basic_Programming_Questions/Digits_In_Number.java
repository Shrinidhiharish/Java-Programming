package basic_Programming_Questions;

public class Digits_In_Number {

	public static void main(String[] args) {
		long num = 12345698072341l;
		int count = 0;
		while(num !=0) {
			num=num/10;
			++count;
		}
		System.out.println("Number of digits in the number is " +count);
	}

}
