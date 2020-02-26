package assignments.Ass11;

import java.util.Arrays;

public class Question43 {

	public static void main(String[] args) {
		int[] nums = {4, 3, 2, 44, 1, 100, 55};
		int dummy;
		
		System.out.println("nums ==> " + Arrays.toString(nums));
		
		for(int i=0;i<nums.length/2;i++) {
			dummy = nums[i];
			nums[i] = nums[nums.length-1-i];
			nums[nums.length-1-i] = dummy;
		}
		System.out.println("Reversed ==> " + Arrays.toString(nums));
	}

}
