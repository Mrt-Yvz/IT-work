package assignments.Ass8;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		
		plus();

	}
	public static void plus() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.println("result : " + (num1+num2));
	}

}
