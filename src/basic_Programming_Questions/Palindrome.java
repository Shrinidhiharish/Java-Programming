package coding;

public class Palindrome {

	public static void isPalindrome(int num)
	{
	int reminder=0;
	int sum=0;
	int orig;
	orig=num;
	while(num>0)
	{
		reminder = num%10;
		sum = (sum*10)+reminder;
		num=num/10;
	}
		if(orig==sum) {
			System.out.println("palindrome");
		}
			else
			{
				System.out.println("not a palindrome");
		}
		}

	public static void main(String[] args) {
		isPalindrome(151);
		isPalindrome(01510);
	}

}
