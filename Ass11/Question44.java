package assignments.Ass11;

public class Question44 {

	public static void main(String[] args) {
		
		double[] temps = {80, 88, 88, 84, 82, 78, 60, 68};
		double total = 0;
		for(double each:temps) {
			total += each;
		}
		System.out.println(total/temps.length);
	}

}
