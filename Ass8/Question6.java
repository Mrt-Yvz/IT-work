package assignments.Ass8;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sign(num);

	}
	public static void sign(int num) {
		
		for(int i=1;i<=3;i++) {
			System.out.print((num+i) + " ");
		}

	}
}