package assignments.Ass8;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your buying price: ");
		int buy = sc.nextInt();
		System.out.print("Please enter your selling price: ");
		int sell = sc.nextInt();	
		System.out.println(c_profits(buy,sell));
	}

	public static String c_profits(int buyPrice, int sellPrice) {
		if(sellPrice>buyPrice) {
			return"profit";
		}else if(buyPrice>sellPrice) {
			return "loss";
		}else return "no loss";
	}
}
