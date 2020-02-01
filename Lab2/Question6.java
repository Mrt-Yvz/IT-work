package assignments.Lab2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		double purchase,sTax,cTax;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of your purchase: ");
		purchase = sc.nextDouble();
		sTax = 0.04 * purchase;
		cTax = 0.02 * purchase;
		
		System.out.println("Amount of Purchase \t: $" + purchase);
		System.out.println("State Tax \t\t: $" + sTax);
		System.out.println("County Tax \t\t: $" + cTax);
		System.out.println("Total Tax \t\t: $" + (sTax+cTax));
		System.out.println("Grand Total \t\t: $" + (purchase+sTax+cTax));
	}

}
