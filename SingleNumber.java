package datastructures.week2;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SingleNumber {
	//Initiate an array
	//initiate the count is 0
	//Traverse all the elements and add the count for each element
    //check the count equal to zero 1 return the element
	//No element has 0 count, return as null
	
	@Test
	public void test2() {
		int[] nums  =  {0,1,1,2,2,0,5};
		SingleNumber obj = new SingleNumber();
		System.out.println("The Sinlge number in the array is: " +obj.singleNumber(nums));
		
	}
	public Object singleNumber(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j])
					count++;
			}
			if (count == 1)
				return nums[i];
		}
		return null;
	}
}
