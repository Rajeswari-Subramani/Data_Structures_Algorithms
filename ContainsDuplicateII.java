package datastructures.week3.day2;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
	/*
	 * - Initialise hashmap
- iterate the array and load entries
- before adding check if nums[i] is already there and i-map.get(nums[i])<k
	- if yes return true
	- else return false
	 */
	public static boolean containsDuplicate(int[] nums, int target) {
		Map<Integer, Integer> output = new HashMap<>();
		for (int i=0;i<nums.length;i++) {
		if(output.containsKey(nums[i])) { 
		if(i-output.get(nums[i])<=target) {
		return true;	
		}
		output. put (nums [1], i);
		}
		}
		return false;
		}
		public static void main (String[] args) {
		int[] arr= {1,2,3,1,2,3}; int k=2;
		boolean containsDuplicate = containsDuplicate(arr, k);
		System.out.println(containsDuplicate);

}
	}
