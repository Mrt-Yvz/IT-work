package assignments.Lab2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		int largest, smallest,first,next;
		byte cont;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		first = sc.nextInt();
		largest = first;  //puts a reference for largest 
		smallest = first;  // puts a reference for smallest
		
		do {		// main loop for receiving entry and calculating the smallest and the largest numbers
			System.out.print("Please enter your next number: ");
			next = sc.nextInt();
			largest = largest(next,largest);
			smallest = smallest(next,smallest);
			do{		// in order to assure a proper entry (0 or 1)
				System.out.print("Do you want to enter another number? : 0-No, 1- Yes ");
				cont = sc.nextByte();
				if(cont == 0 || cont ==1) {
					break;
				}
				System.out.println("Please choose 0 or 1");
			}while(true);
		}while(cont == 1);
		
		System.out.println("Smallest number is: " + smallest);
		System.out.println("Largest number is: " + largest);
	}

	public static int largest(int num,int largest) {
		if(num>largest) {
			return num;
		}else return largest;
	}
	public static int smallest(int num,int smallest) {
		if(num<smallest) {
			return num;
		}else return smallest;
	}
}
