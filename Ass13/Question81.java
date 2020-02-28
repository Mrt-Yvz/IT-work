package assignments.Ass13;

import java.util.Random;
import java.util.Scanner;

public class Question81 {

	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		
		slotMachine();
	}
	
	public static void slotMachine() {
		
		double bid, totalPay=0, won, totalWon=0;
		String go="Y";
		int rate;
		while(go.equals("Y")) {
			
			System.out.println("Enter your money to bid: $");
			bid = sc.nextDouble();
			sc.nextLine();
			totalPay += bid;
			
			rate = wordSelection();
			won = rate*bid;
			System.out.println("You won $" + won + " !");
			
			totalWon += won;
			
			System.out.println("Do you want to play again? Y-Yes N-No: ");
			go= sc.next().toUpperCase();
		}
		
		System.out.println("Total amount you entered : $" + totalPay);
		System.out.println("Total amount you won : $" + totalWon);
		if(totalPay>totalWon) {
			System.out.println("You lost $" + (totalPay-totalWon) + ". It's a bad day for you!");
		}else System.out.println("You earned $" + (totalWon-totalPay) + ". It must be your lucky day!");	
	}
	
	public static int wordSelection() {
		String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
		String[] luckyWords = new String[3];
		System.out.println("Here your lucky words....");
		
		for(int i=0;i<3;i++) {
			luckyWords[i] = words[rd.nextInt(6)];
			System.out.println("// " + luckyWords[i] + " //");
		}
		return assesment(luckyWords);
	}
	
	public static int assesment(String[] luckyWords) {
		int rate = 0;
		if(luckyWords[0] == luckyWords[1] && luckyWords[0] == luckyWords[2]) {
			rate = 3;
		}else if(luckyWords[0] == luckyWords[1] || luckyWords[0] == luckyWords[2] || luckyWords[1] == luckyWords[2]) {
			rate = 2;
		}
		return rate;
	}
}
