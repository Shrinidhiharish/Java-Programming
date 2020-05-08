package basic_Programming_Questions;

public class Power {

	
	public static void main(String[] args) {
		
		int base=11;
		int exponent = 2;
		long res=1;
		while(exponent !=0)
		{
			res=res*base;
			--exponent;
		}
		
		System.out.println(res);
		
		System.out.println(Math.pow(2, 4));
		
		
		
	}
}
