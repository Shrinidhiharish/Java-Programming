package basic_Programming_Questions;

public class NaturalNumWithRecurssion {

	public static void main(String[] args) {
		int num=6;
		int sum=addnum(num);
		System.out.println("sum is : " +sum);

	}
public static int addnum(int num)
{
	if(num!=0)
	{
		return num+addnum(num-1);
	}
	else
	return num;
}
}
