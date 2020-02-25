package assignments.Ass10;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = sc.next();
		System.out.println("Enter your seperator: ");
		String seperator = sc.next();
		System.out.println("Enter the count of occurences of your word (Should be at least 1: ");
		int counter = sc.nextInt();
		String result =word;
		while(counter>1) {
			result += seperator + word;
			counter--;
		}
		System.out.println(result);
	}

}
