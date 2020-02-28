package assignments.Ass12;

public class Question57 {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,6},{9,8,9}};
		int sum1 = 0, sum2 = 0;
		
		for(int i=0;i<matrix.length;i++) {
			sum1 += matrix[i][i];
			sum2 += matrix[i][matrix.length-1-i];
		}
		System.out.println(Math.abs(sum1-sum2));
	}

}
