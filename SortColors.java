package datastructures.week3.day1;

import java.util.Arrays;

public class SortColors {
	/*
	 * 
	 * - left=0, right=nums.length-1, mid=0; (mid, fast pointer, left, right= slow
	 * pointer) - if (nums [mid] ==0){ 
	 * // code swap left, mid increment both mid, left
	 *  else if(nums [mid]==1){ //mid++ ｝
	 * - else // swap mid and right // decre
	 * right
	 */
	public static void sortColors(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int mid = 0;
		int temp = 0;
		while (mid <= right) {
			if (nums[mid] == 0) {
				temp = nums[left];
				nums[left] = nums[mid];
				nums[mid] = temp;
				mid++;
				left++;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				temp = nums[right];
				nums[right] = nums[mid];
				nums[mid] = temp;
				right--;
			}
		}
	}

	public static void main(String[] args) {

		int[] nums = { 0, 0, 0, 1, 2, 0, 1, 1, 2 };
		sortColors(nums);
		System.out.println(Arrays.toString(nums));

	}

}
