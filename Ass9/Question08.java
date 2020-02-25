package assignments.Ass9;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your the text to be checked: ");
		String text = sc.nextLine();
		if(text.toLowerCase().contains("alejandro")) {
			System.out.println("Read this email!");
		}else System.out.println("Don't read!");
	}

}
