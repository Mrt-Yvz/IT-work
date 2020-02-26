package assignments.Ass11;

import java.util.Arrays;

public class Question38 {

	public static void main(String[] args) {
		int[] nums1 = {2,1,2,3,4};
		int[] nums2 = {2,2,0,3,5};
		int[] nums3 = {1,3,5,7,9};
		
		countEvens(nums1);
		countEvens(nums2);
		countEvens(nums3);
	}
	public static void countEvens(int[] arr) {
		int counter = 0;
		System.out.print(Arrays.toString(arr) + " ==> ");
		for(int each:arr) {
			if(each % 2 == 0) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
