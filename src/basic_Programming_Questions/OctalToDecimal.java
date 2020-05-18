package basic_Programming_Questions;

public class OctalToDecimal {

	public static void main(String[] args) {
		System.out.println(ConvertToDecimal(116));
	}

	
	public static int ConvertToDecimal(int oct)
	{
		int decimalNumber=0,i=0;
		while(oct!=0) {
			decimalNumber+= (oct%10)*Math.pow(8, i);
			++i;
			oct/=10;
		}
		return decimalNumber;
	}
}
