package datastructures.week2;

public class ReverseString {
	public static void reverseString(char[] name) {
		int left=0;
		int right=name.length-1;
		while(left<right) {
			char temp=name[left];
			name[left]=name[right];
			name[right]=temp;
			left++;
			right--;
		}
		
		
	}
public static void main(String[] args) {
	String s ="Rajeswari SDET";
	char[] chararray= s.toCharArray();
	reverseString(chararray);
	System.out.println(chararray);
}
}
