package assignments.Ass13;

import java.util.ArrayList;
import java.util.Arrays;

public class Question74 {

	public static void main(String[] args) {
		Integer[] arr1 =  {1,1,2,3,1,4};
		ArrayList<Integer> nums1 = new ArrayList<>();
		nums1.addAll(Arrays.asList(arr1));
		
		Integer[] arr2 =  {3,4,3,3};
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.addAll(Arrays.asList(arr2));
		
		System.out.println(removeInst(nums1,1));
		System.out.println(removeInst(nums2,4));
		
	}
	public static ArrayList<Integer> removeInst(ArrayList<Integer> arr, int num){
		Integer dummy = num;
		while(arr.contains(dummy)) {
			arr.remove(dummy);
		}
		return arr;
	}
}
