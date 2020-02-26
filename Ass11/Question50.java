package assignments.Ass11;

import java.util.Arrays;

public class Question50 {

	public static void main(String[] args) {
		
		int[] arr = {4,5,6};
		int[] arr1 = {0};
		int[] arr2 = {1,2,3,4};
		
		System.out.println(Arrays.toString(doubleSize(arr)));
		System.out.println(Arrays.toString(doubleSize(arr1)));
		System.out.println(Arrays.toString(doubleSize(arr2)));
	}
	public static int[] doubleSize(int[] arr) {
		int[] newArray = new int[arr.length*2];
		int j=0;
		
		for(int i=newArray.length-arr.length;i<newArray.length;i++) {
			newArray[i] = arr[j];
			j++;
		}
		return newArray;
	}
}
