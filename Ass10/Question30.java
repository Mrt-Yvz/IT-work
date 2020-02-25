package assignments.Ass10;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first word (At least 3 characters): ");
		String s1 = sc.next();
		System.out.println("Enter your second word: ");
		String s2 = sc.next();
		
		System.out.println(at3(s1,s2));
	}
	public static String at3(String s1,String s2) {
		return s1.substring(0,3) + s2 + s1.substring(3);
	}
}
