package assignments.Ass10;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = sc.nextLine();
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		System.out.println(limit(text,num));

	}
	public static String limit(String text,int num) {
		return text.substring(0,num);
	}
}
