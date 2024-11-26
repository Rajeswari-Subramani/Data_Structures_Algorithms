package datastructures.week2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
	/*
	 * Initialte an array and target 
	 * Initialize pointer left=0; right=length-1
	 * whlle(left<right)
	 * if(nums(left)+nums(right)=targer, return the indexes of the array
	 * else if nums(left)<nums(right), right--;
	 * else left--;
	 */
		
		
		public static int[] twoSum(int[] nums, int target) {	
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			if (nums[left] + nums[right] == target) {
				return new int[] { left, right };

			} else if (nums[left] + nums[right] > target)
				right--;
			else
				left++;
		}
		return null;
	}
public static void main(String[] args) {
	int[] nums = {2,3,4,6,7,8};
	int taget=5;
	TwoSum obj = new TwoSum();
	System.out.println(Arrays.toString(obj.twoSum(nums, taget)));
}
		
	}

