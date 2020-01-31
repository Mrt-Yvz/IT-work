package assignments.Ass8;
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		isPalindrome(num);
	}

	public static void isPalindrome(int num) {
		if(num/1000 == num%10 && num%1000/100 == num%100/10) {
			System.out.println(true);
		}else System.out.println(false);
	}
}
