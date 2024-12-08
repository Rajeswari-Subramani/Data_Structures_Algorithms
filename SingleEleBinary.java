package week5.day2;

public class SingleEleBinary {
	
	
	public static int singleNonDuplicate(int[] nums) {
		int low = 0, high = nums.length - 1, mid = 0;
		int n = nums.length;
		if (n == 1)
			return nums[0];
		if (nums[0] != nums[1])
			return nums[0];
		if (nums[n - 1] != nums[n - 2])
			return nums[n - 1];

		while (low <= high) {
			mid = (low + high) / 2;

			if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return nums[low];

	}

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		int i = singleNonDuplicate(nums);
		System.out.println(i);
	}
}