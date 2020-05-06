package coding;

public class String_Contains_Digits {
 public static boolean isEmpty(CharSequence cs)
 {
	 return cs==null||cs.length()==0;
 }
	
	public static boolean IsNumber(CharSequence cs)
	{
		if(isEmpty(cs)) {
			return false;
		}
		for(int i =0;i<cs.length();i++)
		{
			if(!Character.isDigit(cs.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(IsNumber("null"));
		System.out.println(IsNumber(""));
		System.out.println(IsNumber(" "));
		System.out.println(IsNumber("1234567"));
		System.out.println(IsNumber("testing1234"));
		System.out.println(IsNumber("Alphabets"));
		System.out.println(IsNumber("\u0967"));
		System.out.println(IsNumber("+123"));
		System.out.println(IsNumber("0"));
		System.out.println(IsNumber("!@#$%"));
		System.out.println(IsNumber("1 2 3 "));
		
	}

}
