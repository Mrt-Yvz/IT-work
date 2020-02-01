package assignments.Lab2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		int males,females;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number males in the class: ");
		males = sc.nextInt();
		System.out.print("Enter the number females in the class: ");
		females = sc.nextInt();
		
		System.out.println("Percentage of the males in the class is %" + ((double)males/(males+females)*100) );
		System.out.println("Percentage of the females in the class is %" + ((double)females/(males+females)*100) );
	}

}
