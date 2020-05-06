package basic_Programming_Questions;

public class Swap_Sting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "Today";
		System.out.println("Before swapping");
		System.out.println(a);
		System.out.println(b);
		// 1.Append a and b
		a = a + b;
		// 2. Store initial string a in b
		b = a.substring(0, a.length() - b.length());
		// 3.store initial string b in a
		a = a.substring(b.length()); // begin index parameter
		System.out.println("After swapping");
		System.out.println(a);
		System.out.println(b);
	}

}
