package datastructures.week3.day2;

import java.util.HashMap;

public class TwoSumMap {
	public int[] twoSUm(int[]nums, int target){
	    
	    // TC:- O(n)
	    // SC:- O(n)
	    // initialise a map - we need to store (key(number), value(index))
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for (int i=0;i<nums.length;i++){
	    	for (int j=i+1;j<nums.length;j++){
	    		if(nums[i]==nums[i]) {
	    			
	    		}
	    	}
	        // 9-7=2
	        if(map.containsKey(target-nums[i])){
	            // 1, 0
	            return new int[]{i, map.get(target-nums[i])};
	        }
	        //2,0
	        map.put(nums[i], i);
	    }
	    return new int[] {-1, -1};
	}


}
