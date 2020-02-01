package assignments.Lab2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		int cook, calories;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of cookies you ate: ");
		cook = sc.nextInt();
		calories = cook*75; // 300/(40/10)=75 cal per cookie
		System.out.println("You consumed a total of " + calories +" calories");
	}

}
