package coding;

public class Amstrong {

	
	public static void IsAmtrong(int num)
	{
		int t=num;
		int cube = 0;
		int r;
		while(num>0)
		{
		r=num%10;
		num=num/10;
		cube=cube+(r*r*r);
	}
		if(t==cube)
		{
			System.out.println("Amstrong number");
			
		}
		
		else
		{
			System.out.println("Not an Amstrong number");
			
		}
	}
	
		
	public static void main(String[] args) {
		IsAmtrong(153);
	}

}
