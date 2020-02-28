package assignments.Ass12;

import java.util.Scanner;

public class Question53 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[] points = new double[7];
		double smallest = 10, largest = 0, total = 0,diff;
		
		for(int i=0;i<7;i++) {
			System.out.println("Enter score for judge " + (i+1) + ":");
			points[i] = sc.nextDouble();
			if(points[i]<smallest) {
				smallest = points[i];
			}else if(points[i]>largest) {
				largest = points[i];
			}
			total += points[i];	
		}
		
		total -= largest + smallest;
		System.out.println("Enter difficulty: ");
		diff = sc.nextDouble();
		total = total * diff * 0.6;
		System.out.printf("Total: %.2f",total);
	}

}
