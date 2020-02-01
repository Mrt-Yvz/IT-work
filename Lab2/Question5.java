package assignments.Lab2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		double tax,tip,price;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the price for your meal: ");
		price = sc.nextDouble();
		tax = price * 0.0675;
		tip = 0.2 * (price+tax);
		System.out.println("Meal charge \t: $" + price);
		System.out.println("Tax \t\t: $" + tax);
		System.out.println("Tip \t\t: $" + tip);
		System.out.println("Total bill \t: $" + (price+tax+tip));
	}

}
