package week3.day2HW;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Anagram {
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
			
			
		}
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		for (char c : s1.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0)+1);
			
			
		}
		for (char c : s2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0)+1);
			
			
		}
		return	map1.equals(map2);
			
		
		
	}
	public static void main(String[] args) {
		String s1 ="listen";
		String s2 ="silent";	
		boolean result = isAnagram(s1, s2);
		System.out.println(result);
		
		
		String s3 ="allergy";
		String s4 ="allergc";
		boolean result1 = isAnagram(s3, s4);
		System.out.println(result1);
	}
	}


			
				
		
		
	
	


