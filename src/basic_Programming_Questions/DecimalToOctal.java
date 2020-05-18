package basic_Programming_Questions;

public class DecimalToOctal {

	public static void main(String[] args) {
		
System.out.println(ConvertToDecimal(109));
	}
public static int ConvertToDecimal(int decimal)
{
	int ocatalNumber=0,i=1;
	while(decimal!=0) {
		ocatalNumber+= (decimal%8) * i;
		decimal/=8;
		i*=10;
		
		
	}
	return ocatalNumber ;
}
}
