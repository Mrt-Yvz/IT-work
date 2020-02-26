package assignments.Ass11;

import java.util.Arrays;

public class Question47 {

	public static void main(String[] args) {
		long[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};
		int i = 1;
		
		System.out.println("Day 0 \t" + Arrays.toString(inhabitants));
		
		while( ! Arrays.toString(inhabitants).contains("0, 0, 0, 0, 0, 0, 0, 0")) {
			
			for(int j=0;j<inhabitants.length;j++) {
				inhabitants[j] /= 2;
			}
			System.out.println("Day " + i + "\t" + Arrays.toString(inhabitants));
			i++;
		}
		System.out.println("\t-------- EXTINCT -------");
	}

}
