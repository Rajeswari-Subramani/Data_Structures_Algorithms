package week3.day2HW;

public class PivotIndex {
	 // Initialize the sum of numbers to the left of the pivot to 0
	// Calculate the total sum of the array elements
	// Iterate through the array to find the pivot index
    // Right sum is total sum minus the current element
    // since the current element is to be the pivot
	// If the sum of numbers to the left of the pivot is equal to
    // the sum of numbers to the right of the pivot, return current index
	// Update the sumLeft by adding the current element's value
	 // If no pivot index is found, return -1
	
	
	    public int pivotIndex(int[] nums) {
	     
	        int sumLeft = 0;        
	        int totalSum = 0;
	        for (int num : nums) {
	            totalSum += num;
	        }       
	        for (int i = 0; i < nums.length; i++) {       
	            int sumRight = totalSum - sumLeft - nums[i];	  
	            if (sumLeft == sumRight) {
	                return i;
	            }
 
	            sumLeft += nums[i];
	        }	      
	        return -1;
	    }
	    public static void main(String[] args) {
	    	int[] nums = {1,7,3,6,5,6};
	    	PivotIndex obj=new PivotIndex();
	    	System.out.println(obj.pivotIndex(nums));
	    
	 	    	int[] nums1 = {-1,1,2};
	 	    	System.out.println(obj.pivotIndex(nums1));
	 	    	
	 	    	int[] nums2 = {2,1,-1};
	 	    	System.out.println(obj.pivotIndex(nums2));
		}
		}
	




