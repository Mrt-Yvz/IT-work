package assignments.Lab2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		int num,total=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Please enter a nonzero positive number: ");
			num = sc.nextInt();
			if(num>0) {
				break;
			}
			System.out.println("Invalid entry");
		}while(true);
		
		for(int i=1;i<=num;i++) {
			total += i;
		}
		System.out.println("Sum of all numbers from 1 to "+ num + "(included) is " + total);

	}
}