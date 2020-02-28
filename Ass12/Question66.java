package assignments.Ass12;

import java.util.ArrayList;
import java.util.Arrays;

public class Question66 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ints = new ArrayList<>();
		Integer[] dummy = {4,-6,3,-8,0,4,3};
		ints.addAll(Arrays.asList(dummy));
		appendPosSum(ints);
	}

	public static void appendPosSum(ArrayList<Integer> arl){
		int sum = 0;
		ArrayList<Integer> posSum = new ArrayList<>();
		for(int each:arl) {
			if(each>0) {
				sum += each;
				posSum.add(each);
			}
		}
		posSum.add(sum);
		System.out.println(posSum);
	}
}
