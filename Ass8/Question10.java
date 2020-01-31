package assignments.Ass8;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int x = sc.nextInt();
		
		System.out.println("Is " + x + " even? "  + isEven(x));
	}

		public static boolean isEven(int num) {
			if(num%2 == 0) {
				return true;
			}else return false;
		}
}
