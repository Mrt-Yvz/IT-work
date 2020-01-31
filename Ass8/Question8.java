package assignments.Ass8;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number");
		int num = sc.nextInt();
		
		fib(num);

	}

	public static void fib(int num) {
		int f0 = 0, f1 = 1,sum = 0 ;
		if(num==1) {
			System.out.println("The 1st Fibonacci number is 0");
		}else if(num==2) {
			System.out.println("The 2nd Fibonacci number is 1");
		}else {
			for(int i=1;i<=num-2;i++) {
				sum = f0+f1;
				f0=f1;
				f1=sum;
				
			}
			System.out.println("The " + num + "th Fibonacci number is " + f1);
		}
	}
}
