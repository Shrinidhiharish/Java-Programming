package basic_Programming_Questions;

public class Factorial_Recurssion {

	public static void main(String[] args) {
		System.out.println(multiple(5));
	}

	
	public static int multiple(int num)
	{
		if(num>=1)
		{
			return num *multiple(num-1);
		}
		else
		return 1;
	}
}
