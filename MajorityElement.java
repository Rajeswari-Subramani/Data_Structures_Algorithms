package week3.day2HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElement {
	/*
	 * Create a HashMap to store element counts
	 * Initialize maxcount=length/2
	 * iterate throgh for each loop and count the occurances of each element
	 * check the current eement is majority element
	 * if yes, return num or return -1
	 */

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> count=new HashMap<>();
		int majorityEle =nums.length/2;
		for (int num : nums) {
			count.put(num, count.getOrDefault(num, 0)+1);
			
		
		if(count.get(num)>majorityEle) {
			return num;
		}
	
	}
		return -1;
}
	public static void main(String[] args) {
		int[] nums = {3,2,3};
		MajorityElement majority = new MajorityElement();
		System.out.println(majority.majorityElement(nums));
		
		int[] nums1 = {2,2,1,1,1,2,2};
		System.out.println(majority.majorityElement(nums1));
		
	}
}