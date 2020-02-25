package assignments.Ass10;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = sc.next();
		int counter=0;
		while(word.toLowerCase().contains("java")) {
			counter++;
			int index = word.indexOf("java");
			word = word.substring(index+4);
		}
		System.out.println(counter);
	}

}
