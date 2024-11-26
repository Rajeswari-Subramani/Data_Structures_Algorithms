package datastructures.week2;

public class MissingNumber {
	/*
	 * Time complexity -o(log n) ==> Array divided by 2 at eacg
	 * Space Complexity o(1)
	 */
	public static int findMissingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Binary search approach using two pointers
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If the value at mid matches the index, the missing number is on the right
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                // Otherwise, it's on the left
                right = mid - 1;
            }
        }

        // The missing number is at the position where low points
        return left;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 2, 3, 5};
        System.out.println("Missing number: " + findMissingNumber(nums1)); // Output: 4

        int[] nums2 = {0, 1, 3, 4, 5, 6};
        System.out.println("Missing number: " + findMissingNumber(nums2)); // Output: 2

        int[] nums3 = {0};
        System.out.println("Missing number: " + findMissingNumber(nums3)); // Output: 1
    }
}


