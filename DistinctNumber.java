package datastructures.week2;

import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;


public class DistinctNumber {
	public static void main(String[] args) {
		
	
		int[] nums  =  {1,5,3,3,4,6,7,7,8};
	

		for (int i = 0; i <= nums.length; i++) {
			int count=0;
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]!= nums[j]) 
					count++;
					//else if(nums[i]== nums[j]) 
						//count++;
			}
				System.out.println(count);
				break;
	
}
		}
	}

	


