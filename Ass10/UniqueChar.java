package assignments.Ass10;

import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = sc.next();
		String result = "";
		String check = "";
		int i=0;
		do {
			if(check.contains(word.substring(i,i+1))) { // check if the i th char has been previously added to the list
				i++;
			}else if(word.substring(i+1).contains(word.substring(i,i+1))){ // look further from the i th char to see if there is any other
				check += word.charAt(i);
				i++;
			}else { //if here, i th char is unique, update result and check
				check += word.charAt(i);
				result += word.charAt(i);
				i++;
			}
		}while(i<word.length());
		System.out.println(result);
	}
}

