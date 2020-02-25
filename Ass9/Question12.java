package assignments.Ass9;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word to be checked: ");
		String word = sc.nextLine();
		if(word.toLowerCase().charAt(0) == 'x'){
			word = word.substring(1,word.length());
		}
		if(word.toLowerCase().charAt(word.length()-1) == 'x'){
			word = word.substring(0,word.length()-1);
		}
		System.out.println(word); //there is no need to check if there was no X, They will be trimmed anyhow
	}

}
