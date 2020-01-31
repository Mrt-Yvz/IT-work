package assignments.Ass8;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your x number: ");
		int x = sc.nextInt();
		System.out.print("Please enter your max number: ");
		int max = sc.nextInt();
		System.out.println(max(x,max));
	}

	public static int max(int x, int max) {
		if(x>max) {
			return max;
		}else return x;
	}
}
