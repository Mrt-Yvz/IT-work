package assignments.Ass11;

import java.util.Arrays;

public class Question36 {

	public static void main(String[] args) {
		int[] nums1 = {1,5,5,1,1};
		int[] nums2 = {1,8,5,5,0};
		int[] nums3 = {1,5,4,1,5};
		int[] nums4 = {1,4,4,1,99};
		
		check5(nums1);
		check5(nums2);
		check5(nums3);
		check5(nums4);

	}
	public static void check5(int[] nums) {
		System.out.print(Arrays.toString(nums) + " ==> ");
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==5 && nums[i+1]==5) {
				System.out.println(true);
				return;
			}
		}
		System.out.println(false);
	}
}
