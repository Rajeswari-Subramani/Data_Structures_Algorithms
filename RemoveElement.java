package datastructures.week2;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        
		 int left=0;
for (int right = 0; right < nums.length; right++) {
	 if(nums[right]!=val) {
		 nums[left] =nums[right];
		 left++;
	 }
	
}
return left;
 }
	public static void main(String[] args) {
		int[] nums1 =  {3,2,2,3};
		int val1=3;
		RemoveElement obj =new RemoveElement();
		System.out.println(obj.removeElement(nums1, val1));
		
		int[] nums2 =  {0,1,2,2,3,0,4,2};
		int val2=2;
		System.out.println(obj.removeElement(nums2, val2));
	}
    }


