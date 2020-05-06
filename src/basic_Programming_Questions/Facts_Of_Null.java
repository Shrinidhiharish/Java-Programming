package basic_Programming_Questions;

public class Facts_Of_Null {
	static Object obj; // Object class
	static String obj1; // String class
	static Facts_Of_Null obj2 = null;// Default class

	public static void main(String[] args) {
		// 1.case sensetive
		// 2.Object obj=null;
		// Default value of any reference variable is null
		// for any class
		/*
		 * System.out.println(obj); System.out.println(obj1); System.out.println(obj2);
		 * //3. Integer i=null;//allowed as Integer is a wrapper class int j=i;//not
		 * allowed null pointer exception as int is a primitive data type.
		 */
		// 4.intanceof
		Integer i = null;
		Integer k = 10;
		System.out.println(k instanceof Integer);
		System.out.println(i instanceof Integer);

		// 5.Static v/s non static
		// obj2.send();//null pointer exception.
		obj2.sum();// allowed as static methods are in common memory it does not affect if the
		// reference is null

		// 6.== !=
		System.out.println(null == null);
		System.out.println(null != null);

		// 7.null can be assigned to any wrapper class
		String str = null;
		Integer T = null;
		Double d = null;
		Float f = null;

		// 8.typecasting
		String s1 = (String) null;
		System.out.println(s1 + "hi");// allowed op nullhi
		System.out.println(s1.length());// ANy operation is not allowed

	}

	public static void sum() {
		System.out.println("sum..");
	}

	public void send() {
		System.out.println("send");
	}
}
