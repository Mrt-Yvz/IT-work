package assignments.Ass7;

public class Question6 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1;i<=5;i++) {
			sum = i;
			System.out.print(i + " ");
			for(int j=1;j<i;j++) {
				sum += (5-j);
				System.out.print(sum + " ");
			}
			System.out.println();
		}

	}

}
