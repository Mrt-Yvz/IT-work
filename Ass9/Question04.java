package assignments.Ass9;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word without a space: ");
		String word = sc.next();
		int len = word.length();
		if(len % 2 == 1 && len > 4) {
			System.out.println(word.substring((len/2)-1,(len/2)+2));
		}else System.out.println("invalid");

	}

}
