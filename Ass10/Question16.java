package assignments.Ass10;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		String word;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your word with at least 4 chars: ");
			word = sc.next();
			word = word.toLowerCase();
			if(word.length()>3) {
				break;
			}else System.out.println("Your word has to be AT LEAST 4 characters");
		}
		System.out.println(word.indexOf("java") ==1 || word.indexOf("java") ==0);
	}

}
