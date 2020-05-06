package basic_Programming_Questions;

public class Missing_Number_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

		int add = 0;
		for (int i = 0; i < a.length; i++) {
			add = add + a[i];
		}
		System.out.println(add);

		int addition = 0;
		for (int j = 1; j <= 15; j++) {
			addition = addition + j;
		}
		System.out.println(addition);
		System.out.println("Missing number in the array is:" + (addition - add));
	}
}