package assignments.Ass10;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text: ");
		String text = sc.nextLine();
		System.out.println("Enter your Bad Word: ");
		String badWord = sc.nextLine();
		
		System.out.println(clean(text,badWord));
		System.out.println(clean2(text,badWord));
	}
	// Two possible solutions
	
	public static String clean(String text, String badWord) {
		return text.replaceAll(badWord,"");
	}
	
	public static String clean2(String text, String badWord) {
		while(text.contains(badWord)) {
			text = text.substring(0,text.indexOf(badWord)) + text.substring(text.indexOf(badWord) + badWord.length());
		}
		return text;
	}
	 
}
