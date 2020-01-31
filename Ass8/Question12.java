package assignments.Ass8;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first condition! true/false: ");
		boolean bool1 = sc.nextBoolean();
		System.out.print("Please enter your second condition! true/false: ");
		boolean bool2 = sc.nextBoolean();
		System.out.println(hamletQuote(bool1,bool2));
	}

	public static boolean hamletQuote(boolean cond1, boolean cond2) {
		return (cond1||cond2);
	}
}
