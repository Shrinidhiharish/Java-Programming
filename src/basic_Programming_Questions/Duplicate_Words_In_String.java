package basic_Programming_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate_Words_In_String {

	public static void main(String[] args) {
		findduplicate("Make today Amazing Life is Amazing Today is Amazing");
	}

	public static void findduplicate(String InputString) {
		// split

		String eachword[] = InputString.split(" ");
		// Create hashmap
		Map<String, Integer> wordcount = new HashMap<String, Integer>();

		// Check each word in given array
		for (String word : eachword) {
			// if word is present increase the counter
			if (wordcount.containsKey(word)) {
				wordcount.put(word.toLowerCase(), wordcount.get(word) + 1);
			} else {
				wordcount.put(word, 1);
			}
		}
		// Extracting all the keys of Map
		Set<String> wordsInString = wordcount.keySet();

		// loop through all the words
		for (String word : wordsInString) {
			if (wordcount.get(word) > 1) {
				System.out.println(word + " : " + wordcount.get(word));
			}
		}
	}

}
