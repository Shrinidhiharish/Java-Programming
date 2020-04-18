package coding;

public class String_Manipulation {
	public static void main(String[] args) {
		String str="Shrinidhi harish bettadpur";
		String str1="Shrinidhi harish bettadpur";
		String str2="       Shri nidhi   ";
		System.out.println(str.length());
		
		System.out.println(str.charAt(8));
		System.out.println(str.indexOf("S"));
		System.out.println(str.indexOf("s",str.indexOf("S")+1));
		System.out.println(str.indexOf("hi"));//-1
		
		System.out.println(str.equals(str1));//boolean value
		System.out.println(str.substring(1,9));
		System.out.println(str2.trim());
		System.out.println(str2.replace(" ", ""));
		String splitval[]=str1.split(" ");
		System.out.println("For each loop values");
		for(String values: splitval)
		{
			
			System.out.println(values);
		}
		
	}

}
