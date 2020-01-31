package assignments.Ass8;

import java.util.Scanner;

public class Questiýn13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your use of water: ");
		double water = sc.nextDouble();
		System.out.println("Your bill is $" + waterTax(water));
	}

	public static double waterTax(double water) {
		
		double bill = 0;
		
		if(water<=50) {
			bill = water*0.6;
		}else if(water<=100) {
			bill = water*0.9;
		}else if(water<=150) {
			bill = 50 + water*0.9;
		}else {
			bill = 100 + water*0.9;
		}
		return bill;
	}
}
