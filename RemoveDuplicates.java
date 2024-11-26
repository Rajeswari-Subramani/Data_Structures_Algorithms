package datastructures.week2;

import java.util.Arrays;

public class RemoveDuplicates {
	/*
	 * initialize the sorted array
	 * initialize the pointer left=0, right=length-1
	 * while(left<right),if(nums(left)==nums(right) ==> return nums(right)+1
	 * else if(nums(left)<nums(right)=> right--;
	 *else(right)=> left++;
	 */
	
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) return 0;

        Arrays.sort(nums); // Ensure the array is sorted
        int j = 0;

        // Remove duplicates in place
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++; // Move pointer for unique element
                nums[j] = nums[i]; // Update array in place
            }
        }

        // The length of the array with unique elements is `j + 1`
        return j + 1;
    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(nums);
        System.out.println("Length of array with unique elements: " + length);
        
        System.out.print("Array with unique elements: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

