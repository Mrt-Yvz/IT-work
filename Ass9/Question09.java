package assignments.Ass9;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email : ");
		String email = sc.next();
		String[] emailArr = email.split("@");
		String nameSurname = emailArr[0];
		
		if(!nameSurname.contains("_")) {
			System.out.println(email);
		}else {
			String name = nameSurname.split("_")[0];
			String surName = nameSurname.split("_")[1];
			System.out.println(surName + "_" + name + "@" + emailArr[1]);
		}
	}

}
