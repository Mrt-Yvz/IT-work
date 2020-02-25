package assignments.Ass9;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word without a space: ");
		String word = sc.next();
		int len = word.length();
		
		System.out.println(word.substring(0,len/2)+word.substring(0,len/2));
		
	}

}
