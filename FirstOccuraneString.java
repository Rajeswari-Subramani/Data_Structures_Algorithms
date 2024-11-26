package datastructures.week2;

public class FirstOccuraneString {
	public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0; // Edge case: empty needle
        
        int m = haystack.length();
        int n = needle.length();
        
        // Traverse the haystack
        for (int i = 0; i <= m - n; i++) {
            int j = 0;
            
            // Check if the substring matches the needle
            while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            
            // If j equals the length of the needle, a match is found
            if (j == n) {
                return i;
            }
        }
        
        // If no match is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int result = strStr(haystack, needle);
        System.out.println("Index of first occurrence: " + result); // Output: 2
        
        haystack = "aaaaa";
        needle = "bba";
        result = strStr(haystack, needle);
        System.out.println("Index of first occurrence: " + result); // Output: -1
    }
}