package assignments.Ass12;

import java.util.Arrays;

public class Question70 {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4};
		System.out.println(Arrays.toString(do_switch(array)));

	}
	public static int[] do_switch(int[] arr) {
		int dummy = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = dummy;
		return arr;
		
	}
}
