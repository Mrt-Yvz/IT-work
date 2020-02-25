package assignments.Ass10;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your starting letter: ");
		String startingChar = sc.next();
		System.out.println("Enter your ending letter: ");
		String endingChar = sc.next();
		int startIndex = alphabet.indexOf(startingChar.toLowerCase());
		int endIndex = alphabet.indexOf(endingChar.toLowerCase())+1;
		
		if(Character.isUpperCase(startingChar.charAt(0))) {
			System.out.println(alphabet.substring(startIndex,endIndex).toUpperCase());
		}else System.out.println(alphabet.substring(startIndex,endIndex));
	}
}
