package coding;

import java.util.Arrays;

public class Largerst_Smallest_In_Array {

	public static void main(String[] args) {
	int num[]= {-10,2,100,8976};
	int large =num[0];
	int small =num[0];
	for(int i=1;i<num.length;i++)
	{
		if(num[i]>large)
			large=num[i];
		else if(num[i]<small)
		{
			small=num[i];
		}
	}
	System.out.println("Given array is" + Arrays.toString(num));
	System.out.println("small number is " + small);
	System.out.println("biggest number is " + large);
	
}
	
	
}
