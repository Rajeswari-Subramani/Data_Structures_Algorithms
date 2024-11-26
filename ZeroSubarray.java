package datastructures.week3.day2;

import java.util.Arrays;
import java.util.HashMap;

public class ZeroSubarray {
	//initiate map
	//iterate through array and 
	
	public static boolean zeroSubarray(int[] nums) {
	HashMap<Integer, Integer> map = new HashMap<>();
  int sum=0;
  map.put(0, 1);
	for (int i = 0; i < nums.length; i++) {
		sum+=nums[i];
		if(map.containsKey(sum)) return true;
		map.put(sum, 1);
			
		}
	
	return false;
		
	}
	public static void main(String[] args) {
		int[] arr= {4, 2, -3, 1, 6}; 
	System.out.println(zeroSubarray(arr));
	
	int[] arr1= {4, 2, 0, 1, 6}; 
	System.out.println(zeroSubarray(arr1));
	
	int[] arr2= {-3, 2, 3, 1, 6}; 
	System.out.println(zeroSubarray(arr2));
		
	}

}

