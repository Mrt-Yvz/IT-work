package assignments.Ass14_OOP;

public class Question10 {

	public static void main(String[] args) {
		
		System.out.println(Calc.minus(1,1));
		System.out.println(Calc.plus(10,1));
	}

}

class Calc {

	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
}
