package assignments.Ass9;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		String serviceQuality;
		boolean isSplit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the requested information below");
		
		while(true) {  // in order to avoid invalid entry
			System.out.print("Split (Yes/No): \t\t");
			String split = sc.next();
			if("yes no".contains(split.toLowerCase())){
				if(split.toLowerCase().equals("yes")){
				isSplit = true;
				}else isSplit = false;
				break;
			}else System.out.println("Invalid entry!");
		}
		
		System.out.print("\nNumber of people: \t");
		int numberPeople = sc.nextInt();
		System.out.print("\nCheck amount: \t");
		double checkAmount = sc.nextDouble();
		
		while(true) {  // in order to avoid invalid entry
			System.out.print("\nSevice Quality (Poor/Fair/Good/Great/Excellent): ");
			serviceQuality = sc.next();
			if ("poor fair good great excellent".contains(serviceQuality)){
				break;
			}else System.out.println("Invalid entry!");
		}
		
		tipCalculator(isSplit,numberPeople,checkAmount,serviceQuality);
	}
	
	public static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, String serviceQuality) {
		double totalPayment, tip=0;
		int payShare;
		String numOfPeople = "";
		switch(serviceQuality.toLowerCase()) {
		case "poor":
			tip = checkAmount*0.05;
			break;
		case "fair":
			tip = checkAmount*0.10;
			break;
		case "good":
			tip = checkAmount*0.15;
			break;
		case "great":
			tip = checkAmount*0.20;
			break;
		case "excellent":
			tip = checkAmount*0.25;
			break;
		default:
			System.out.println("");
		}
		totalPayment = checkAmount+tip;
		
		if(isSplit) {
			payShare = numberPeople;
		}else payShare = 1;
		
		for(int i=0;i<payShare;i++) { // if not split, only one &
			numOfPeople += "&";
		}
		System.out.println("Number of people entered: \t" + numOfPeople);
		System.out.println("Total to pay: \t\t\t" + totalPayment);
		System.out.println("Total tip: \t\t\t" + tip);
		System.out.println("Total per person: \t\t" + totalPayment/payShare);
		System.out.println("Tip per person: \t\t" + tip/payShare);
	
	}

}
