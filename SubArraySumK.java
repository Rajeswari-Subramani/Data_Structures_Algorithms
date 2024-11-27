package week3.day2HW;

import java.util.HashMap;

public class SubArraySumK {
	public static int  subArraySumK(int nums[], int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		  int preSum =0;
		  int count =0;
		// Setting 0 in the map.
		  map.put(0, 1);
			for (int i = 0; i < nums.length; i++) {
				// add current element to prefix Sum:
			
				preSum+=nums[i];
				
				  // Calculate preSum-k:
	            int remove = preSum - k;
	            
	         // Add the number of subarrays to be removed:
	            count+= map.getOrDefault(remove, 0);
	            //Update the count of prefix sum
	            // in the map.
	            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
	        }
	        return count;
}
	public static void main(String[] args) {
		int[] nums = {1,1,1};
        int k = 2;
        int count = subArraySumK(nums, k);
        System.out.println(count);
        
        
        int[] nums1 = {1,2,3};
        int k1 = 3;
        int count1 = subArraySumK(nums1, k1);
        System.out.println(count1);
	}
}

