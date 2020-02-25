package assignments.Ass10;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = sc.next();
		
		System.out.println(uniqueChars(word));
	}
	
	public static String uniqueChars(String word) {
		String result = "";
		for(int i = 0;i<word.length();i++) {
			if( ! result.contains(word.substring(i,i+1))) {
				result += word.charAt(i);
			}
		}
		return result;
	}
	
}
