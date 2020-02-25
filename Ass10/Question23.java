package assignments.Ass10;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = sc.next();
		int beginIndex = word.indexOf("bread");
		int endIndex = word.indexOf("bread",beginIndex+1);
		
		if(beginIndex == -1 || endIndex == -1) {
			System.out.println("nothing");
		}else System.out.println(word.substring(beginIndex+5,endIndex));

	}

}
