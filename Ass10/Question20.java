package assignments.Ass10;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number to calculate its factorial: ");
		int n = sc.nextInt();
		int factorial = 1;
		for(int i=n;i>0;i--) {
			factorial *= i;
		}
		System.out.println(factorial);
	}

}
