package assignments.Ass11;

import java.util.Arrays;

public class Question49 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		int[] arr1 = {1};
		
		System.out.println(Arrays.toString(firstTwo(arr)));
		System.out.println(Arrays.toString(firstTwo(arr1)));
	}
	
	public static int[] firstTwo(int[] arr) {
		if(arr.length<2) {
			return arr;
		}else return Arrays.copyOfRange(arr,0,2);
		
	}
}
