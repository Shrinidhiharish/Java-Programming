package basic_Programming_Questions;

public class Prime_Num_interval {

	public static void main(String[] args) {
		
		//20-100
		int low=20;
		int high=100;
		while(low<high)
		{
			boolean flag = false;
			for(int i=2; i< low/2; i++)
			{
				if(low % i==0)
				{
					flag=true;
					break;
					
				}
			}
			if(!flag)
			{
				System.out.println(low + " Is a prime number");
			}
			low++;
		}

	}

}
