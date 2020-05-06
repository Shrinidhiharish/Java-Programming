package basic_Programming_Questions;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 ....
		int num = 20;
		int t1 = 0;
		int t2 = 1;
		for (int i = 1; i <= num; i++) {
			System.out.println(t1);//0,1,1,2
			int sum = t1 + t2;//1,2,3,..
			t1 = t2;//1,1,2
			t2 = sum;//1,2,3
		}

	}

}
