package assignments.Ass13;

import java.util.Arrays;
import java.util.Scanner;

public class Question71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of your array: ");
		int len = sc.nextInt();
		int[] nums = new int[len];
		
		System.out.println(Arrays.toString(populate(nums)));

	}
	public static int[] populate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		return arr;
	}
}
