package basic_Programming_Questions;

public class SumOfPrimeCheck {

	public static void main(String[] args) {
		int num=34;
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(prime(i))
			{
				if(prime(num-i))
				{
					System.out.println(num + "=" +i+ "+" +(num-i));
					flag=true;
				}
			}
		}
		if(!flag)
		{
			System.out.println(num + "can not be expressed as sum of two prime numbers");
		}
		
		

	}

	public static boolean prime(int num)
	{
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++)
	
	if(num%i==0) {
		isPrime=false;
		break;
	}
		return isPrime;	
	}
	
}
