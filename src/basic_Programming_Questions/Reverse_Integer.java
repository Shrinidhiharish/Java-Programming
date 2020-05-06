package coding;

public class Reverse_Integer {
public static void main(String[] args) {
	int num=7654;
	int rev=0;
	while(num!=0) {
		rev =rev*10+num%10;
		num=num/10;
	}
	System.out.println("reverse num is :" +rev);
	
	int num1=98765;
	System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
}
}
