package assignments.Ass10;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your HTML : ");
		String html = sc.nextLine();
		if(!html.contains("<html>")) {
			System.out.println("Invalid input!");
		}else {
			int beginIndex = html.indexOf('"');
			int endIndex = html.indexOf('"',beginIndex+1)+1;
			System.out.println(html.substring(beginIndex,endIndex));
		}

	}

}
