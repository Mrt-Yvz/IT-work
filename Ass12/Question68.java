package assignments.Ass12;

import java.util.Arrays;

public class Question68 {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 40, 50, 3, 1};
		int[] arr2 = {11, 0, 500, 44, 1101};
		System.out.println(Arrays.toString(addElements(arr1,arr2)));

	}
	public static int[] addElements(int[] arr1,int[] arr2) {
		int[] summed = new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			summed[i] = arr1[i] + arr2[i];
		}
		return summed;
	}
}
