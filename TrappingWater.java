package datastructures.week3.day1;

public class TrappingWater {
	//TC ==> o(n)
	/*
	 * Pseudo code:
     - Initialise two integer arrays of length nums, which stores the right and left max heights
     - fill the right, and left heights
     - iterate the input array, then compute water that can be trapped using
     ans= ans+ Math.min (leftMax [il, rightMax [il)-nums
	 */
	
	public static int storeWater(int[] nums) {
		int ans=0;
		int [] leftMaxHeights = new int [nums.length];
		int [] rightMaxHeights = new int [nums.length];
		leftMaxHeights[0]=nums[0];
		rightMaxHeights[rightMaxHeights.length-1]=nums[nums.length-1];
		
		//
		for (int i = 1; i < nums.length; i++) {
			leftMaxHeights[i] =Math.max(leftMaxHeights[i-1], nums[i]);
			
			
		}
		for (int i = rightMaxHeights.length-2; i >=0 ; i--) {
			rightMaxHeights[i] =Math.max(rightMaxHeights[i+1], nums[i]);
			
		}
		for (int i = 0; i < nums.length; i++) {
			ans = ans+ Math.max(0,Math.min(leftMaxHeights[i],rightMaxHeights[i])-nums[i]);
			
		}
		return ans;
		
	}
public static void main(String[] args) {
	int[] heights={0,1,0,2,1,0,1,3,2,1,2,1};
	int i = storeWater(heights);
	System.out.println(i);
	
}
}
