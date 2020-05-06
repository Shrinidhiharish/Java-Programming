package basic_Programming_Questions;

public class Charater_Alphabet {

	public static void main(String[] args) {
		char c = '$';
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println(c + " Is a alphabet");
		} else
			System.out.println(c + " Is not a alphabet");
	}
}