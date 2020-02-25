package assignments.Ass9;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first three char word without a space: ");
		String word1 = sc.next();
		System.out.println("Enter your second three char word without a space: ");
		String word2 = sc.next();
		
		if(word1.length()!=3 || word2.length()!=3) {
			System.out.println("cannot merge");
		}else {
			String dummy = "";
			for(int i=0;i<word1.length();i++) {
				
				dummy = dummy + word1.charAt(i)+word2.charAt(i);
			}
			System.out.println(dummy);
		}
	}

}
