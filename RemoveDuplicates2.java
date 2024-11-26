package datastructures.week2;

public class RemoveDuplicates2 {
	public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length; // If array length is 2 or less, no duplicates to remove

        int j = 2; // Pointer for the position of the next valid element

        // Traverse the array starting from the third element
        for (int i = 2; i < nums.length; i++) {
            // Check if the current element is different from the element at j - 2
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j; // Length of the modified array with at most two duplicates
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int length = removeDuplicates(nums);
        System.out.println("Length of array with at most two duplicates: " + length);

        System.out.print("Modified array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}


