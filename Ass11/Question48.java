package assignments.Ass11;

import java.util.Arrays;
import java.util.Scanner;

public class Question48 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number to convert to binary: ");
		int decimal = sc.nextInt();
		String dummy = "";

		while(decimal != 0) {
			dummy = dummy + " " + decimal % 2;
			decimal /= 2;
		}
		String[] arr = dummy.trim().split(" ");
		int[] binary = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			binary[i] = Integer.parseInt(arr[arr.length-1-i]);
		}
		System.out.println(Arrays.toString(binary));
	}

}
