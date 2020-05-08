package basic_Programming_Questions;

public class Prime_Number {

	public static void main(String[] args) {
		
		//divisible by 1 & itself
		int num=13;
		boolean flag = false;
		for(int i=2;i<=num/2;i++)
		{
			if(num % i==0)
			{
				flag=true;
				break;
				
			}
		}
		if(!flag)
		{
			System.out.println(num + " Is a prime number");
		}
		else
		{
			System.out.println(num + " Is not  a prime number");
		}
	}

}
