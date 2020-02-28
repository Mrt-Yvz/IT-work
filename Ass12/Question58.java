package assignments.Ass12;

import java.util.Arrays;

public class Question58 {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{5,33,9}};
		int max=0;
		
		for(int[] each:arr) {
			for(int num:each) {
				if(num>max) {
					max=num;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = max;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
