package assignments.Ass10;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = sc.next();
		System.out.println("Enter the number of letters in the prefix: ");
		int num = sc.nextInt();
		String prefix = word.substring(0,num);
		int counter=0;
		
		while(word.contains(prefix)) {
			counter++;
			int index = word.indexOf(prefix);
			word = word.substring(index+num);
		}
		if(counter==1) {
			System.out.println("false \n" + prefix + " appears once only");
		}else if(counter==2) {
			System.out.println("true \n" + prefix + " appears twice");
		}else System.out.println("true \n" + prefix + " appears " + counter + " times");
	}

}
