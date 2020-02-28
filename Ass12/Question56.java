package assignments.Ass12;

import java.util.Arrays;

public class Question56 {

	public static void main(String[] args) {
		
		int[] arr = {6,2,5,3};
		int dummy = arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = dummy;
		System.out.println(Arrays.toString(arr));
	}

}
