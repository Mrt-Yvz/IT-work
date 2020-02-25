package assignments.Ass9;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		
		System.out.println("Laptop price is: $" + calculatePrice(0));
		
	}
	
	public static double calculatePrice(double basePrice) {
		String size,storageType,cpu,resolution;
		int ram,memory;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Select screen size (13.3 / 15.0 / 17.3)");
			size = sc.next();
			if("13.3 15.0 17.3".contains(size)) {
				break;
			}else System.out.println("Invalid entry!");
		}
		while(true) {
			System.out.println("Select CPU type (i3 / i5 / i7)");
			cpu = sc.next();
			if("i3 i5 i7".contains(cpu.toLowerCase())) {
				break;
			}else System.out.println("Invalid entry!");
		}
		while(true) {
			System.out.println("Select RAM size (should be 4 or its multiples)");
			ram = sc.nextInt();
			if(ram %4 == 0) {
				break;
			}else System.out.println("Invalid entry!");
			
		}sc.nextLine();
		while(true) {
			System.out.println("Select storage type (HDD / SSD)");
			storageType = sc.next();
			if("hdd ssd".contains(storageType.toLowerCase())) {
				break;
			}else System.out.println("Invalid entry!");
		}
		while(true) {
			System.out.println("Enter memory size (should be 500 or its multiples)");
			memory = sc.nextInt();
			if(memory %500 == 0) {
				break;
			}else System.out.println("Invalid entry!");
			
		}sc.nextLine();
		while(true) {
			System.out.println("Enter screen resolution (FULL HD / 4K)");
			resolution = sc.nextLine();
			if(resolution.equalsIgnoreCase("full hd") || resolution.equalsIgnoreCase("4k")) {
				break;
			}else System.out.println("Invalid entry!");
		}
		
		return display(size) + processor(cpu) + raMemory(ram) + hardDisk(storageType,memory) + screenRes(resolution);
	}
	
	public static double display(String size) {
		switch(size) {
		case "13.3":
			return 200;
		case "15.0":
			return 300;
		case "17.3":
			return 400;
		default:
			return 0;		
		}
	}
	public static double processor(String cpu) {
		switch(cpu.toLowerCase()) {
		case "i3":
			return 150;
		case "i5":
			return 250;
		case "i7":
			return 350;
		default:
			return 0;		
		}
	}
	public static double raMemory(int ram) {
		return ram/4*50;
	}
	public static double hardDisk(String storageType, int memorySize) {
		switch(storageType.toLowerCase()) {
		case "hdd":
			return memorySize/500*50;
		case "ssd":
			return memorySize/500*100;
		default:
			return 0;
		}
	}
	public static double screenRes(String resolution) {
		switch(resolution.toLowerCase()) {
		case "full hd":
			return 100;
		case "4k":
			return 200;
		default:
			return 0;
		}
	}
}
