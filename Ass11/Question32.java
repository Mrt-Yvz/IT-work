package assignments.Ass11;

import java.util.Arrays;
import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter your string no:" + (i+1));
			arr[i] = sc.next();
		}
		System.out.println(Arrays.toString(arr));
		for(String each : arr) {
			System.out.println(each.substring(0,3));
		}
	}		
}
