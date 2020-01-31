package assignments.Ass8;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your 1st condition! true/false: ");
		boolean cond1 = sc.nextBoolean();
		System.out.print("Please enter your 2nd condition! true/false: ");
		boolean cond2 = sc.nextBoolean();
		System.out.print("Please enter your 3rd condition! true/false: ");
		boolean cond3 = sc.nextBoolean();
		
		System.out.println(threeLocks(cond1,cond2,cond3));
	}

	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		return ((a && b)|| c);
	}
}
