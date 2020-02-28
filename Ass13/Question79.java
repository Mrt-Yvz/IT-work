package assignments.Ass13;

import java.util.Arrays;

public class Question79 {

	public static void main(String[] args) {
		
		int[][] arr1 = {{1,1,1},{1,1,2}};
		int[][] arr2 = {{2,3,5},{1,1,2}};
		
		System.out.println(Arrays.deepToString(scalar(arr1,5)));
		System.out.println(Arrays.deepToString(scalar(arr2,2)));
	}
	public static int[][] scalar(int[][] matrix, int n){
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j] *= n;
			}
		}
		return matrix;
	}
}
