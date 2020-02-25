package assignments.Ass10;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word(s): ");
		String text = sc.nextLine();
		text = text.replaceAll(" ", ""); //clear all spaces
		System.out.println(isPalindrome(text));
	}
	public static boolean isPalindrome(String text) {
		String reverse ="";
		for(int i=text.length()-1;i>=0;i--) {
				reverse += text.substring(i,i+1);
		}
		return reverse.equalsIgnoreCase(text);
	}
}
