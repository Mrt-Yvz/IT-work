package assignments.Ass6;

public class Question2 {

	public static void main(String[] args) {
		int n = 10, first =0, second = 1, lastSum = 0;
		System.out.print("0,1");
		
		for(int i=3;i<=n;i++) {
			
			System.out.print(",");
			lastSum = second;
			second = first + second;
			first = lastSum;
			
			System.out.print(second);
		}

	}

}
