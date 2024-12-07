package week3.day2HW;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Pangram {
	/*
	 * Traverse the string sentence, 
	 * Use an array or hash table to record the letters that have appeared, 
	 * Check whether there are 26 letters in the array or hash table
	 */
	private static boolean isPanagram(String str) {

		Set<Character> Letter = new HashSet<>();

		for (char ch : str.toCharArray()) {
			Letter.add(ch);

		}

		return Letter.size() == 26;
	}

	public static void main(String[] args) {
		String str = "thequickbrownfoxjumpsoverthelazydog";
	System.out.println(isPanagram(str));
	}

}
