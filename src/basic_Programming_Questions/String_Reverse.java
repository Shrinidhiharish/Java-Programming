package coding;

public class String_Reverse {
	public static void main(String args[])
	{
		String a="$hrinidhi";
        String rev="";
		int length=a.length();//9
		System.out.println(length);
		for(int i =(length-1);i>=0;i--)
		{
		rev=rev + a.charAt(i);	
		//System.out.println(rev);
		}
		System.out.println(rev);
		StringBuffer sf= new StringBuffer(a);
		System.out.println(sf.reverse());
		
}
	
}
