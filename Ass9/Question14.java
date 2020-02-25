package assignments.Ass9;

import java.util.Scanner;

public class Question14 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		premiumCalculation();
	}
	
	public static void premiumCalculation() {
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Do you have a US driver license? Yes/No");
		String driverLicense = sc.nextLine();
		if(driverLicense.equalsIgnoreCase("No")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		System.out.println("Enter your zip code: ");
		int zipCode = sc.nextInt();
		sc.nextLine();
		double premium = zipCodeCheck(zipCode) + ownership() + carUsage();
		
		System.out.println("How old are you?");
		int age = sc.nextInt();
		if(age<16) {
			System.out.println("Invalid data! \nProgram has stopped");
			System.exit(0);
		}
		sc.nextLine();
		premium = ageCheck(age, premium);
		premium += drivingExperience(age);
		premium = carAccident(premium);
		premium = contInsurance(premium);
		sc.nextLine();
		System.out.println("What is the highest level of education you have completed?");
		String educationLevel = sc.nextLine();
		premium = levelOfEdu(educationLevel,premium);
		
		String referenceNumber = name.substring(0,2).toUpperCase() + age + name.substring(name.length()-2).toUpperCase() + zipCode + educationLevel.toUpperCase();
		
		System.out.println(name + " here's your quote!");
		System.out.println("Start Your Policy Today For: $" + premium);
		System.out.println("Reference number: " + referenceNumber);
		
	}
	public static double zipCodeCheck(int zip) {
		
		switch(zip) {
		case 20910:case 20740:
			return 60;
		case 22102:case 22103:
			return 30;
		default:
			return 50;
		}	
	}
	public static double ownership() {
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		String owner = sc.next();
		
		switch(owner.toLowerCase()) {
		case "owned":
			return 10;
		default:
			return 20;
		}
	}
	public static double carUsage() {
		System.out.println("How is this vehicle primarily used? (Business/Pleasure/Commute)");
		String owner = sc.next();
		switch(owner.toLowerCase()) {
		case "business":
			return 50;
		case "pleasure":
			return 10;
		case "commute":
			return 20 + drivesToWork();
		default:
			return 0;
		}
	}
	public static double drivesToWork() {
		System.out.println("Days Driven To Work And/Or School");
		int days = sc.nextInt();
		sc.hasNextLine();
		if(days>0) {
			return (days*5 + milesToWork());
		}else return 0;
	}
	public static double milesToWork() {
		System.out.println("Miles Driven To Work And/Or School");
		int miles = sc.nextInt();
		sc.hasNextLine();
		return miles;
	}
	public static double ageCheck(int age,double premium) {
		
		if(age<18){
			premium *= 20;
		}else if(age<22) {
			premium *= 6;
		}else if(age<25) {
			premium *= 2;
		}
		return premium;
	}
	

	public static double drivingExperience(int age) {
		System.out.println("Enter the year of your driving experience: ");
		int year = sc.nextInt();
		sc.nextLine();
		if(year==0 ||age-year < 16) {
			System.out.println("Invalid data! \nProgram has stopped");
			System.exit(0);
			return 0;
		}else return -5*year;
	}
	public static double carAccident(double premium) {
		System.out.println("Have you had any accidents in the last 5 years?Yes/No");
		String accident = sc.next();
		if(accident.equalsIgnoreCase("yes")) {
			System.out.println("How many?");
			int numAcc = sc.nextInt();  
			premium *= (0.2*numAcc);
		}return premium;
	}
	public static double contInsurance(double premium) {
		System.out.println("Have you had continuous insurance for the past 12 months?");
		String insCondition = sc.next();
		if(insCondition.equalsIgnoreCase("no")) {
			premium *=2;
		}return premium;
	}
	public static double levelOfEdu(String educationLevel,double premium) {
		
		if("phd bachelors masters".contains(educationLevel.toLowerCase())){
			premium *= 0.95;
		}else if("doctors".contains(educationLevel.toLowerCase())){
			premium *= 0.9;
		}else if("less than high school".contains(educationLevel.toLowerCase())){
			premium *= 1.05;
		}return premium;
	}
	
}
