package assignments.Ass12;

import java.util.ArrayList;
import java.util.Random;

public class Question62 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ints =new ArrayList<>();
		Random rd = new Random();
		
		for(int i=0;i<10;i++) {
			ints.add(rd.nextInt(10));
		}
		
		total(ints);
	}
	public static int total(ArrayList<Integer> arl) {
		int sum = 0;
		for(Integer each:arl) {
			sum += each;
		}
		System.out.println(arl);
		System.out.println(sum);
		return sum;
	}

}
