package assignments.Ass9;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email : ");
		String email = sc.next();
		
		String[] emailArr = email.split("@");
		String name = emailArr[0].split("_")[0];
		String surName = emailArr[0].split("_")[1];
		String domain = emailArr[1].split("\\.")[0];
		String topDomain = emailArr[1].substring(domain.length()+1,emailArr[1].length()); // .split is not used iot avoid confusion (e.g co.uk)
		
		name = name.substring(0,1).toUpperCase() + name.substring(1,name.length());
		surName = surName.substring(0,1).toUpperCase() + surName.substring(1,name.length());
		System.out.println("First name: " + name);
		System.out.println("Last name: " + surName);
		System.out.println("Domain: " + domain);
		System.out.println("Top-Level Domain: " + topDomain);
	}

}
