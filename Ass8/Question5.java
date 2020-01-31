package assignments.Ass8;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sign(num);

	}
	public static void sign(int num) {
		
		if(num>0) {
			System.out.println("1");
		}else if (num<0){
			System.out.println("-1");
		}else System.out.println("0");


	}

}
