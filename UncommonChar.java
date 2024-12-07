package week3.day2HW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UncommonChar {
	/*
	 * Initiate 2 map for str1 and str2
	 * iterate using foreach loop and count the char in str1 and str2
	 * Find characters in str1 that are not in str2
	 * Find characters in str2 that are not in str1
	 * return result
	 */
	public static Set<Character> unCommonChar(String str1, String str2) {

		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();

		for (char c : str1.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0) + 1);
		}
		for (char c : str2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}
		Set<Character> result = new HashSet<>();
		for (char c : map1.keySet()) {
			if (!map2.containsKey(c)) {
				result.add(c);
			}
		}
		for (char c : map2.keySet()) {
			if (!map1.containsKey(c)) {
				result.add(c);
			}
		}
		return result;
	}
public static void main(String[] args) {
	String str1 = "characters"; 
	String str2 = "alphabets";
	Set<Character> unCommonChar = unCommonChar(str1,str2);
	System.out.println("UncommonChars are "+ unCommonChar);
}
}
