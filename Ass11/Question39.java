package assignments.Ass11;

import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email address: ");
		String email = sc.next();

		if(email.length() - email.replaceAll("@","").length()  == 1) {
			System.out.println("Email Id: " + email.split("@")[0]);
			System.out.println("Email domain: " + email.split("@")[1]);		
		}else System.out.println("Invalid email");
	}

}
