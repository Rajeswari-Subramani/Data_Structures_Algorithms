package week5.day1;

import org.testng.annotations.Test;

public class SearchInsertPos {
	
	//Initialiwe the left, right,mid
	//while(lefe<+right)
	//if(mid==target) return mid
	//if(mid>target), high=mid+1
	//if(mid<target), low=mid-1
	//return mid;
	
	@Test
    public void testOne()
    {
        int[] nums={1,3,5,6};
        int target=5;
        int i = searchInsert(nums, target);
        System.out.println(i);
    }

    @Test
    public void testTwo()
    {
        int[] nums={1,3,5,6};
        int target=2;
        int i = searchInsert(nums, target);
        System.out.println(i);
    }

    @Test
    public void testThree()
    {
        int[] nums={1,3,5,6};
        int target=7;
        int i = searchInsert(nums, target);
        System.out.println(i);
    }

	private int searchInsert(int[] nums, int target) {
		int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Narrow search to right half
            } else {
                right = mid - 1; // Narrow search to left half
            }
        }

        // At the end of the loop, left is the insertion point
        return left;
    }
        }