package datastructures.week2;

import java.util.Arrays;

public class MergeSortedArray {
/*
 * pseudo code:
- Initialise 3 pointers p2=n-1, p1=m-1, idx=arr1. length-1
- while(p1>=0 && p2>=0)
- compare the elements at indices pl and p2 and place in id index
- if arri[pll<arr2[p2]
- arri[idx]=arr[p2];
p2--;
1dxーー
- if arri[pil>arrIp2!
- arri[idx]=arr1[p1];
index--;
p1--
- if arr1[p1]==arr2[p21
- arri[idx]=arr1[p1] // arr2[p2] ;
index--:
PI--；1p2--
 */
	public static int[] mergeSort(int[] nums1,int m,int[] nums2,int n) {
	int p1=m-1;
	int p2=n-1;
	int index=m+n-1;
	
	while(p1>=0 && p2>=0) {
		if (nums1[p1]< nums2[p2]) {
			nums1[index]=nums2[p2];
			p2--;
			index--;
		}else if(nums1[p1]> nums2[p2]) {
			nums1[index]=nums1[p1];
			p1--;
			index--;
	}else 
		if (nums1[p1]==nums2[p2]) {
			nums1[index]=nums1[p1];
			index--;
			p1--;
			p2--;
		}
	}
	return nums1;

	
	}
	public static void main(String[] args) {
		int[] nums1 = {2,3,4,0,0,0};
		int m=3;
		int n=3;
		int[] nums2 = {4,5,6};
		System.out.println(Arrays.toString(mergeSort(nums1, m, nums2, n)));
		
	}
}
	
	


