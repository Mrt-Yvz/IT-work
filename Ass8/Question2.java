package assignments.Ass8;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		cube();

	}
	public static void cube() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("result : " + (num*num*num));
	}

}
