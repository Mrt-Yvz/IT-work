package assignments.Ass11;

import java.util.Arrays;

public class Question51 {

	public static void main(String[] args) {
		int [] outer = {1,2,4,6};
		int[] inner = {2,4};
		int counter = 0;
		
		// Solution 1
		int j=0;
		for(int i=0;i<inner.length;i++) {
			while(j<outer.length) {
				if(outer[j] == inner[i]) {
					counter++;
					j++;
					break;
				}
				j++;
			}
		}
		System.out.println(counter == inner.length);
		
		// Solution 2
		boolean flag = true;
		for(int i=0;i<inner.length;i++) {
			if(Arrays.binarySearch(outer, inner[i]) < 0) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}

}
