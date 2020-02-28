package assignments.Ass12;

import java.util.Arrays;

public class Question59 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		
		System.out.println(Arrays.toString(mergR(arr1,arr2)));

	}
	public static int[] mergR(int[] arr1,int[] arr2) {
		int[] combined = new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			combined[i] = arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			combined[arr1.length+i] = arr2[i];
		}
		return combined;
	}
}
