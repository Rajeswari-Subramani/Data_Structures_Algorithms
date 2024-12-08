package week5.day2;

import org.testng.annotations.Test;

public class FindPeakElement {
	 /*
    i/p=1,2,3,1
    o/p=2
     /*
    1) low=1,high=nums.lenght-2
   if(n==1) return nums [0];
   if (nums [0]>nums [1]) return nums [0];
   if(nums [n-1]>nums[n-2]) return nums[n-1];
    2) while(low<=high)
     int mid=(low+high)/2;
     if ( nums[mid-1]<nums [mid] && nums[mid+1]<nums[mid]
              return nums[mid];
      if( nums[mid]<nums[mid+1]
            left=mid+1;
       else  high=mid-1;
     */

    public static int findPeakElement(int[] nums) {
    int low=0,high=nums.length-1,mid=0;
    int n = nums.length;
    if(n==1) return nums [0];
    if (nums [0]!= nums [1]) 
    	return nums [0]; 
    if(nums [n-1] != nums[n-2]) 
    	return nums[n-1];

    
    while(low<=high)
    {  
    	mid=(low+high)/2;
    
    	if ((mid%2==0 && nums[mid]==nums[mid+1])||(mid%2==1 && nums[mid]==nums[mid-1]))
      {
    	  low=mid+1; 
      }
      else {
    	  high=mid-1;
      }
    }
 return nums[mid];
}
    public static void main(String[] args) {
    	int[] nums={1,1};
        int peakElement = findPeakElement(nums);
        System.out.println(peakElement);
	}
}
