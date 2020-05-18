package basic_Programming_Questions;

public class DecimalToBinary {

	public static void main(String[] args) {
	
long binary = convertToBinary(156);
System.out.println(binary);
	}

	public static long convertToBinary(int n)
	{
		long binarynum=0;
		int remainder = 1, i=1;
		while(n!=0)
		{
			remainder = n%2;
			n=n/2;
			binarynum +=remainder * i;
			i*=10;
			
		}
		return binarynum;
	}
}
