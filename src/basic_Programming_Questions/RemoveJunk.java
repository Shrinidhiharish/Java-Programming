package basic_Programming_Questions;

public class RemoveJunk {
	public static void main(String[] args) {
		String s = "$%^&*(%$# logic world @!#$~+_";
		s = s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);

	}
}
