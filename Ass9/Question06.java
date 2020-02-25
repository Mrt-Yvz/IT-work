package assignments.Ass9;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word without a space: ");
		String word = sc.next();
		if(word.length()<5) {
			System.out.println("Too short!");
		}else if(word.length() > 5) {
			System.out.println("Too long!");
		}else {
			String reverse="";
			for(int i=word.length()-1;i>=0;i--) {
				reverse = reverse + word.charAt(i);
			}
			System.out.println(reverse);
		}
	}

}
